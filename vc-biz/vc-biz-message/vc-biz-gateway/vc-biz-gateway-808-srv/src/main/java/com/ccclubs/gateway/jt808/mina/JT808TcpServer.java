package com.ccclubs.gateway.jt808.mina;


import com.ccclubs.gateway.jt808.dto.GpsConnection;
import com.ccclubs.gateway.jt808.inf.IJT808Server;
import org.apache.mina.core.future.WriteFuture;
import org.apache.mina.core.service.IoAcceptor;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.core.session.IoSessionConfig;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.transport.socket.nio.NioSocketAcceptor;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.net.InetSocketAddress;
import java.util.Collection;

/**
 * 基于tcp的808服务器
 */
public class JT808TcpServer implements IJT808Server {

  private static final org.slf4j.Logger logger = LoggerFactory.getLogger(JT808TcpServer.class);

  public static boolean isOpen = false;

  // private IJT808Server instance = null;

  private int port; // 服务端口号
  private int maxOfflineTime; // 终端与服务超时时间
  public IoAcceptor dataAccepter = null;
  @Resource(name = "jt808ServerHandler")
  private JT808ServerHandler jt808Handler;

  public void stop() {
    if (null != dataAccepter) {
      dataAccepter.unbind();
      dataAccepter.getFilterChain().clear(); // 清空Filter
      // chain，防止下次重新启动时出现重名错误
      dataAccepter.dispose();
      dataAccepter = null;
      // System.exit(0); 将导致容器停止
    }
  }

  /**
   * 获得当前的连接列表
   */
  public Collection<GpsConnection> getGpsConnections() {
    return getJt808Handler().getConnections();
  }

  @Override
  public boolean isOnline(String simNo) {
    if (simNo == null || simNo.length() == 0) {
      logger.error(simNo + "不能为空");
      return false;
    }
    GpsConnection conn = this.getJt808Handler().getConnection(simNo);
    if (conn != null) {
      IoSession session = getSession(conn.getSessionId());
      if (session == null) {
        logger.debug(simNo + "找不到对应的链接的session,判断离线");
      } else if (!session.isConnected()) {
        logger.debug(simNo + "session关闭,判断离线");
      } else
      // logger.error(simNo+"上线");
      {
        return session != null && session.isConnected();
      }
    } else {
      logger.debug(simNo + "没有此链接,判断离线");
    }
    return false;
  }

  /**
   * 向终端下发命令数据
   */
  public boolean send(String simNo, byte[] msg) {
    GpsConnection conn = this.getJt808Handler().getConnection(simNo);
    if (conn != null) {
      return send(conn.getSessionId(), msg);
    }
    return false;
  }

  /**
   * 向终端下发命令数据
   */
  public boolean send(long sessionId, byte[] msg) {
    try {
      IoSession session = getSession(sessionId);
      if (session != null && session.isConnected()) {
        WriteFuture wf = session.write(msg);
        wf.awaitUninterruptibly(1000);
        if (wf.isWritten()) {
          return true;
        } else {
          Throwable tr = wf.getException();
          if (tr != null) {
            logger.error(tr.getMessage(), tr);
          }

          return false;
        }

      }
    } catch (Exception ex) {
      logger.error(ex.getMessage(), ex);
    }
    return false;
  }

  public IoSession getSession(long sid) {
    return dataAccepter.getManagedSessions().get(sid);
  }

  /**
   * 启动TCP服务
   */
  public boolean start() {
//   port = GlobalConfig.paramModel.getLocalPort();
    try {
      dataAccepter = new NioSocketAcceptor();
      // 编码、解码
      dataAccepter.getFilterChain()
          .addLast("codec", new ProtocolCodecFilter(new JT808MessageCodecFactory()));
      //			dataAccepter.getFilterChain().addLast("logger", new LoggingFilter());
      //			dataAccepter.getFilterChain().addLast("codec", new ProtocolCodecFilter(new TextLineCodecFactory(Charset.forName("UTF-8"))));
      IoSessionConfig config = dataAccepter.getSessionConfig();

      config.setReadBufferSize(4096);
      config.setWriteTimeout(10000);
      config.setWriterIdleTime(100000);
      config.setIdleTime(IdleStatus.BOTH_IDLE, maxOfflineTime);
      // 业务处理
      dataAccepter.setHandler(this.getJt808Handler());

      dataAccepter.bind(new InetSocketAddress(port));
      logger.info("数据服务器启动成功!端口号:" + port);
      isOpen = true;
    } catch (Exception e) {
      isOpen = false;
      logger.error("808服务器启动失败:" + e);
      e.printStackTrace();
    }
    return isOpen;
  }

  public void setJt808Handler(JT808ServerHandler jt808Handler) {
    this.jt808Handler = jt808Handler;
  }

  public JT808ServerHandler getJt808Handler() {
    return jt808Handler;
  }

  public void setPort(int port) {
    this.port = port;
  }

  public int getPort() {
    return port;
  }

  public int getMaxOfflineTime() {
    return maxOfflineTime;
  }

  public void setMaxOfflineTime(int maxOfflineTime) {
    this.maxOfflineTime = maxOfflineTime;
  }
}
