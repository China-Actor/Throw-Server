/*    */ package pojo;
/*    */ 
/*    */ import com.playmore.net.util.ObjectUtil;
/*    */ import java.io.Serializable;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class BasePojo
/*    */   implements Serializable
/*    */ {
/*    */   private static final long serialVersionUID = 4776290663207180245L;
/*    */   
/*    */   public static Object parseFrom(byte[] bytes)
/*    */   {
/* 15 */     return ObjectUtil.ByteToObject(bytes);
/*    */   }
/*    */   
/*    */   public byte[] toByteArray() {
/* 19 */     return ObjectUtil.ObjectToByte(this);
/*    */   }
/*    */ }


/* Location:              G:\guajiProject\ProjectS\ProjectS\lib\lib\Netty_Lib-0.0.1-SNAPSHOT.jar!\pojo\BasePojo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */