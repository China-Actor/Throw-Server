/*     */ package com.playmore.net.netty.codec.server;
/*     */ 
/*     */ import com.playmore.net.cmd.CommandMessage;
/*     */ import com.playmore.net.util.EncryptionAndDecryptionUtil;
/*     */ import com.playmore.net.util.NetServiceProvider;
/*     */ import io.netty.buffer.ByteBuf;
/*     */ import io.netty.buffer.Unpooled;
/*     */ import io.netty.channel.ChannelHandlerContext;
/*     */ import java.util.List;
/*     */ import org.slf4j.Logger;
/*     */ import org.slf4j.LoggerFactory;
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
/*     */ public class CustomCiphertextDecoder
/*     */   extends AbstractByteToMessageDecoder
/*     */ {
/*  25 */   private Logger logger = LoggerFactory.getLogger(getClass());
/*     */ 
/*     */ 
/*     */   
/*     */   protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
/*  30 */     if (in.readableBytes() < 6) {
/*     */       
/*  32 */       this.logger.isWarnEnabled();
/*     */ 
/*     */       
/*     */       return;
/*     */     } 
/*     */ 
/*     */     
/*  39 */     in.markReaderIndex();
/*  40 */     int[] decryptKey = getDecryptionKeys(ctx);
/*  41 */     int flag = 0;
/*  42 */     int length = 0;
/*     */     
/*  44 */     byte[] validateData = new byte[6];
/*  45 */     in.readBytes(validateData);
/*  47 */     int[] copyDecryptKeys = new int[decryptKey.length];
/*  48 */     System.arraycopy(decryptKey, 0, copyDecryptKeys, 0, copyDecryptKeys.length);
/*     */     // ½âÃÜ
/*  50 */     validateData = EncryptionAndDecryptionUtil.decryptCustom(validateData, 
/*  51 */         copyDecryptKeys);
/*  52 */     ByteBuf validateBuf = Unpooled.wrappedBuffer(validateData);
/*     */ 
/*     */     
/*  55 */     flag = validateBuf.readShort();
/*     */     
/*  57 */     length = validateBuf.readInt();
/*  58 */     if (flag != 28987) {
/*     */       
/*  60 */       in.skipBytes(in.readableBytes());
/*  61 */       ctx.close();
/*  62 */       this.logger.warn("*1 close ctx");
/*     */       
/*     */       return;
/*     */     } 
/*  66 */     if (in.readableBytes() < 4) {
/*  67 */       this.logger.isWarnEnabled();
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  72 */       in.resetReaderIndex();
/*     */ 
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/*  78 */     if (length <= 0) {
/*  79 */       if (this.logger.isErrorEnabled()) {
/*  80 */         this.logger.error("3 channel {} content length {} is invalidate", ctx.channel(), Integer.valueOf(length));
/*     */       }
/*     */       
/*  83 */       in.skipBytes(in.readableBytes());
/*  84 */       ctx.close();
/*  85 */       this.logger.warn("*2 close ctx");
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/*  90 */     int bodyLength = length - 10;
/*  91 */     int fixLength = length - 6;
/*  92 */     if (fixLength > in.readableBytes()) {
/*  93 */       this.logger.isWarnEnabled();
/*     */ 
/*     */ 
/*     */       
/*  97 */       in.resetReaderIndex();
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/* 102 */     in.resetReaderIndex();
/*     */     
/* 104 */     EncryptionAndDecryptionUtil.decryptCustom(in.nioBuffer(), 
/* 105 */         0, length, decryptKey);
/*     */     
/* 107 */     CommandMessage message = NetServiceProvider.getDefault().getMessageFactory().create(ctx, in);
/* 108 */     if (message == null) {
/* 109 */       this.logger.warn("*3 message=null");
/*     */       
/*     */       return;
/*     */     } 
/* 113 */     out.add(message);
/*     */   }
/*     */ }


/* Location:              G:\guajiProject\guanji\ProjectS\lib\lib\Netty_Lib-0.0.1-SNAPSHOT.jar!\com\playmore\net\netty\codec\server\CustomCiphertextDecoder.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.7
 */