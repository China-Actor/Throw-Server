/*    */ package client;
/*    */ 
/*    */ import com.playmore.net.cmd.CmdSearcher;
/*    */ import com.playmore.net.handler.SynchronizedHandlerContorller;
/*    */ import com.playmore.net.netty.codec.server.NettyMessageFactory;
/*    */ import com.playmore.net.netty.session.NettyKeepAliveSessionFactory;
/*    */ import com.playmore.net.netty.session.NettyKeepAliveSessionManager;
/*    */ import com.playmore.net.session.DefaultSessionIdentityMaker;
/*    */ import com.playmore.net.util.NetServiceProvider;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ClientMain
/*    */ {
/*    */   public static void main(String[] strs) {
/* 16 */     NettyMessageFactory factory = NettyMessageFactory.getDefault();
/* 17 */     DefaultSessionIdentityMaker maker = DefaultSessionIdentityMaker.getDefault();
/* 18 */     NettyKeepAliveSessionFactory sessionFactory = NettyKeepAliveSessionFactory.getDefault();
/* 19 */     sessionFactory.setIdentityMaker(maker);
/* 20 */     NettyKeepAliveSessionManager aliveSession = new NettyKeepAliveSessionManager(sessionFactory);
/* 21 */     SynchronizedHandlerContorller controller = SynchronizedHandlerContorller.getDefault();
/* 22 */     CmdSearcher cmdSearcher = new CmdSearcher("handler.s2c");
/* 23 */     controller.setCmdSearcher(cmdSearcher);
/* 24 */     NetServiceProvider provider = NetServiceProvider.getDefault();
/* 25 */     provider.setMessageFactory(factory);
/* 26 */     provider.setMessageHandler(controller);
/* 27 */     provider.setSessionManager(aliveSession);
/*    */     
/* 29 */     NettyClient.nettyClient();
/*    */   }
/*    */ }


/* Location:              G:\guajiProject\guanji\ProjectS\lib\lib\Netty_Lib-0.0.1-SNAPSHOT.jar!\client\ClientMain.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.7
 */