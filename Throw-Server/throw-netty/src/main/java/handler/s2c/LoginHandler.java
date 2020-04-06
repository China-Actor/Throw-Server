/*    */ package handler.s2c;
/*    */ 
/*    */ import com.playmore.net.cmd.CMD;
/*    */ import com.playmore.net.session.ISession;
/*    */ import protobuf.S2CLoginMsg;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class LoginHandler
/*    */ {
/* 14 */   public void doHandle(ISession session, @CMD(cmd = 1) S2CLoginMsg.Login struct) throws Throwable { System.out.println("2222222222"); }
/*    */ }


/* Location:              G:\guajiProject\guanji\ProjectS\lib\lib\Netty_Lib-0.0.1-SNAPSHOT.jar!\handler\s2c\LoginHandler.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.7
 */