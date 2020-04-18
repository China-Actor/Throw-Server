/*     */ package com.playmore.net.netty.codec.server;
/*     */ 
/*     */ import com.playmore.net.session.ISession;
/*     */ import com.playmore.net.session.ISessionManager;
/*     */ import com.playmore.net.session.SessionNotFoundException;
/*     */ import com.playmore.net.util.EncryptionAndDecryptionUtil;
/*     */ import com.playmore.net.util.NetServiceProvider;
/*     */ import io.netty.buffer.ByteBuf;
/*     */ import io.netty.channel.Channel;
/*     */ import io.netty.channel.ChannelHandlerContext;
/*     */ import io.netty.handler.codec.ByteToMessageDecoder;
/*     */ import io.netty.util.Attribute;
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
/*     */ public abstract class AbstractByteToMessageDecoder
/*     */   extends ByteToMessageDecoder
/*     */ {
/*  27 */   private Logger logger = LoggerFactory.getLogger(getClass());
/*     */ 
/*     */ 
/*     */   
/*     */   protected void callDecode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) {
/*     */     try {
/*  33 */       super.callDecode(ctx, in, out);
/*  34 */     } catch (Exception ex) {
/*  35 */       if (this.logger.isErrorEnabled()) {
/*  36 */         this.logger.error("ctx {} - channel {} - byteBuf {} - out size {}", new Object[] {
/*  37 */               ctx, ctx.channel(), in, Integer.valueOf(out.size()), ex
/*     */             });
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int[] getDecryptionKeys(ChannelHandlerContext ctx) {
/*  48 */     Channel channel = ctx.channel();
/*  49 */     Attribute<ISession> attach = channel.attr(IChannelConstants.ISESSION_ATTRIBUTE_KEY);
/*  50 */     ISession session = null;
/*  51 */     if ((session = (ISession)attach.get()) == null) {
/*     */       
/*  53 */       if (this.logger.isDebugEnabled()) {
/*  54 */         this.logger.debug("channel {} not attach session", channel);
/*     */       }
/*     */       
/*  57 */       Attribute<int[]> decryptionKeysAttribute = channel.attr(IChannelConstants.DECRYPTION_KEYS_ATTRIBUTE_KEY);
/*  58 */       int[] decryptionKeys = null;
/*  59 */       if ((decryptionKeys = (int[])decryptionKeysAttribute.get()) == null) {
/*  60 */         decryptionKeys = EncryptionAndDecryptionUtil.getDefaultCustomDecryptionKeys();
/*  61 */         decryptionKeysAttribute.set(decryptionKeys);
/*     */       } 
/*  63 */       return decryptionKeys;
/*     */     } 
/*     */     
/*  66 */     return session.getDecryptionKeys();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  75 */   protected void attach(ChannelHandlerContext ctx, ISession session) { session.setIoChannel(ctx.channel()); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void attach(ChannelHandlerContext ctx, Number sessionId) throws SessionNotFoundException {
/*  85 */     ISession session = NetServiceProvider.getDefault().getSessionManager().get(sessionId);
/*  86 */     if (session == null) {
/*  87 */       if (this.logger.isDebugEnabled()) {
/*  88 */         this.logger.debug("not found session by id {} with channel {}", sessionId, ctx.channel());
/*     */       }
/*  90 */       throw new SessionNotFoundException("session not found.");
/*     */     } 
/*  92 */     attach(ctx, session);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected ISession createSession(ChannelHandlerContext ctx, Number sessionId) {
/* 102 */     ISessionManager manager = NetServiceProvider.getDefault().getSessionManager();
/* 103 */     return manager.create(ctx.channel(), sessionId);
/*     */   }
/*     */   
/*     */   protected void decodeLast(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) {}
/*     */ }


/* Location:              G:\guajiProject\guanji\ProjectS\lib\lib\Netty_Lib-0.0.1-SNAPSHOT.jar!\com\playmore\net\netty\codec\server\AbstractByteToMessageDecoder.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.7
 */