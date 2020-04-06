/*     */ package com.playmore.net.netty.session;
/*     */ import java.net.SocketAddress;
/*     */ import java.util.Queue;
/*     */ import java.util.concurrent.atomic.AtomicInteger;

import com.google.protobuf.GeneratedMessageV3;
/*     */ import com.google.protobuf.Message;
/*     */ import com.playmore.net.cmd.CommandMessage;
/*     */ import com.playmore.net.netty.codec.server.IChannelConstants;
/*     */ import com.playmore.net.session.AbstractSession;
/*     */ import com.playmore.net.session.ISession;
/*     */ import com.playmore.net.session.ISessionConfig;
/*     */ import com.playmore.net.session.ISessionHolder;
import com.playmore.net.util.CheckSumUtil;

import io.netty.buffer.ByteBuf;
/*     */ import io.netty.channel.Channel;
/*     */ import io.netty.channel.ChannelFutureListener;
import io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;
/*     */ import io.netty.util.Attribute;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class NettySession
/*     */   extends AbstractSession
/*     */ {
/*     */   protected Channel channel;
/*  25 */   private int initValue = -1;
/*     */   
/*  27 */   protected AtomicInteger processingCmd = new AtomicInteger(this.initValue);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public NettySession(Number id, ISessionHolder sessionHolder, Channel channel) {
/*  38 */     super(id, sessionHolder);
/*  39 */     setIoChannel(channel);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public NettySession(Number id, ISessionHolder sessionHolder, ISessionConfig config, Channel channel) {
/*  54 */     super(id, sessionHolder, config);
/*  55 */     setIoChannel(channel);
/*     */   }
/*     */   
/*     */   public NettySession(Number id, ISessionConfig config, Channel channel) {
/*  59 */     super(id, config);
/*  60 */     setIoChannel(channel);
/*     */   }
/*     */   
/*     */   public NettySession(Number id, Channel channel) {
/*  64 */     super(id);
/*  65 */     setIoChannel(channel);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*  70 */   public boolean isOpen() { return this.channel.isOpen(); }
/*     */ 
/*     */ 
/*     */   
/*  74 */   public AtomicInteger getProcessingCmd() { return this.processingCmd; }
/*     */ 
/*     */ 
/*     */   
/*  78 */   public void resetProcessingCmd() { this.processingCmd.set(this.initValue); }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  83 */   public boolean isActive() { return this.channel.isActive(); }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  88 */   public boolean isWritable() { return this.channel.isWritable(); }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  93 */   public boolean isAutoRead() { return this.channel.config().isAutoRead(); }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  98 */   public void read() { this.channel.read(); }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void closeChannel(boolean immediately) {
/* 103 */     if (immediately) {
/* 104 */       this.channel.close();
/*     */     } else {
/* 106 */       this.channel.writeAndFlush(new CommandMessage(0, null)).addListener(
/* 107 */           ChannelFutureListener.CLOSE);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/* 113 */   public Channel getIoChannel() { return this.channel; }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIoChannel(Object ioChannel) {
/* 118 */     this.channel = (Channel)ioChannel;
/* 119 */     Attribute<ISession> attach = this.channel
/* 120 */       .attr(IChannelConstants.ISESSION_ATTRIBUTE_KEY);
/* 121 */     attach.set(this);
/* 122 */     int[] decryptKeys = (int[])this.channel.attr(
/* 123 */         IChannelConstants.DECRYPTION_KEYS_ATTRIBUTE_KEY).get();
/* 124 */     if (decryptKeys != null) {
/* 125 */       setDecryptionKeys(decryptKeys);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/* 131 */   public SocketAddress localAddress() { return this.channel.localAddress(); }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 136 */   public SocketAddress remoteAddress() { return this.channel.remoteAddress(); }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 141 */   protected void doFlush(Queue<Object> queue) { this.channel.writeAndFlush(queue); }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 146 */   protected void doWriteSingle(Object message) { this.channel.writeAndFlush(message); }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean write(Object message) {
/* 151 */     if (NettyKeepAliveSessionManager.getIntercepter() != null) {
/* 152 */       NettyKeepAliveSessionManager.getIntercepter().sendMessage(this, message);
/*     */     }
/* 154 */     this.messgeCounter.lastWrite = System.currentTimeMillis();
/* 155 */     this.channel.writeAndFlush(message);
/* 156 */     return Boolean.TRUE.booleanValue();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean write(short cmdId, GeneratedMessageV3.Builder<?> builder) {
/* 161 */     Message msg = builder.build();
/* 162 */     CommandMessage message = new CommandMessage(cmdId, msg.toByteArray());
/* 163 */     if (NettyKeepAliveSessionManager.getIntercepter() != null) {
/* 164 */       NettyKeepAliveSessionManager.getIntercepter().sendMessage(this, message, msg);
/*     */     }
/* 166 */     this.messgeCounter.lastWrite = System.currentTimeMillis();
			 
			 ByteBuf buffer = channel.alloc().buffer();
			 try {
				encode(message,buffer);
			} catch (Exception e) {
				e.printStackTrace();
			}
/* 167 */     this.channel.writeAndFlush(new BinaryWebSocketFrame(buffer));
/* 168 */     return Boolean.TRUE.booleanValue();
/*     */   }


        protected void encode( CommandMessage msg, ByteBuf out) throws Exception {
/* 23 */     int contentLength = msg.getBodyLength() + 
/* 24 */       10;
/* 25 */     out.writeShort(28987);
/* 26 */     out.writeInt(contentLength);
/* 27 */     int backWriterIndex = out.writerIndex();
/* 28 */     out.writeShort(0);
/* 29 */     out.writeShort(msg.getCommandId());
/*    */     
/* 31 */     if (msg.getBody() != null) {
/* 32 */       out.writeBytes(msg.getBody());
/*    */     }
/* 34 */     int lastWriterIndex = out.writerIndex();
/* 35 */     int checkSum = CheckSumUtil.calculate(out.nioBuffer(), 
/* 36 */         8, contentLength - 
/* 37 */         8);
/* 38 */     out.writerIndex(backWriterIndex);
/* 39 */     out.writeShort(checkSum);
/* 40 */     out.writerIndex(lastWriterIndex);
/*    */   }

/*     */ 
/*     */   
/*     */   public String toString() {
/* 173 */     StringBuilder builder = new StringBuilder();
/* 174 */     builder.append("[");
/* 175 */     if (this.id != null) {
/* 176 */       builder.append("id=");
/* 177 */       builder.append(this.id);
/* 178 */       builder.append(", ");
/*     */     } 
/* 180 */     if (this.channel != null) {
/* 181 */       builder.append("channel=");
/* 182 */       builder.append(this.channel);
/*     */     } 
/* 184 */     builder.append("]");
/* 185 */     return builder.toString();
/*     */   }
/*     */ }


/* Location:              G:\guajiProject\guanji\ProjectS\lib\lib\Netty_Lib-0.0.1-SNAPSHOT.jar!\com\playmore\net\netty\session\NettySession.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.7
 */