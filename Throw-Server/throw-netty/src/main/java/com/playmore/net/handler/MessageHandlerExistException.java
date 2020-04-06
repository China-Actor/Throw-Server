/*    */ package com.playmore.net.handler;
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
/*    */ public class MessageHandlerExistException
/*    */   extends RuntimeException
/*    */ {
/*    */   private static final long serialVersionUID = 645401111526445938L;
/*    */   
/*    */   public MessageHandlerExistException() {}
/*    */   
/* 23 */   public MessageHandlerExistException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) { super(message, cause, enableSuppression, writableStackTrace); }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 28 */   public MessageHandlerExistException(String message, Throwable cause) { super(message, cause); }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 33 */   public MessageHandlerExistException(String message) { super(message); }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 38 */   public MessageHandlerExistException(Throwable cause) { super(cause); }
/*    */ }


/* Location:              G:\guajiProject\guanji\ProjectS\lib\lib\Netty_Lib-0.0.1-SNAPSHOT.jar!\com\playmore\net\handler\MessageHandlerExistException.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.7
 */