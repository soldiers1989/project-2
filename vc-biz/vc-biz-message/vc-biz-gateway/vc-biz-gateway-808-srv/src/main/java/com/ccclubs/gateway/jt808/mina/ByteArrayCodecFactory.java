package com.ccclubs.gateway.jt808.mina;

import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolCodecFactory;
import org.apache.mina.filter.codec.ProtocolDecoder;
import org.apache.mina.filter.codec.ProtocolEncoder;

import java.nio.charset.Charset;

public class ByteArrayCodecFactory implements ProtocolCodecFactory {
	
    private ByteArrayDecoder decoder;
    private JT808MessageEncoder encoder;
    
    public ByteArrayCodecFactory() {
    	encoder = new JT808MessageEncoder(Charset.forName("utf-8"));
        decoder = new ByteArrayDecoder();
    }

    @Override
    public ProtocolDecoder getDecoder(IoSession session) throws Exception {
        return decoder;
    }

    @Override
    public ProtocolEncoder getEncoder(IoSession session) throws Exception {
        return encoder;
    }

}
