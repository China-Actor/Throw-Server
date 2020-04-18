/*    */ package com.playmore.net.netty.codec.server;
/*    */ 
/*    */ import com.playmore.net.cmd.CommandMessage;
/*    */ import com.playmore.net.util.NetServiceProvider;
/*    */ import io.netty.buffer.ByteBuf;
/*    */ import io.netty.channel.ChannelHandlerContext;
/*    */ import java.util.List;
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
/*    */ 
/*    */ 
/*    */ public class UnencryptedDecoder
/*    */   extends AbstractByteToMessageDecoder
/*    */ {
/* 24 */   private Logger logger = LoggerFactory.getLogger(getClass());
/*    */ 
/*    */ 
/*    */   
/*    */   protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
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
/* 86 */     out.add(message);
/*    */   }
/*    */ }


/* Location:              G:\guajiProject\guanji\ProjectS\lib\lib\Netty_Lib-0.0.1-SNAPSHOT.jar!\com\playmore\net\netty\codec\server\UnencryptedDecoder.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.7
 */