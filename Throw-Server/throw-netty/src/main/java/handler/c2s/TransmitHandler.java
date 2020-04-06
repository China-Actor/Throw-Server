/*    */ package handler.c2s;
/*    */ 
/*    */ import com.playmore.net.cmd.CMD;
/*    */ import com.playmore.net.cmd.CommandMessage;
/*    */ import com.playmore.net.session.ISession;
/*    */ import pojo.SimplePojo;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class TransmitHandler
/*    */ {
/*    */   public void Transmit(ISession session, @CMD(cmd = 3) SimplePojo struct) throws Throwable {
/* 15 */     System.out.println("Transmit");
/* 16 */     SimplePojo s2c = new SimplePojo();
/* 17 */     System.out.println("id=" + s2c.getId() + " name" + s2c.getName());
/* 18 */     session.write(new CommandMessage(3, s2c.toByteArray()));
/*    */   }
/*    */ }


/* Location:              G:\guajiProject\guanji\ProjectS\lib\lib\Netty_Lib-0.0.1-SNAPSHOT.jar!\handler\c2s\TransmitHandler.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.7
 */