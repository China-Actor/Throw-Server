/*    */ package handler.c2s;
/*    */ 
/*    */ import com.playmore.net.cmd.CMD;
/*    */ import com.playmore.net.cmd.CommandMessage;
/*    */ import com.playmore.net.session.ISession;
/*    */ import protobuf.C2SLoginMsg;
/*    */ import protobuf.S2CLoginMsg;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class LoginHandler
/*    */ {
/*    */   public void login(ISession session, @CMD(cmd = 1) C2SLoginMsg.Login struct) throws Throwable {
/* 16 */     System.out.println("login");
/* 17 */     S2CLoginMsg.Login msg = S2CLoginMsg.Login.newBuilder().setIsSuccess(true).build();
/* 18 */     session.write(new CommandMessage(1, msg.toByteArray()));
/*    */   }
/*    */ 
/*    */   
/*    */   public void register(ISession session, @CMD(cmd = 2) C2SLoginMsg.Login struct) throws Throwable {
/* 23 */     System.out.println("register");
/* 24 */     S2CLoginMsg.Login msg = S2CLoginMsg.Login.newBuilder().setIsSuccess(true).build();
/* 25 */     session.write(new CommandMessage(1, msg.toByteArray()));
/*    */   }
/*    */ }


/* Location:              G:\guajiProject\guanji\ProjectS\lib\lib\Netty_Lib-0.0.1-SNAPSHOT.jar!\handler\c2s\LoginHandler.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.7
 */