package com.playmore.net.netty.handler;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;

public class BinaryFrameHandler extends SimpleChannelInboundHandler<BinaryWebSocketFrame> {

 @Override
protected void channelRead0(ChannelHandlerContext ctx, BinaryWebSocketFrame msg) throws Exception {
	System.out.println(msg);
}
 
 
}
