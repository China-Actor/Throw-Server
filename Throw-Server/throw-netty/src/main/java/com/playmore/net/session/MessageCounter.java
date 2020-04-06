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
/*    */ public class MessageCounter
/*    */ {
/*    */   public long readBytes;
/*    */   public long writeBytes;
/*    */   public int readMessages;
/*    */   public int writeMessages;
/*    */   public long lastRead;
/*    */   public long lastWrite;
/*    */   
/*    */   public MessageCounter() {
/* 40 */     this.lastRead = System.currentTimeMillis();
/* 41 */     this.lastWrite = System.currentTimeMillis();
/*    */   }
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
/*    */   public MessageCounter(long readBytes, long writeBytes, int readMessages, int writeMessages, long lastRead, long lastWrite) {
/* 55 */     this.readBytes = readBytes;
/* 56 */     this.writeBytes = writeBytes;
/* 57 */     this.readMessages = readMessages;
/* 58 */     this.writeMessages = writeMessages;
/* 59 */     this.lastRead = lastRead;
/* 60 */     this.lastWrite = lastWrite;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 65 */     StringBuilder builder = new StringBuilder();
/* 66 */     builder.append("[readBytes=").append(this.readBytes)
/* 67 */       .append(", writeBytes=").append(this.writeBytes)
/* 68 */       .append(", readMessages=").append(this.readMessages)
/* 69 */       .append(", writeMessages=").append(this.writeMessages)
/* 70 */       .append(", lastRead=").append(this.lastRead).append(", lastWrite=")
/* 71 */       .append(this.lastWrite).append("]");
/* 72 */     return builder.toString();
/*    */   }
/*    */ }


/* Location:              G:\guajiProject\guanji\ProjectS\lib\lib\Netty_Lib-0.0.1-SNAPSHOT.jar!\com\playmore\net\session\MessageCounter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.7
 */