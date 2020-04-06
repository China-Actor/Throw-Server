/*    */ package com.playmore.net.util;
/*    */ 
/*    */ import java.io.ByteArrayInputStream;
/*    */ import java.io.ByteArrayOutputStream;
/*    */ import java.io.ObjectInputStream;
/*    */ import java.io.ObjectOutputStream;
/*    */ 
/*    */ public class ObjectUtil
/*    */ {
/*    */   public static Object ByteToObject(byte[] bytes) {
/* 11 */     Object obj = null;
/*    */     try {
/* 13 */       ByteArrayInputStream bi = new ByteArrayInputStream(bytes);
/* 14 */       ObjectInputStream oi = new ObjectInputStream(bi);
/*    */       
/* 16 */       obj = oi.readObject();
/* 17 */       bi.close();
/* 18 */       oi.close();
/* 19 */     } catch (Exception e) {
/* 20 */       System.out.println("translation" + e.getMessage());
/* 21 */       e.printStackTrace();
/*    */     } 
/* 23 */     return obj;
/*    */   }
/*    */   
/*    */   public static byte[] ObjectToByte(Object obj) {
/* 27 */     byte[] bytes = null;
/*    */     try {
/* 29 */       ByteArrayOutputStream bo = new ByteArrayOutputStream();
/* 30 */       ObjectOutputStream oo = new ObjectOutputStream(bo);
/* 31 */       oo.writeObject(obj);
/*    */       
/* 33 */       bytes = bo.toByteArray();
/*    */       
/* 35 */       bo.close();
/* 36 */       oo.close();
/* 37 */     } catch (Exception e) {
/* 38 */       System.out.println("translation" + e.getMessage());
/* 39 */       e.printStackTrace();
/*    */     } 
/* 41 */     return bytes;
/*    */   }
/*    */ }


/* Location:              G:\guajiProject\guanji\ProjectS\lib\lib\Netty_Lib-0.0.1-SNAPSHOT.jar!\com\playmore\ne\\util\ObjectUtil.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.7
 */