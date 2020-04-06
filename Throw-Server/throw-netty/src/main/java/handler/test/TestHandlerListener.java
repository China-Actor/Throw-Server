/*    */ package handler.test;
/*    */ 
/*    */ import client.SimpleClientHandler;
/*    */ import com.playmore.net.cmd.CommandMessage;
/*    */ import pojo.SimplePojo;
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
/*    */ public class TestHandlerListener
/*    */ {
/*    */   public static void sendMsgToServer(SimpleClientHandler handler) {
/* 19 */     SimplePojo pojo = new SimplePojo();
/*    */     
/* 21 */     handler.sendMessage(new CommandMessage(3, pojo.toByteArray()));
/*    */   }
/*    */ }


/* Location:              G:\guajiProject\guanji\ProjectS\lib\lib\Netty_Lib-0.0.1-SNAPSHOT.jar!\handler\test\TestHandlerListener.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.7
 */