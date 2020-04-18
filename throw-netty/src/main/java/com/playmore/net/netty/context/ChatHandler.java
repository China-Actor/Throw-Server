package com.playmore.net.netty.context;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import io.netty.util.concurrent.GlobalEventExecutor;

/**
 * 
 * @Description: ������Ϣ��handler TextWebSocketFrame��
 *               ��netty�У�������Ϊwebsocketר�Ŵ����ı��Ķ���frame����Ϣ������
 */
public class ChatHandler extends SimpleChannelInboundHandler<TextWebSocketFrame> {

	// ���ڼ�¼�͹������пͻ��˵�channle
	public static ChannelGroup users = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);

	
	
	@Override
	protected void channelRead0(ChannelHandlerContext ctx, TextWebSocketFrame msg) throws Exception {
		// ��ȡ�ͻ��˴����������Ϣ
		String content = msg.text();
		System.out.println(content);
		Channel currentChannel = ctx.channel();

		currentChannel.writeAndFlush(new TextWebSocketFrame("NettyServerInboundHandlerAdpter"));
	}

	/**
	 * ���ͻ������ӷ����֮�󣨴����ӣ� ��ȡ�ͻ��˵�channle�����ҷŵ�ChannelGroup��ȥ���й���
	 */
	@Override
	public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
		users.add(ctx.channel());
	}

	@Override
	public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {

		// ������handlerRemoved��ChannelGroup���Զ��Ƴ���Ӧ�ͻ��˵�channel
		users.remove(ctx.channel());
	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
		cause.printStackTrace();
		// �����쳣֮��ر����ӣ��ر�channel��������ChannelGroup���Ƴ�
		ctx.channel().close();
		users.remove(ctx.channel());
	}
}
