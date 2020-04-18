/*    */ package com.playmore.net.netty.session;
/*    */ 
/*    */ import com.playmore.net.session.DefaultSessionConfig;
/*    */ import com.playmore.net.session.ISessionConfig;
/*    */ import com.playmore.net.session.ISessionHolder;
/*    */ import com.playmore.net.util.NetServiceProvider;
/*    */ import io.netty.channel.Channel;
/*    */ import java.net.SocketAddress;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class NettyShortConnectionSession
/*    */   extends NettySession
/*    */ {
/*    */   protected SocketAddress lastLocalAddress;
/*    */   protected SocketAddress lastRemoteAddress;
/*    */   
/* 24 */   public NettyShortConnectionSession(Number id, ISessionHolder sessionHolder, Channel channel) { super(id, sessionHolder, DefaultSessionConfig.getShortConnectionInstance(), channel); }
/*    */ 
/*    */ 
/*    */ 	
/*    */   
/* 29 */   public NettyShortConnectionSession(Number id, ISessionHolder sessionHolder, ISessionConfig config, Channel channel) { super(id, sessionHolder, config, channel); }
/*    */ 
/*    */ 
/*    */   
/* 33 */   public NettyShortConnectionSession(Number id, Channel channel) { super(id, channel); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 39 */   public NettyShortConnectionSession(Number id, ISessionConfig config, Channel channel) { super(id, config, channel); }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void channelActived(Object ioChannel) {
/* 45 */     super.channelActived(ioChannel);
/* 46 */     recordSocketAddress();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/* 51 */   public SocketAddress localAddress() { return this.lastLocalAddress; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 56 */   public SocketAddress remoteAddress() { return this.lastRemoteAddress; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private void recordSocketAddress() {
/* 63 */     this.lastLocalAddress = this.channel.localAddress();
/* 64 */     this.lastRemoteAddress = this.channel.remoteAddress();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/* 69 */   protected void removeFromManager() { NetServiceProvider.getDefault().getSessionManager().remove(this); }
/*    */ }


/* Location:              G:\guajiProject\guanji\ProjectS\lib\lib\Netty_Lib-0.0.1-SNAPSHOT.jar!\com\playmore\net\netty\session\NettyShortConnectionSession.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.7
 */