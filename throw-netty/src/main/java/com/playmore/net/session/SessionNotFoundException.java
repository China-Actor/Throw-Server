/*    */ package com.playmore.net.session;
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
/*    */ public class SessionNotFoundException
/*    */   extends RuntimeException
/*    */ {
/*    */   private static final long serialVersionUID = 4286398244711281984L;
/*    */   
/*    */   public SessionNotFoundException() {}
/*    */   
/* 27 */   public SessionNotFoundException(String message) { super(message); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 35 */   public SessionNotFoundException(Throwable cause) { super(cause); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 44 */   public SessionNotFoundException(String message, Throwable cause) { super(message, cause); }
/*    */ }


/* Location:              G:\guajiProject\guanji\ProjectS\lib\lib\Netty_Lib-0.0.1-SNAPSHOT.jar!\com\playmore\net\session\SessionNotFoundException.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.7
 */