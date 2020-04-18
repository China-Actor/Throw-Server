/*    */ package com.playmore.net.netty.session;
/*    */ 
/*    */ import com.playmore.net.handler.SendMessageIntercepter;
/*    */ import com.playmore.net.session.DefaultSessionManager;
/*    */ import com.playmore.net.session.ISessionFactory;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class NettyKeepAliveSessionManager
/*    */   extends DefaultSessionManager
/*    */ {
/*    */   static SendMessageIntercepter intercepter;
/*    */   
/* 16 */   public NettyKeepAliveSessionManager(ISessionFactory sessionFactory) { super(sessionFactory); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 22 */   public static SendMessageIntercepter getIntercepter() { return intercepter; }
/*    */ 
/*    */ 
/*    */   
/* 26 */   public static void setIntercepter(SendMessageIntercepter intercepter) { NettyKeepAliveSessionManager.intercepter = intercepter; }
/*    */ }


/* Location:              G:\guajiProject\guanji\ProjectS\lib\lib\Netty_Lib-0.0.1-SNAPSHOT.jar!\com\playmore\net\netty\session\NettyKeepAliveSessionManager.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.7
 */