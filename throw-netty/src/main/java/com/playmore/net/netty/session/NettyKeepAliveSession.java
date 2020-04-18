/*    */ package com.playmore.net.netty.session;
/*    */ 
/*    */ import com.playmore.net.session.DefaultSessionConfig;
/*    */ import com.playmore.net.session.ISessionConfig;
/*    */ import com.playmore.net.session.ISessionHolder;
/*    */ import com.playmore.net.util.NetServiceProvider;
/*    */ import io.netty.channel.Channel;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class NettyKeepAliveSession
/*    */   extends NettySession
/*    */ {
/* 26 */   public NettyKeepAliveSession(Number id, ISessionHolder sessionHolder, Channel channel) { super(id, sessionHolder, DefaultSessionConfig.getKeepAliveInstance(), channel); }
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
/*    */   
/* 39 */   public NettyKeepAliveSession(Number id, ISessionHolder sessionHolder, ISessionConfig config, Channel channel) { super(id, sessionHolder, config, channel); }
/*    */ 
/*    */ 
/*    */   
/* 43 */   public NettyKeepAliveSession(Number id, Channel channel) { super(id, channel); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 49 */   public NettyKeepAliveSession(Number id, ISessionConfig config, Channel channel) { super(id, config, channel); }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 54 */   protected void removeFromManager() { NetServiceProvider.getDefault().getSessionManager().remove(this); }
/*    */ }


/* Location:              G:\guajiProject\guanji\ProjectS\lib\lib\Netty_Lib-0.0.1-SNAPSHOT.jar!\com\playmore\net\netty\session\NettyKeepAliveSession.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.7
 */