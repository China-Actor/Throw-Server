/*    */ package com.playmore.net.netty.session;
/*    */ 
/*    */ import com.playmore.net.session.AbstractSessionFactory;
/*    */ import com.playmore.net.session.DefaultSessionConfig;
/*    */ import com.playmore.net.session.ISession;
/*    */ import io.netty.channel.Channel;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class NettyShortConnectionSessionFactory
/*    */   extends AbstractSessionFactory
/*    */ {
/* 16 */   private static final NettyShortConnectionSessionFactory DEFAULT_INSTANCE = new NettyShortConnectionSessionFactory();
/*    */   
/* 18 */   public static NettyShortConnectionSessionFactory getDefault() { return DEFAULT_INSTANCE; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 23 */   public NettyShortConnectionSessionFactory() { setSessionConfig(DefaultSessionConfig.getShortConnectionInstance()); }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 28 */   public ISession doCreate(Object ioChannel, Number id) { return new NettyShortConnectionSession(id, getSessionConfig(), (Channel)ioChannel); }
/*    */ }


/* Location:              G:\guajiProject\guanji\ProjectS\lib\lib\Netty_Lib-0.0.1-SNAPSHOT.jar!\com\playmore\net\netty\session\NettyShortConnectionSessionFactory.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.7
 */