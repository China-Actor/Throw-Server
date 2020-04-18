/*    */ package com.playmore.net.cmd;
/*    */ 
/*    */ import java.io.Serializable;
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
/*    */ public class ProtocolFields
/*    */   implements Serializable
/*    */ {
/*    */   private static final long serialVersionUID = 4651962761126269482L;
/*    */   private byte encrypt;
/*    */   private short flag;
/*    */   private int length;
/*    */   private short checksum;
/*    */   
/*    */   public ProtocolFields(short flag, int length, short checksum) {
/* 27 */     this.encrypt = 0;
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
/* 47 */     this.flag = flag;
/* 48 */     this.length = length;
/* 49 */     this.checksum = checksum;
/*    */   }
/*    */ 
/*    */   
/*    */   public ProtocolFields(byte encrypt, short flag, int length, short checksum) {
/*    */     this.encrypt = 0;
/* 55 */     this.encrypt = encrypt;
/* 56 */     this.flag = flag;
/* 57 */     this.length = length;
/* 58 */     this.checksum = checksum;
/*    */   }
/*    */ 
/*    */   
/* 62 */   public byte getEncrypt() { return this.encrypt; }
/*    */ 
/*    */ 
/*    */   
/* 66 */   public short getFlag() { return this.flag; }
/*    */ 
/*    */ 
/*    */   
/* 70 */   public int getLength() { return this.length; }
/*    */ 
/*    */ 
/*    */   
/* 74 */   public short getChecksum() { return this.checksum; }
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 79 */     StringBuilder builder = new StringBuilder();
/* 80 */     builder.append("[encrypt=");
/* 81 */     builder.append(this.encrypt);
/* 82 */     builder.append(", flag=");
/* 83 */     builder.append(this.flag);
/* 84 */     builder.append(", length=");
/* 85 */     builder.append(this.length);
/* 86 */     builder.append(", checksum=");
/* 87 */     builder.append(this.checksum);
/* 88 */     builder.append("]");
/* 89 */     return builder.toString();
/*    */   }
/*    */ }


/* Location:              G:\guajiProject\guanji\ProjectS\lib\lib\Netty_Lib-0.0.1-SNAPSHOT.jar!\com\playmore\net\cmd\ProtocolFields.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.7
 */