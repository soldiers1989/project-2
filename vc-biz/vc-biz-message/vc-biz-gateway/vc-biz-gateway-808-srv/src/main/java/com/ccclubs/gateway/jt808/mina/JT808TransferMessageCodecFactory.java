package com.ccclubs.gateway.jt808.mina;

import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolCodecFactory;
import org.apache.mina.filter.codec.ProtocolDecoder;
import org.apache.mina.filter.codec.ProtocolEncoder;

import java.nio.charset.Charset;

/**
 * 用于转发的Mina Client
 * 
 */
public class JT808TransferMessageCodecFactory implements ProtocolCodecFactory {
	private final SimpleMessageDecoder decoder;
	private final JT808MessageEncoder encoder;

	public JT808TransferMessageCodecFactory() {
		this.decoder = new SimpleMessageDecoder(Charset.forName("utf-8"));
		this.encoder = new JT808MessageEncoder(Charset.forName("utf-8"));
	}

	public ProtocolDecoder getDecoder(IoSession arg0) throws Exception {
		return this.decoder;
	}

	public ProtocolEncoder getEncoder(IoSession arg0) throws Exception {
		return this.encoder;
	}
}
