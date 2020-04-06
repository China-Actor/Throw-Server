/*    */ package com.playmore.net.util;
/*    */ 
/*    */ import com.playmore.net.cmd.IMessageFactory;
/*    */ import com.playmore.net.handler.IMessageHandler;
/*    */ import com.playmore.net.handler.SynchronizedHandlerContorller;
/*    */ import com.playmore.net.session.ISession;
/*    */ import com.playmore.net.session.ISessionManager;
/*    */ import java.util.Collection;
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
/*    */ public class NetServiceProvider
/*    */ {
/*    */   private ISessionManager sessionManager;
/*    */   private IMessageFactory messageFactory;
/* 23 */   private IMessageHandler messageHandler = SynchronizedHandlerContorller.getDefault();
/* 24 */   private static final NetServiceProvider DEFAULT_INSTANCE = new NetServiceProvider();
/*    */ 
/*    */   
/* 27 */   public static NetServiceProvider getDefault() { return DEFAULT_INSTANCE; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 34 */   public ISessionManager getSessionManager() { return this.sessionManager; }
/*    */ 
/*    */ 
/*    */   
/* 38 */   public void setSessionManager(ISessionManager sessionManager) { this.sessionManager = sessionManager; }
/*    */ 
/*    */ 
/*    */   
/* 42 */   public IMessageFactory getMessageFactory() { return this.messageFactory; }
/*    */ 
/*    */ 
/*    */   
/* 46 */   public void setMessageFactory(IMessageFactory messageFactory) { this.messageFactory = messageFactory; }
/*    */ 
/*    */ 
/*    */   
/* 50 */   public IMessageHandler getMessageHandler() { return this.messageHandler; }
/*    */ 
/*    */ 
/*    */   
/* 54 */   public void setMessageHandler(IMessageHandler messageHandler) { this.messageHandler = messageHandler; }
/*    */ 
/*    */ 
/*    */   
/* 58 */   public Collection<ISession> getAllSession() { return this.sessionManager.getAll(); }
/*    */ 
/*    */ 
/*    */   
/* 62 */   public void closeAllSessions() { this.sessionManager.closeAllSessions(); }
/*    */ }


/* Location:              G:\guajiProject\guanji\ProjectS\lib\lib\Netty_Lib-0.0.1-SNAPSHOT.jar!\com\playmore\ne\\util\NetServiceProvider.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.7
 */