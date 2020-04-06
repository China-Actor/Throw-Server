/*    */ package com.playmore.net.handler;
/*    */ 
/*    */ import com.playmore.net.cmd.CommandMessage;
/*    */ import com.playmore.net.session.ISession;
/*    */ import java.lang.reflect.Method;
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
/*    */ public class SynchronizedHandlerContorller
/*    */   extends AbstractMessageHandlerContorller
/*    */ {
/* 21 */   private Logger logger = LoggerFactory.getLogger(getClass());
/*    */   
/* 23 */   private static final SynchronizedHandlerContorller DEFAULT_INSTANCE = new SynchronizedHandlerContorller();
/*    */   
/*    */   private HandlerControllerInterceptor interceptor;
/*    */   
/* 27 */   public static SynchronizedHandlerContorller getDefault() { return DEFAULT_INSTANCE; }
/*    */ 
/*    */ 
/*    */   
/* 31 */   public void setInterceptor(HandlerControllerInterceptor interceptor) { this.interceptor = interceptor; }
/*    */ 
/*    */ 
/*    */   
/*    */   protected void doHandler(Method method, Object object, Method thransMethod, ISession session, CommandMessage message) {
/*    */     long useTime;
/* 37 */     long start = System.currentTimeMillis();
/* 38 */     Object msg = null;
/*    */     try {
/* 40 */       if (this.interceptor != null) {
/* 41 */         this.interceptor.receiveMessage(method, object, thransMethod, session, message);
/*    */       }
/* 43 */       if (thransMethod != null) {
/* 44 */         msg = thransMethod.invoke(null, new Object[] { message.getBody() });
/* 45 */         if (this.interceptor != null) {
/* 46 */           this.interceptor.afterThransfer(session, message, msg);
/*    */         }
/*    */       } 
/* 49 */       if (session.getProcessingCmd().getAndSet(message.getCommandId()) != message.getCommandId()) {
/* 50 */         method.invoke(object, new Object[] { session, msg });
/* 51 */         session.resetProcessingCmd();
/*    */       } else {
/* 53 */         this.logger.info("repeated message!!" + message.getCommandId());
/*    */       } 
/* 55 */     } catch (Throwable e) {
/* 56 */       session.resetProcessingCmd();
/* 57 */       if (this.logger.isErrorEnabled()) {
/* 58 */         this.logger.error("{},{},{},{},{}", new Object[] { method, object, session, message, (e == null) ? e : e.getStackTrace() });
/* 59 */         if (e != null) e.printStackTrace(); 
/*    */       } 
/*    */     } finally {
/* 62 */        useTime = System.currentTimeMillis() - start;
/* 63 */       if (this.interceptor != null)
/* 64 */         this.interceptor.afterProcess(method, object, thransMethod, session, message, useTime); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              G:\guajiProject\guanji\ProjectS\lib\lib\Netty_Lib-0.0.1-SNAPSHOT.jar!\com\playmore\net\handler\SynchronizedHandlerContorller.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.7
 */