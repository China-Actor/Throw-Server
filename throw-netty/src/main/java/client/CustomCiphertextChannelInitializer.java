/*    */ package client;
/*    */ 
/*    */ import com.playmore.net.netty.codec.server.CustomCliphertextServerCodec;
/*    */ import io.netty.channel.Channel;
/*    */ import io.netty.channel.ChannelInitializer;
/*    */ import io.netty.channel.ChannelPipeline;
/*    */ import io.netty.channel.socket.SocketChannel;
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
/*    */ public class CustomCiphertextChannelInitializer
/*    */   extends ChannelInitializer<SocketChannel>
/*    */ {
/*    */   protected void initChannel(SocketChannel ch) throws Exception {
/* 22 */     ChannelPipeline p = ch.pipeline();
/*    */     
/* 24 */     p.addLast("codec", new CustomCliphertextServerCodec());
/* 25 */     p.addLast("handler", new SimpleClientHandler());
/*    */   }
/*    */ }


/* Location:              G:\guajiProject\guanji\ProjectS\lib\lib\Netty_Lib-0.0.1-SNAPSHOT.jar!\client\CustomCiphertextChannelInitializer.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.7
 */