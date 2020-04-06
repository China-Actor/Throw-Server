/*    */ package com.playmore.net.netty.codec.server;
/*    */ 
/*    */ import com.playmore.net.cmd.CommandMessage;
/*    */ import com.playmore.net.cmd.IMessageFactory;
/*    */ import com.playmore.net.cmd.ProtocolFields;
/*    */ import com.playmore.net.util.CheckSumUtil;
/*    */ import io.netty.buffer.ByteBuf;
/*    */ import io.netty.channel.ChannelHandlerContext;
/*    */ import org.slf4j.Logger;
/*    */ import org.slf4j.LoggerFactory;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class NettyMessageFactory
/*    */   implements IMessageFactory
/*    */ {
/* 23 */   private Logger logger = LoggerFactory.getLogger(getClass());
/*    */   
/* 25 */   private static final NettyMessageFactory DEFAULT_INSTANCE = new NettyMessageFactory();
/*    */   
/* 27 */   public static NettyMessageFactory getDefault() { return DEFAULT_INSTANCE; }
/*    */ 
/*    */ 
/*    */   
/*    */   public CommandMessage create(Object channel, Object data) {
/* 32 */     ChannelHandlerContext ctx = (ChannelHandlerContext)channel;
/* 33 */     ByteBuf in = (ByteBuf)data;
/* 34 */     short flag = in.readShort();
/* 35 */     int length = in.readInt();
/* 38 */     short checksum = in.readShort();
/* 39 */     int checksumContentLength = length - 8;
/* 40 */     int bodyLength = length - 10;
/* 41 */     short calculateCheckSum = CheckSumUtil.calculate(in.nioBuffer(), 0, checksumContentLength);
/* 42 */     if (calculateCheckSum != checksum) {
/* 43 */       if (this.logger.isWarnEnabled()) {
/* 44 */         this.logger.warn(
/* 45 */             "checksum not validate client {},server {},checksum content length {}.skip current cmd message.", new Object[] {
/* 46 */               Short.valueOf(checksum), Short.valueOf(calculateCheckSum), Integer.valueOf(checksumContentLength)
/*    */             });
/*    */       }
/* 49 */       in.skipBytes(checksumContentLength);
/* 50 */       return null;
/*    */     } 
///*    */ 
/*    */     
/* 54 */     short messageId = in.readShort();
/* 55 */     if (in.isReadable()) {
/* 58 */       byte[] body = new byte[bodyLength];
/* 59 */       in.readBytes(body);
/* 60 */       return new CommandMessage(
/* 61 */           new ProtocolFields(flag, length, checksum), messageId, body);
/*    */     } 
///* 63 */     if (this.logger.isDebugEnabled())
///* 64 */       this.logger.debug("{} recev null body cmd checksum {},msgId {}", new Object[] {
///* 65 */             ctx.channel(), Short.valueOf(checksum), Short.valueOf(messageId)
///*    */           }); 
/* 67 */     return new CommandMessage(
/* 68 */         new ProtocolFields(flag, length, checksum), messageId, null);
/*    */   }
/*    */ }


/* Location:              G:\guajiProject\guanji\ProjectS\lib\lib\Netty_Lib-0.0.1-SNAPSHOT.jar!\com\playmore\net\netty\codec\server\NettyMessageFactory.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.7
 */