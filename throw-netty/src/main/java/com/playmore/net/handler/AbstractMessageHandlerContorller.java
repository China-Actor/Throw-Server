/*    */ package com.playmore.net.handler;
/*    */ 
/*    */ import com.playmore.net.cmd.CmdSearcher;
/*    */ import com.playmore.net.cmd.CommandMessage;
/*    */ import com.playmore.net.session.ISession;
/*    */ import com.playmore.net.session.MessageCounter;
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
/*    */ public abstract class AbstractMessageHandlerContorller
/*    */   implements IMessageHandler
/*    */ {
/* 23 */   private Logger logger = LoggerFactory.getLogger(getClass());
/*    */   
/* 25 */   private CmdSearcher search = null;
/*    */ 
/*    */   
/* 28 */   public void setCmdSearcher(CmdSearcher search) { this.search = search; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void handle(ISession session, CommandMessage message) throws Exception {
/*    */     try {
/* 36 */       refreshSessionReaderCounter(session, message);
/*    */       
/* 38 */       Method method = (Method)this.search.getMethedMap().get(Short.valueOf(message.getCommandId()));
/*    */       
/* 40 */       Object object = this.search.getObjectMap().get(Short.valueOf(message.getCommandId()));
/*    */       
/* 42 */       Method thransMethod = (Method)this.search.getMsgClassMap().get(Short.valueOf(message.getCommandId()));
/* 44 */       doHandler(method, object, thransMethod, session, message);
/*    */     }
/* 46 */     catch (Throwable ex) {
/* 47 */       this.logger.error("cmdId {},{},{}", new Object[] { Short.valueOf(message.getCommandId()), session, ex });
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private void refreshSessionReaderCounter(ISession session, CommandMessage message) throws Exception {
/* 55 */     if (session == null) {
/*    */       return;
/*    */     }
/* 58 */     MessageCounter counter = session.getMessgeCounter();
/* 59 */     counter.lastRead = System.currentTimeMillis();
/* 60 */     counter.readMessages++;
/* 61 */     counter.readBytes += (message.getBodyLength() + 
/* 62 */       10);
/*    */   }
/*    */   
/*    */   protected abstract void doHandler(Method paramMethod1, Object paramObject, Method paramMethod2, ISession paramISession, CommandMessage paramCommandMessage);
/*    */ }


/* Location:              G:\guajiProject\guanji\ProjectS\lib\lib\Netty_Lib-0.0.1-SNAPSHOT.jar!\com\playmore\net\handler\AbstractMessageHandlerContorller.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.7
 */