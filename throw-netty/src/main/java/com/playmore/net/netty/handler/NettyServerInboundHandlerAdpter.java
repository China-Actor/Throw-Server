package com.playmore.net.netty.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.playmore.net.cmd.CommandMessage;
import com.playmore.net.netty.codec.server.IChannelConstants;
import com.playmore.net.netty.context.NettyServer;
import com.playmore.net.session.ISession;
import com.playmore.net.util.NetServiceProvider;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;
import io.netty.util.Attribute;

public class NettyServerInboundHandlerAdpter extends ChannelInboundHandlerAdapter {
	private Logger logger = LoggerFactory.getLogger(getClass());

	public void channelRegistered(ChannelHandlerContext ctx) throws Exception {
		if (this.logger.isDebugEnabled()) {
			this.logger.debug("channel {} registered.", ctx.channel());
		}
	}

	public void channelUnregistered(ChannelHandlerContext ctx) throws Exception {
		if (this.logger.isDebugEnabled()) {
			this.logger.debug("channel {} unregistered.", ctx.channel());
		}
	}

	public void channelActive(ChannelHandlerContext ctx) throws Exception {
		if (this.logger.isDebugEnabled()) {
			this.logger.debug("channel {} active.", ctx.channel());
		}
		if (NettyServer.getDefault().getStatus() != 2) {
			this.logger.warn("server is not at running status.[status = {}]", Byte.valueOf(NettyServer.getDefault().getStatus()));
			ctx.close();
			return;
		}
	}

	public void channelInactive(ChannelHandlerContext ctx) throws Exception {
		if (this.logger.isDebugEnabled()) {
			this.logger.debug("channel {} inactive.", ctx.channel());
		}
		ISession session = (ISession) ctx.channel().attr(IChannelConstants.ISESSION_ATTRIBUTE_KEY).get();
		if (session != null) {
			session.channelClosed();
		}
		super.channelInactive(ctx);
	}

	public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {

		// ctx.writeAndFlush(new TextWebSocketFrame("NettyServerInboundHandlerAdpter"));

		if (NettyServer.getDefault().getStatus() != 2) {
			this.logger.warn("server is not at running status.[status = {}]", Byte.valueOf(NettyServer.getDefault().getStatus()));
			ctx.close();
			return;
		}
		if (this.logger.isDebugEnabled()) {
			this.logger.debug("channel {} read msg {}.", ctx.channel(), msg);
		}

		Attribute<ISession> sessionAttribute = ctx.channel().attr(IChannelConstants.ISESSION_ATTRIBUTE_KEY);
		ISession session = (ISession) sessionAttribute.get();

		if (session == null) {
			if (this.logger.isDebugEnabled()) {
				this.logger.debug("channel {} not bound session", ctx.channel());
			}

			session = NetServiceProvider.getDefault().getSessionManager().create(ctx.channel(), null);
		}

		CommandMessage _decodeMsg = null;
		if (msg instanceof BinaryWebSocketFrame) {
			BinaryWebSocketFrame binaryFrame = (BinaryWebSocketFrame) msg;
			if (!binaryFrame.isFinalFragment())
				return;

			_decodeMsg = decode(ctx, binaryFrame.content());
		}

		if (_decodeMsg != null) {
			try {
				NetServiceProvider.getDefault().getMessageHandler().handle(session, _decodeMsg);
			} catch (Throwable e) {
				if (this.logger.isErrorEnabled()) {
					this.logger.error("channel {} can't process msg {}.", ctx.channel(), msg);
				}
			}

		} else if (this.logger.isErrorEnabled()) {
			this.logger.error("channel {} can't process msg {}.", ctx.channel(), msg);
		}
	}

	protected CommandMessage decode(ChannelHandlerContext ctx, ByteBuf in) throws Exception {
		if (in.readableBytes() < 10) {
			if (this.logger.isWarnEnabled()) {
				this.logger.warn("channel {} ,{} not enough head size {}",
						new Object[] { ctx.channel(), Integer.valueOf(in.readableBytes()), Short.valueOf((short) 10) });
			}

			return null;
		}
		in.markReaderIndex();

		short flag = in.readShort();
		if (flag != 28987) {
			if (this.logger.isWarnEnabled()) {
				this.logger.warn("channel {} head flag {} is not validate {},close netty channel.",
						new Object[] { ctx.channel(), Short.valueOf(flag), Short.valueOf((short) 28987) });
			}

			in.skipBytes(in.readableBytes());
			ctx.close();

			return null;
		}

		int length = in.readInt();

		length &= 0xFFFF;
		if (length <= 0) {
			if (this.logger.isWarnEnabled()) {
				this.logger.warn("channel {} content length {} is invalidate", ctx.channel(), Integer.valueOf(length));
			}

			in.readerIndex(in.writerIndex());
			ctx.close();

			return null;
		}
		int bodyLength = length - 10;
		int fixLength = length - 6;
		if (fixLength > in.readableBytes()) {
			if (this.logger.isWarnEnabled()) {
				this.logger.warn("channel {} message length {},body length {},remaining bytes {},fix length {}", new Object[] { ctx.channel(),
						Integer.valueOf(length), Integer.valueOf(bodyLength), Integer.valueOf(in.readableBytes()), Integer.valueOf(fixLength) });
			}
			in.resetReaderIndex();

			return null;
		}
		in.resetReaderIndex();
		CommandMessage message = NetServiceProvider.getDefault().getMessageFactory().create(ctx, in);
		return message;

	}

	public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
		ctx.flush();
		if (this.logger.isDebugEnabled()) {
			this.logger.debug("channel {} read complete.", ctx.channel());
		}
	}

	public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
		if (this.logger.isDebugEnabled()) {
			this.logger.debug("channel {} user event {} triggered.", ctx.channel(), evt);
		}
	}

	public void channelWritabilityChanged(ChannelHandlerContext ctx) throws Exception {
		if (this.logger.isDebugEnabled()) {
			this.logger.debug("channel {} writeablility changed.", ctx.channel());
		}
	}

	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
		if (this.logger.isErrorEnabled()) {
			this.logger.error("channel {} exception caught.[{}]", ctx.channel(), cause.getMessage());
		}
		cause.printStackTrace();

		ctx.channel().close();
	}
}

/*
 * Location:
 * G:\guajiProject\guanji\ProjectS\lib\lib\Netty_Lib-0.0.1-SNAPSHOT.jar!\com\
 * playmore\net\netty\handler\NettyServerInboundHandlerAdpter.class Java
 * compiler version: 7 (51.0) JD-Core Version: 1.0.7
 */