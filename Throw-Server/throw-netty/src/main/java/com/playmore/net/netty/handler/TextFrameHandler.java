package com.playmore.net.netty.handler;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;

public class TextFrameHandler extends SimpleChannelInboundHandler<TextWebSocketFrame> {

 @Override
	protected void channelRead0(ChannelHandlerContext arg0, TextWebSocketFrame arg1) throws Exception {
		System.out.println(arg1);
	}
	
 @Override
	public void channelRead(ChannelHandlerContext arg0, Object arg1) throws Exception {
		// TODO Auto-generated method stub
		super.channelRead(arg0, arg1);
	}
 
 
}
