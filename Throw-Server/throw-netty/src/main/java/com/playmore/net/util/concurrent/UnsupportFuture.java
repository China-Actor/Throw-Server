/*    */ package com.playmore.net.util.concurrent;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class UnsupportFuture
/*    */   implements IoSessionFuture
/*    */ {
/* 12 */   private Throwable throwable = new UnsupportedOperationException("unsupported future.");
/*    */ 
/*    */ 
/*    */   
/* 16 */   public Throwable getCause() { return this.throwable; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 21 */   public boolean isCancelled() { return false; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 26 */   public boolean isDone() { return true; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 31 */   public boolean isSuccess() { return false; }
/*    */ }


/* Location:              G:\guajiProject\guanji\ProjectS\lib\lib\Netty_Lib-0.0.1-SNAPSHOT.jar!\com\playmore\ne\\util\concurrent\UnsupportFuture.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.7
 */