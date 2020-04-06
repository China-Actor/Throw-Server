/*    */ package com.playmore.net.session;
/*    */ 
/*    */ import java.util.concurrent.atomic.AtomicInteger;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class DefaultSessionIdentityMaker
/*    */   implements IdentityMaker
/*    */ {
/* 10 */   protected AtomicInteger atomicId = new AtomicInteger(0);
/*    */   
/* 12 */   private static final DefaultSessionIdentityMaker DEFAULT_INSTANCE = new DefaultSessionIdentityMaker();
/*    */   
/* 14 */   public static DefaultSessionIdentityMaker getDefault() { return DEFAULT_INSTANCE; }
/*    */ 
/*    */ 
/*    */   
/* 18 */   public static DefaultSessionIdentityMaker newInstance() { return new DefaultSessionIdentityMaker(); }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 23 */   public int make() { return this.atomicId.incrementAndGet(); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 30 */   public AtomicInteger getAtomicId() { return this.atomicId; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 37 */   public void setAtomicId(AtomicInteger atomicId) { this.atomicId = atomicId; }
/*    */ }


/* Location:              G:\guajiProject\guanji\ProjectS\lib\lib\Netty_Lib-0.0.1-SNAPSHOT.jar!\com\playmore\net\session\DefaultSessionIdentityMaker.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.7
 */