/*    */ package com.playmore.net.session;
/*    */ 
/*    */ import org.slf4j.Logger;
/*    */ import org.slf4j.LoggerFactory;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class AbstractSessionFactory
/*    */   implements ISessionFactory
/*    */ {
/* 13 */   private IdentityMaker identityMaker = DefaultSessionIdentityMaker.getDefault();
/* 14 */   private ISessionConfig sessionConfig = DefaultSessionConfig.getDefault();
/* 15 */   private Logger logger = LoggerFactory.getLogger(getClass());
/*    */ 
/*    */   
/*    */   public ISession create(Object ioChannel, Number id) {
/* 19 */     if (id == null) {
/* 20 */       id = newIdentity();
/* 21 */       if (this.logger.isDebugEnabled()) {
/* 22 */         this.logger.debug("new session identity {} for channel {}", id, ioChannel);
/*    */       }
/*    */     }
/* 25 */     else if (this.logger.isDebugEnabled()) {
/* 26 */       this.logger.debug("create session by already know id {} for channel {}", id, ioChannel);
/*    */     } 
/*    */     
/* 29 */     return doCreate(ioChannel, id);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected abstract ISession doCreate(Object paramObject, Number paramNumber);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 43 */   public Integer newIdentity() { return Integer.valueOf(this.identityMaker.make()); }
/*    */ 
/*    */ 
/*    */   
/* 47 */   public void setIdentityMaker(IdentityMaker identityMaker) { this.identityMaker = identityMaker; }
/*    */ 
/*    */ 
/*    */   
/* 51 */   public ISessionConfig getSessionConfig() { return this.sessionConfig; }
/*    */ 
/*    */ 
/*    */   
/* 55 */   public void setSessionConfig(ISessionConfig sessionConfig) { this.sessionConfig = sessionConfig; }
/*    */ }


/* Location:              G:\guajiProject\guanji\ProjectS\lib\lib\Netty_Lib-0.0.1-SNAPSHOT.jar!\com\playmore\net\session\AbstractSessionFactory.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.7
 */