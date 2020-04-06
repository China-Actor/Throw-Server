/*     */ package com.playmore.net.util;
/*     */ 
/*     */ import java.nio.ByteBuffer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class EncryptionAndDecryptionUtil
/*     */ {
/*  18 */   private static final int[] DEFAULT_CUSTOME_DECRYPTION_KEYS = { 173, 104, 55, 162, 160, 128, 221, 241 };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  24 */   private static final int[] DEFAULT_CUSTOME_ENCRYPTION_KEYS = { 173, 104, 55, 162, 160, 128, 221, 241 };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int[] getDefaultCustomDecryptionKeys() {
/*  32 */    int[] keys = new int[DEFAULT_CUSTOME_DECRYPTION_KEYS.length];
/*  33 */     System.arraycopy(DEFAULT_CUSTOME_DECRYPTION_KEYS, 0, keys, 0, 
/*  34 */         keys.length);
/*  35 */     return keys;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int[] getDefaultCustomEncryptionKeys() {
/*  44 */      int[] keys = new int[DEFAULT_CUSTOME_ENCRYPTION_KEYS.length];
/*  45 */     System.arraycopy(DEFAULT_CUSTOME_ENCRYPTION_KEYS, 0, keys, 0, 
/*  46 */         keys.length);
/*  47 */     return keys;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  62 */   public static byte[] decryptCustom(byte[] data, int[] decryptKey) throws KeyIllegalException { return decryptCustom(data, 0, data.length, decryptKey); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static byte[] decryptCustom(byte[] data, int startIndex, int length, int[] decryptKey) throws KeyIllegalException {
/*  81 */     if (length == 0) {
/*  82 */       return data;
/*     */     }
/*  84 */     if (decryptKey.length < 8) {
/*  85 */       throw new KeyIllegalException(
/*  86 */           "The decryptKey must be 64bits length!");
/*     */     }
/*  88 */     int lastCipherByte = 0;
/*  89 */     int oldVal = 0;
/*     */     
/*  91 */     int tmpIndex = 0;
/*  92 */     int keyIndex = 0;
/*  93 */     for (int index = 0; index < length; index++) {
/*  94 */       tmpIndex = startIndex + index;
/*  95 */       keyIndex = index & 0x7;
/*  96 */       oldVal = data[tmpIndex];
/*  97 */       decryptKey[keyIndex] = decryptKey[keyIndex] + lastCipherByte ^ index;
/*  98 */       data[tmpIndex] = (byte)(((data[index] & 0xFF) - lastCipherByte ^ decryptKey[keyIndex]) & 0xFF);
/*  99 */       lastCipherByte = oldVal;
/*     */     } 
/*     */     
/* 102 */     return data;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 118 */   public static ByteBuffer decryptCustom(ByteBuffer buffer, int[] decryptKey) throws KeyIllegalException { return decryptCustom(buffer, buffer.remaining(), decryptKey); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static ByteBuffer decryptCustom(ByteBuffer buffer, int startIndex, int length, int[] decryptKey) throws KeyIllegalException {
/* 137 */     int indexMark = buffer.position();
/*     */     try {
/* 139 */       buffer.position(startIndex);
/* 140 */       return decryptCustom(buffer, length, decryptKey);
/* 141 */     } catch (Exception ex) {
/* 142 */       ex.printStackTrace();
/* 143 */       return null;
/*     */     } finally {
/* 145 */       buffer.position(indexMark);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static ByteBuffer decryptCustom(ByteBuffer buffer, int length, int[] decryptKey) throws KeyIllegalException {
/* 163 */     if (length == 0) {
/* 164 */       return buffer;
/*     */     }
/* 166 */     if (decryptKey.length < 8) {
/* 167 */       throw new KeyIllegalException(
/* 168 */           "The decryptKey must be 64bits length!");
/*     */     }
/* 170 */     int lastCipherByte = 0;
/*     */     
/* 172 */     int indexMark = buffer.position();
/*     */     try {
/* 174 */       int oldVal = 0;
/* 175 */       int value = 0;
/* 176 */       int keyIndex = 0;
/* 177 */       for (int index = 0; index < length; index++) {
/* 178 */         keyIndex = index & 0x7;
/* 179 */         oldVal = buffer.get();
/* 180 */         decryptKey[keyIndex] = decryptKey[keyIndex] + lastCipherByte ^ index;
/* 181 */         value = (byte)(((oldVal & 0xFF) - lastCipherByte ^ decryptKey[keyIndex]) & 0xFF);
/* 182 */         lastCipherByte = oldVal;
/* 183 */         putToPrevPosition(buffer, (byte)value);
/*     */       } 
/*     */       
/* 186 */       return buffer;
/*     */     } finally {
/* 188 */       buffer.position(indexMark);
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void putToPrevPosition(ByteBuffer buffer, int value) {
/* 193 */     buffer.position(buffer.position() - 1);
/* 194 */     buffer.put((byte)value);
/*     */   }
/*     */ 
/*     */   
/* 198 */   public static void encrypt(ByteBuffer buffer, int[] keys) { encryptCustom(buffer, keys, buffer.remaining()); }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void encryptCustom(ByteBuffer buffer, int[] keys, int startIndex, int length) {
/* 203 */     int indexMark = buffer.position();
/*     */     try {
/* 205 */       buffer.position(startIndex);
/* 206 */       encryptCustom(buffer, keys, length);
/*     */     } finally {
/* 208 */       buffer.position(indexMark);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void encryptCustom(ByteBuffer buffer, int[] keys, int length) {
/* 213 */     int lastCipherByte = 0;
/* 214 */     int keyIndex = 0;
/* 215 */     byte tmpVal = 0;
/* 216 */     int indexMark = buffer.position();
/*     */     try {
/* 218 */       for (int i = 0; i < length; i++) {
/* 219 */         keyIndex = i & 0x7;
/* 220 */         tmpVal = buffer.get();
/* 221 */         keys[keyIndex] = (keys[keyIndex] + lastCipherByte ^ i) & 0xFF;
/* 222 */         lastCipherByte = ((tmpVal ^ keys[keyIndex]) & 0xFF) + lastCipherByte & 0xFF;
/* 223 */         putToPrevPosition(buffer, lastCipherByte);
/*     */       } 
/*     */     } finally {
/* 226 */       buffer.position(indexMark);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/* 231 */   public static void encryptCustom(byte[] data, int[] keys) { encryptCustom(data, keys, 0, data.length); }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void encryptCustom(byte[] data, int[] keys, int startIndex, int length) {
/* 236 */     int lastCipherByte = 0;
/*     */ 
/*     */     
/* 239 */     int keyIndex = 0;
/* 240 */     int tempIndex = 0;
/* 241 */     for (int i = 0; i < length; i++) {
/* 242 */       keyIndex = i & 0x7;
/* 243 */       tempIndex = i + startIndex;
/* 244 */       keys[keyIndex] = (keys[keyIndex] + lastCipherByte ^ i) & 0xFF;
/* 245 */       lastCipherByte = ((data[tempIndex] ^ keys[keyIndex]) & 0xFF) + lastCipherByte & 0xFF;
/* 246 */       data[tempIndex] = (byte)lastCipherByte;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              G:\guajiProject\guanji\ProjectS\lib\lib\Netty_Lib-0.0.1-SNAPSHOT.jar!\com\playmore\ne\\util\EncryptionAndDecryptionUtil.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.7
 */