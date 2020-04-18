/*    */ package com.playmore.net.util;
/*    */ 
/*    */ import java.nio.ByteBuffer;
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
/*    */ public class CheckSumUtil
/*    */ {
/* 22 */   public static short calculate(byte[] data) { return calculate(data, 0, data.length); }
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
/*    */   public static short calculate(byte[] data, int startIndex, int length) {
/* 34 */     int val = 119;
/* 35 */     int index = startIndex;
/* 36 */     int endIndex = startIndex + length;
/* 37 */     while (index < endIndex)
/*    */     {
/* 39 */       val += (data[index++] & 0xFF);
/*    */     }
/* 41 */     return (short)(val & 0x7F7F);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 50 */   public static short calculate(ByteBuffer buffer) { return calculate(buffer, buffer.remaining()); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static short calculate(ByteBuffer buffer, int startIndex, int length) {
/* 61 */     int bakIndex = buffer.position();
/*    */     try {
/* 63 */       buffer.position(startIndex);
/* 64 */       return calculate(buffer, length);
/*    */     } finally {
/* 66 */       buffer.position(bakIndex);
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static short calculate(ByteBuffer buffer, int length) {
/* 77 */    int bakIndex = buffer.position();
/*    */     try {
/* 79 */       int val = 119;
/* 80 */       int i = 0;
/* 81 */       while (buffer.hasRemaining() && i++ < length)
/*    */       {
/* 83 */         val += (buffer.get() & 0xFF);
/*    */       }
/* 85 */       return (short)(val & 0x7F7F);
/*    */     } finally {
/* 87 */       buffer.position(bakIndex);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              G:\guajiProject\guanji\ProjectS\lib\lib\Netty_Lib-0.0.1-SNAPSHOT.jar!\com\playmore\ne\\util\CheckSumUtil.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.7
 */