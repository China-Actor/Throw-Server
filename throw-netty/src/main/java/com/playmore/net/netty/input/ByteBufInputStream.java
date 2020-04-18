/*    */ package com.playmore.net.netty.input;
/*    */ 
/*    */ import io.netty.buffer.ByteBuf;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ByteBufInputStream
/*    */   extends InputStream
/*    */ {
/*    */   private ByteBuf buf;
/*    */   protected int mark;
/*    */   protected int initMark;
/*    */   protected int length;
/*    */   
/*    */   public ByteBufInputStream(ByteBuf buf) {
/* 18 */     this.mark = 0;
/* 19 */     this.initMark = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 24 */     this.buf = buf;
/*    */   }
/*    */   public ByteBufInputStream(ByteBuf buf, int length) {
/*    */     this.mark = 0;
/*    */     this.initMark = 0;
/* 29 */     this.buf = buf;
/* 30 */     this.mark = buf.readerIndex();
/* 31 */     this.initMark = this.mark;
/* 32 */     this.length = Math.min(buf.readableBytes(), length);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/* 37 */   public int read() throws IOException { return this.buf.isReadable() ? this.buf.readByte() : -1; }
/*    */ 
/*    */ 
/*    */   
/*    */   public int read(byte[] b, int off, int len) throws IOException {
/* 42 */     if (b == null)
/* 43 */       throw new NullPointerException(); 
/* 44 */     if (off < 0 || len < 0 || len > b.length - off) {
/* 45 */       throw new IndexOutOfBoundsException();
/*    */     }
/*    */     
/* 48 */     if (!this.buf.isReadable()) {
/* 49 */       return -1;
/*    */     }
/*    */     
/* 52 */     int avail = available();
/* 53 */     if (len > avail) {
/* 54 */       len = avail;
/*    */     }
/* 56 */     if (len <= 0) {
/* 57 */       return 0;
/*    */     }
/* 59 */     this.buf.readBytes(b, off, len);
/* 60 */     return len;
/*    */   }
/*    */ 
/*    */   
/*    */   public long skip(long n) throws IOException {
/* 65 */     long k = available();
/* 66 */     if (n < k) {
/* 67 */       k = (n < 0L) ? 0L : n;
/*    */     }
/* 69 */     this.buf.skipBytes((int)n);
/* 70 */     return k;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/* 75 */   public int available() throws IOException { return this.buf.readableBytes(); }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void close() throws IOException {}
/*    */ 
/*    */ 
/*    */   
/* 84 */   public void mark(int readlimit) { this.mark = this.buf.readerIndex(); }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 89 */   public void reset() throws IOException { this.buf.readerIndex(this.mark); }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 94 */   public boolean markSupported() { return true; }
/*    */ }


/* Location:              G:\guajiProject\guanji\ProjectS\lib\lib\Netty_Lib-0.0.1-SNAPSHOT.jar!\com\playmore\net\netty\input\ByteBufInputStream.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.7
 */