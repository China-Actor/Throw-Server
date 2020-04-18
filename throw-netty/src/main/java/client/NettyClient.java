/*    */ package client;
/*    */ 
/*    */ import io.netty.bootstrap.Bootstrap;
/*    */ import io.netty.channel.ChannelFuture;
/*    */ import io.netty.channel.ChannelInitializer;
/*    */ import io.netty.channel.ChannelOption;
/*    */ import io.netty.channel.nio.NioEventLoopGroup;
/*    */ import io.netty.channel.socket.SocketChannel;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class NettyClient
/*    */ {
/* 14 */   private ChannelInitializer<SocketChannel> channelInitializer = null;
/*    */   
/*    */   private boolean enableEncrypted = true;
/*    */ 
/*    */   
/*    */   public void connect(int port, String host) {
/* 20 */    NioEventLoopGroup nioEventLoopGroup = new NioEventLoopGroup();
/*    */     
/*    */     try {
/* 23 */       Bootstrap bootstrap = new Bootstrap();
/*    */       
/* 25 */       if (this.channelInitializer == null) {
/* 26 */         if (this.enableEncrypted) {
/* 27 */           this.channelInitializer = new CustomCiphertextChannelInitializer();
/*    */         } else {
/* 29 */           this.channelInitializer = new UnecryptedChannelInitializer();
/*    */         } 
/*    */       }
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
/* 43 */       ((Bootstrap)((Bootstrap)((Bootstrap)bootstrap.group(nioEventLoopGroup)).channel(io.netty.channel.socket.nio.NioSocketChannel.class))
/* 44 */         .option(ChannelOption.TCP_NODELAY, Boolean.valueOf(true)))
/* 45 */         .handler(this.channelInitializer);
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
/*    */ 
/*    */ 
/*    */       
/* 64 */       ChannelFuture channelFuture = bootstrap.connect(host, port).sync();
/*    */       
/* 66 */       channelFuture.channel().closeFuture().sync();
/* 67 */     } catch (InterruptedException e) {
/*    */       
/* 69 */       e.printStackTrace();
/*    */     } finally {
/*    */       
/* 72 */       nioEventLoopGroup.shutdownGracefully();
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */   
/* 78 */   public static void nettyClient() { (new NettyClient()).connect(8800, "192.168.76.51"); }
/*    */ }


/* Location:              G:\guajiProject\guanji\ProjectS\lib\lib\Netty_Lib-0.0.1-SNAPSHOT.jar!\client\NettyClient.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.7
 */