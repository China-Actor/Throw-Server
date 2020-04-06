/*     */ package com.playmore.net.session;
/*     */ 
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.Map;
/*     */ import java.util.concurrent.ConcurrentHashMap;
/*     */ import org.slf4j.Logger;
/*     */ import org.slf4j.LoggerFactory;
/*     */ 
/*     */ public class DefaultSessionManager
/*     */   implements ISessionManager {
/*     */   protected Map<Number, ISession> sessionMap;
/*     */   private ISessionFactory sessionFactory;
/*     */   private Logger logger;
/*     */   
/*     */   public DefaultSessionManager(ISessionFactory sessionFactory) {
/*  17 */     this.sessionMap = new ConcurrentHashMap(128);
/*     */     
/*  19 */     this.logger = LoggerFactory.getLogger(getClass());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  26 */     this.sessionFactory = sessionFactory;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*  31 */   public ISession get(Number id) { return (ISession)this.sessionMap.get(id); }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ISession create(Object ioChannel, Number id) throws ExistIdentityException {
/*  37 */     if (id != null) {
/*  38 */       ISession exist = (ISession)this.sessionMap.get(id);
/*  39 */       if (exist != null)
/*     */       {
/*  41 */         throw new ExistIdentityException();
/*     */       }
/*     */     } 
/*  44 */     ISession session = doCreate(ioChannel, id);
/*  45 */     if (session == null) {
/*  46 */       return null;
/*     */     }
/*  48 */     this.sessionMap.put(session.getId(), session);
/*  49 */     if (this.logger.isInfoEnabled()) {
/*  50 */       this.logger.info("create {} and registed.", session);
/*     */     }
/*  52 */     return session;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  62 */   protected ISession doCreate(Object ioChannel, Number id) throws ExistIdentityException { return this.sessionFactory.create(ioChannel, id); }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void changeIdentity(Number old, Number _new) throws SessionNotFoundException, ExistIdentityException {
/*  68 */     ISession exist = (ISession)this.sessionMap.get(old);
/*  69 */     if (exist == null) {
/*  70 */       throw new SessionNotFoundException("can't found any fit session by id[" + old.longValue() + "]");
/*     */     }
/*  72 */     ISession newExist = (ISession)this.sessionMap.get(_new);
/*  73 */     if (newExist != null) {
/*  74 */       throw new ExistIdentityException("channel id [" + _new.longValue() + "] is exist.");
/*     */     }
/*  76 */     changeIdentity(exist, _new);
/*  77 */     if (this.logger.isInfoEnabled()) {
/*  78 */       this.logger.info("{} change identity {} to {}", new Object[] { exist, old, _new });
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  88 */   protected void changeIdentity(ISession session, Number identity) { ((AbstractSession)session).setId(identity); }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  93 */   public void remove(ISession session) { remove(session.getId()); }
/*     */ 
/*     */ 
/*     */   
/*     */   public ISession remove(Number id) {
/*  98 */     ISession session = (ISession)this.sessionMap.remove(id);
/*  99 */     if (this.logger.isInfoEnabled()) {
/* 100 */       this.logger.info("remove {} by Id {} ang disregisted.", session, id);
/*     */     }
/* 102 */     return session;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/* 107 */   public int size() { return this.sessionMap.size(); }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 112 */   public Collection<ISession> getAll() { return this.sessionMap.values(); }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 117 */   public Iterator<ISession> iterator() { return this.sessionMap.values().iterator(); }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 122 */   public boolean isEmpty() { return this.sessionMap.isEmpty(); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void checkIdleTimeout() {
/* 129 */     if (this.logger.isDebugEnabled()) {
/* 130 */       this.logger.debug("check session idle timeout.", this);
/*     */     }
/* 132 */     if (isEmpty()) {
/*     */       return;
/*     */     }
/*     */     
/* 136 */     ISession session = null;
/* 137 */     for (Iterator<ISession> iterator = this.sessionMap.values().iterator(); iterator.hasNext(); ) {
/* 138 */       session = (ISession)iterator.next();
/* 139 */       if (session == null || !session.isIdleTimeout())
/*     */         continue; 
/* 141 */       session.close(true, true);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/* 146 */   public ISessionFactory getSessionFactory() { return this.sessionFactory; }
/*     */ 
/*     */ 
/*     */   
/* 150 */   public void setSessionFactory(ISessionFactory sessionFactory) { this.sessionFactory = sessionFactory; }
/*     */ 
/*     */ 
/*     */   
/*     */   public void closeAllSessions() {
/* 155 */     Collection<ISession> sessions = this.sessionMap.values();
/* 156 */     for (ISession session : sessions)
/* 157 */       session.close(false, true); 
/*     */   }
/*     */ }


/* Location:              G:\guajiProject\guanji\ProjectS\lib\lib\Netty_Lib-0.0.1-SNAPSHOT.jar!\com\playmore\net\session\DefaultSessionManager.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.7
 */