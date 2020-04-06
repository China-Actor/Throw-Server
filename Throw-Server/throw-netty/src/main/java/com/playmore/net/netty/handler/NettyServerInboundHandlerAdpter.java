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
 
 
 
 
 
 
 
 
 
 public class NettyServerInboundHandlerAdpter
   extends ChannelInboundHandlerAdapter
 {
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
     ISession session = (ISession)ctx.channel().attr(IChannelConstants.ISESSION_ATTRIBUTE_KEY).get();
     if (session != null) {
       session.channelClosed();
     }
     super.channelInactive(ctx);
   }
 
   
   public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
	  
	 //ctx.writeAndFlush(new TextWebSocketFrame("NettyServerInboundHandlerAdpter"));
 
     if (NettyServer.getDefault().getStatus() != 2) {
       this.logger.warn("server is not at running status.[status = {}]", Byte.valueOf(NettyServer.getDefault().getStatus()));
       ctx.close();
       return;
     } 
     if (this.logger.isDebugEnabled()) {
       this.logger.debug("channel {} read msg {}.", ctx.channel(), msg);
     }
     
     Attribute<ISession> sessionAttribute = ctx.channel().attr(IChannelConstants.ISESSION_ATTRIBUTE_KEY);
     ISession session = (ISession)sessionAttribute.get();
     
     if (session == null) {
       if (this.logger.isDebugEnabled()) {
         this.logger.debug("channel {} not bound session", ctx.channel());
       }
       
       session = NetServiceProvider.getDefault().getSessionManager().create(ctx.channel(), null);
     } 
 
     if(msg instanceof BinaryWebSocketFrame)
     {
    	 BinaryWebSocketFrame binaryFrame=(BinaryWebSocketFrame)msg;
    	 if(!binaryFrame.isFinalFragment())
    		 return;
    	 
         // ����decode 
         decode(ctx,binaryFrame.content());
     }
     

     
     
     
     if (msg instanceof CommandMessage) {
       try {
         NetServiceProvider.getDefault().getMessageHandler()
           .handle(session, (CommandMessage)msg);
       } catch (Throwable e) {
         if (this.logger.isErrorEnabled()) {
           this.logger.error("channel {} can't process msg {}.", ctx.channel(), msg);
         }
       }
     
     } else if (this.logger.isErrorEnabled()) {
       this.logger.error("channel {} can't process msg {}.", ctx.channel(), msg);
     }
   }
 
   protected void decode(ChannelHandlerContext ctx, ByteBuf in) throws Exception {
/* 29 */     if (in.readableBytes() < 10) {
/* 30 */       if (this.logger.isWarnEnabled()) {
/* 31 */         this.logger.warn("channel {} ,{} not enough head size {}", new Object[] { ctx.channel(), Integer.valueOf(in.readableBytes()), 
/* 32 */               Short.valueOf((short)10) });
/*    */       }
/*    */       
/*    */       return;
/*    */     } 
/* 37 */     in.markReaderIndex();
/*    */ 
/*    */     
/* 40 */     short flag = in.readShort();
/* 41 */     if (flag != 28987) {
/* 42 */       if (this.logger.isWarnEnabled()) {
/* 43 */         this.logger.warn(
/* 44 */             "channel {} head flag {} is not validate {},close netty channel.", new Object[] { ctx.channel(), 
/* 45 */               Short.valueOf(flag), Short.valueOf((short)28987) });
/*    */       }
/*    */       
/* 48 */       in.skipBytes(in.readableBytes());
/* 49 */       ctx.close();
/*    */ 
/*    */       
/*    */       return;
/*    */     } 
/*    */     
/* 55 */     int length = in.readInt();
/*    */     
/* 57 */     length &= 0xFFFF;
/* 58 */     if (length <= 0) {
/* 59 */       if (this.logger.isWarnEnabled()) {
/* 60 */         this.logger.warn("channel {} content length {} is invalidate", ctx.channel(), Integer.valueOf(length));
/*    */       }
/*    */       
/* 63 */       in.readerIndex(in.writerIndex());
/* 64 */       ctx.close();
/*    */       
/*    */       return;
/*    */     } 
/* 68 */     int bodyLength = length - 10;
/* 69 */     int fixLength = length - 6;
/* 70 */     if (fixLength > in.readableBytes()) {
/* 71 */       if (this.logger.isWarnEnabled()) {
/* 72 */         this.logger.warn(
/* 73 */             "channel {} message length {},body length {},remaining bytes {},fix length {}", new Object[] { ctx.channel(), 
/* 74 */               Integer.valueOf(length), Integer.valueOf(bodyLength), Integer.valueOf(in.readableBytes()), Integer.valueOf(fixLength) });
/*    */       }
/* 76 */       in.resetReaderIndex();
/*    */       
/*    */       return;
/*    */     } 
/* 80 */     in.resetReaderIndex();
/* 81 */     CommandMessage message = NetServiceProvider.getDefault()
/* 82 */       .getMessageFactory().create(ctx, in);
/* 83 */     if (message == null) {
/*    */       return;
/*    */     }
/*    */   }
 
   
   public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
     ctx.flush();
     if (this.logger.isDebugEnabled()) {
       this.logger.debug("channel {} read complete.", ctx.channel());
     }
   }
 
 
 
   
   public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
     if (this.logger.isDebugEnabled()) {
       this.logger.debug("channel {} user event {} triggered.", ctx.channel(), 
           evt);
     }
   }
 
 
 
   
   public void channelWritabilityChanged(ChannelHandlerContext ctx) throws Exception {
     if (this.logger.isDebugEnabled()) {
       this.logger.debug("channel {} writeablility changed.", ctx.channel());
     }
   }
 
 
 
   
   public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
     if (this.logger.isErrorEnabled()) {
       this.logger.error("channel {} exception caught.[{}]", ctx.channel(), 
           cause.getMessage());
     }
     
     ctx.channel().close();
   }
 }


/* Location:              G:\guajiProject\guanji\ProjectS\lib\lib\Netty_Lib-0.0.1-SNAPSHOT.jar!\com\playmore\net\netty\handler\NettyServerInboundHandlerAdpter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.7
 */