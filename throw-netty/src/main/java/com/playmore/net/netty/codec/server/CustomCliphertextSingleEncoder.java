/*    */ package com.playmore.net.netty.codec.server;
/*    */ 
/*    */ import com.playmore.net.cmd.CommandMessage;
/*    */ import com.playmore.net.session.ISession;
/*    */ import com.playmore.net.util.EncryptionAndDecryptionUtil;
/*    */ import io.netty.buffer.ByteBuf;
/*    */ import io.netty.channel.ChannelHandlerContext;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class CustomCliphertextSingleEncoder
/*    */   extends UnencryptedSingleMessageEncoder
/*    */ {
/*    */   protected void encode(ChannelHandlerContext ctx, CommandMessage msg, ByteBuf out) throws Exception {
/*    */     int[] encryptKeys;
/* 21 */     super.encode(ctx, msg, out);
/*    */     
/* 23 */     if (ctx.channel().attr(IChannelConstants.ISESSION_ATTRIBUTE_KEY) == null || 
/* 24 */       ctx.channel().attr(IChannelConstants.ISESSION_ATTRIBUTE_KEY).get() == null) {
/* 25 */       encryptKeys = EncryptionAndDecryptionUtil.getDefaultCustomEncryptionKeys();
/*    */     } else {
/* 27 */       encryptKeys = ((ISession)ctx.channel()
/* 28 */         .attr(IChannelConstants.ISESSION_ATTRIBUTE_KEY).get())
/* 29 */         .getEncryptionKeys();
/*    */     } 
/*    */     
/* 32 */     EncryptionAndDecryptionUtil.encryptCustom(out.nioBuffer(), encryptKeys, 
/* 33 */         out.readableBytes());
/*    */   }
/*    */ }


/* Location:              G:\guajiProject\guanji\ProjectS\lib\lib\Netty_Lib-0.0.1-SNAPSHOT.jar!\com\playmore\net\netty\codec\server\CustomCliphertextSingleEncoder.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.7
 */