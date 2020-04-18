/*     */ package com.playmore.net.session;
/*     */ 
/*     */ import com.playmore.net.util.EncryptionAndDecryptionUtil;
/*     */ import java.util.Map;
/*     */ import java.util.Queue;
/*     */ import java.util.concurrent.ConcurrentHashMap;
/*     */ import java.util.concurrent.ConcurrentLinkedQueue;
/*     */ import org.slf4j.Logger;
/*     */ import org.slf4j.LoggerFactory;
/*     */ 
/*     */ public abstract class AbstractSession
/*     */   implements ISession
/*     */ {
/*     */   protected Map<Object, Object> attributeMap;
/*     */   protected ISessionHolder sessionHolder;
/*     */   protected Queue<Object> writeQueue;
/*     */   protected ISessionConfig config;
/*     */   private Logger logger;
/*     */   
/*     */   public AbstractSession(Number id, ISessionHolder sessionHolder) {
/*  21 */     this
/*  22 */       .attributeMap = new ConcurrentHashMap(3);
/*     */     
/*  24 */     this.writeQueue = new ConcurrentLinkedQueue();
/*  25 */     this.config = DefaultSessionConfig.getDefault();
/*  26 */     this.logger = LoggerFactory.getLogger(getClass());
/*     */     
/*  28 */     this.messgeCounter = new MessageCounter();
/*  29 */     this.encryptionKeys = EncryptionAndDecryptionUtil.getDefaultCustomEncryptionKeys();
/*  30 */     this.decryptionKeys = EncryptionAndDecryptionUtil.getDefaultCustomEncryptionKeys();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  35 */     this.status = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  45 */     this.sessionHolder = sessionHolder;
/*     */   }
/*     */   protected Number id; protected MessageCounter messgeCounter; protected int[] encryptionKeys; protected int[] decryptionKeys;
/*     */   private byte status;
/*     */   
/*     */   public AbstractSession(Number id, ISessionHolder sessionHolder, ISessionConfig config) {
/*     */     this.attributeMap = new ConcurrentHashMap(3);
/*     */     this.writeQueue = new ConcurrentLinkedQueue();
/*     */     this.config = DefaultSessionConfig.getDefault();
/*     */     this.logger = LoggerFactory.getLogger(getClass());
/*     */     this.messgeCounter = new MessageCounter();
/*     */     this.encryptionKeys = EncryptionAndDecryptionUtil.getDefaultCustomEncryptionKeys();
/*     */     this.decryptionKeys = EncryptionAndDecryptionUtil.getDefaultCustomEncryptionKeys();
/*     */     this.status = 0;
/*  59 */     this.id = id;
/*  60 */     this.sessionHolder = sessionHolder;
/*  61 */     this.config = config; } public AbstractSession(Number id) {
/*     */     this.attributeMap = new ConcurrentHashMap(3);
/*     */     this.writeQueue = new ConcurrentLinkedQueue();
/*     */     this.config = DefaultSessionConfig.getDefault();
/*     */     this.logger = LoggerFactory.getLogger(getClass());
/*     */     this.messgeCounter = new MessageCounter();
/*     */     this.encryptionKeys = EncryptionAndDecryptionUtil.getDefaultCustomEncryptionKeys();
/*     */     this.decryptionKeys = EncryptionAndDecryptionUtil.getDefaultCustomEncryptionKeys();
/*     */     this.status = 0;
/*  70 */     this.id = id;
/*     */   }
/*     */   public AbstractSession(Number id, ISessionConfig config) {
/*     */     this.attributeMap = new ConcurrentHashMap(3);
/*     */     this.writeQueue = new ConcurrentLinkedQueue();
/*     */     this.config = DefaultSessionConfig.getDefault();
/*     */     this.logger = LoggerFactory.getLogger(getClass());
/*     */     this.messgeCounter = new MessageCounter();
/*     */     this.encryptionKeys = EncryptionAndDecryptionUtil.getDefaultCustomEncryptionKeys();
/*     */     this.decryptionKeys = EncryptionAndDecryptionUtil.getDefaultCustomEncryptionKeys();
/*     */     this.status = 0;
/*  81 */     this.id = id;
/*  82 */     this.config = config;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*  87 */   public Number getId() { return this.id; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  97 */   public void setId(Number id) { this.id = id; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 102 */   public Object getAttribute(Object key) { return this.attributeMap.get(key); }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 107 */   public void setAttribute(Object key, Object value) { this.attributeMap.put(key, value); }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 112 */   public void removeAttribute(Object key) { this.attributeMap.remove(key); }
/*     */ 
/*     */ 
/*     */   
/*     */   public void flush() {
/* 117 */     boolean active = isActive();
/* 118 */     boolean writeable = isWritable();
/* 119 */     if (active && writeable) {
/* 120 */       if (this.config.isAutoFlush()) {
/* 121 */         synchronized (this.writeQueue) {
/* 122 */           if (this.writeQueue.isEmpty()) {
/* 123 */             if (this.logger.isDebugEnabled())
/* 124 */               this.logger.debug("{} write queue is empty.", this.id); 
/*     */           } else {
/* 126 */             doFlush(this.writeQueue);
/*     */           } 
/*     */         } 
/* 129 */       } else if (this.logger.isDebugEnabled()) {
/* 130 */         this.logger.debug("{} is configure not auto flush.", this.id);
/*     */       }
/*     */     
/* 133 */     } else if (this.logger.isDebugEnabled()) {
/* 134 */       this.logger.debug("{} is not active{} or writeable{}", new Object[] { this.id, Boolean.valueOf(active), 
/* 135 */             Boolean.valueOf(writeable) });
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected abstract void doFlush(Queue<Object> paramQueue);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 153 */   protected boolean isWriteQueueEmpty() { return this.writeQueue.isEmpty(); }
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
/* 165 */   protected boolean isAutoWriteImmediately() { return (isActive() && isWritable() && this.config.isAutoFlush()); }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean write(Object message) {
/* 170 */     this.messgeCounter.lastWrite = System.currentTimeMillis();
/* 171 */     boolean writeSingleImmediately = Boolean.FALSE.booleanValue();
/* 172 */     synchronized (this.writeQueue) {
/* 173 */       if (isAutoWriteImmediately() && this.writeQueue.isEmpty()) {
/* 174 */         writeSingleImmediately = Boolean.TRUE.booleanValue();
/*     */       } else {
/* 176 */         this.writeQueue.add(message);
/*     */       } 
/* 178 */     }  if (writeSingleImmediately) {
/* 179 */       if (this.logger.isDebugEnabled()) {
/* 180 */         this.logger.debug("{} write single message immediately.", this);
/*     */       }
/* 182 */       doWriteSingle(message);
/* 183 */       return Boolean.TRUE.booleanValue();
/*     */     } 
/* 185 */     if (this.logger.isDebugEnabled()) {
/* 186 */       this.logger.debug("{} add message to write queue.", this);
/*     */     }
/* 188 */     if (isAutoWriteImmediately()) {
/* 189 */       synchronized (this.writeQueue) {
/* 190 */         if (!this.writeQueue.isEmpty())
/* 191 */           doFlush(this.writeQueue); 
/*     */       } 
/* 193 */       return Boolean.TRUE.booleanValue();
/*     */     } 
/*     */     
/* 196 */     return Boolean.FALSE.booleanValue();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected abstract void doWriteSingle(Object paramObject);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void release() {
/* 211 */     synchronized (this) {
/* 212 */       if ((this.status & 0x40) != 0)
/*     */         return; 
/* 214 */       this.status = 64;
/*     */     } 
/* 216 */     this.attributeMap.clear();
/* 217 */     this.writeQueue.clear();
/* 218 */     this.sessionHolder = null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected abstract void removeFromManager();
/*     */ 
/*     */ 
/*     */   
/*     */   public void close(boolean immediately, boolean application) {
/* 228 */     synchronized (this) {
/* 229 */       if (this.status == 32)
/*     */         return; 
/* 231 */       this.status = 32;
/*     */     } 
/* 233 */     removeFromManager();
/* 234 */     if (application && 
/* 235 */       isActive()) {
/* 236 */       closeChannel(immediately);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected abstract void closeChannel(boolean paramBoolean);
/*     */ 
/*     */ 
/*     */   
/*     */   public void channelClosed() {
/* 248 */     if (this.sessionHolder != null) {
/* 249 */       this.sessionHolder.channelClosed();
/*     */     }
/*     */     
/* 252 */     if (this.config.isAutoCloseByChannelClosed()) {
/* 253 */       close(Boolean.TRUE.booleanValue(), Boolean.FALSE.booleanValue());
/* 254 */       release();
/*     */     } else {
/* 256 */       this.status = (byte)(this.status & 0xFFFFFFFD);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void channelActived(Object ioChannel) {
/* 262 */     setIoChannel(ioChannel);
/* 263 */     this.status = (byte)(this.status | 0x2);
/* 264 */     if (this.sessionHolder != null) {
/* 265 */       this.sessionHolder.channelActived();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/* 271 */   public ISessionConfig getConfig() { return this.config; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 279 */   public void setConfig(ISessionConfig config) { this.config = config; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 284 */   public ISessionHolder getSessionHolder() { return this.sessionHolder; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 294 */   public void setSessionHolder(ISessionHolder sessionHolder) { this.sessionHolder = sessionHolder; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 299 */   public byte getStatus() { return this.status; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 309 */   public void setStatus(byte status) { this.status = status; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 314 */   public MessageCounter getMessgeCounter() { return this.messgeCounter; }
/*     */ 
/*     */   
/*     */   public boolean isReadIdleTimeout() {
/* 318 */     if (this.config.getReadIdleTime() == 0)
/* 319 */       return false; 
/* 320 */     return (System.currentTimeMillis() - this.messgeCounter.lastRead > this.config
/* 321 */       .getReadIdleTime());
/*     */   }
/*     */   
/*     */   public boolean isWriteIdleTimeout() {
/* 325 */     if (this.config.getWriteIdleTime() == 0)
/* 326 */       return false; 
/* 327 */     return (System.currentTimeMillis() - this.messgeCounter.lastWrite > this.config
/* 328 */       .getWriteIdleTime());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isIdleTimeout() {
/* 333 */     if (this.config.isAutoCloseByChannelClosed() && 
/* 334 */       !isActive()) {
/* 335 */       return true;
/*     */     }
/* 337 */     return !(!isReadIdleTimeout() && !isWriteIdleTimeout());
/*     */   }
/*     */ 
/*     */   
/* 341 */   public int[] getEncryptionKeys() { return this.encryptionKeys; }
/*     */ 
/*     */ 
/*     */   
/* 345 */   public void setEncryptionKeys(int[] encryptionKeys) { this.encryptionKeys = encryptionKeys; }
/*     */ 
/*     */ 
/*     */   
/* 349 */   public int[] getDecryptionKeys() { return this.decryptionKeys; }
/*     */ 
/*     */ 
/*     */   
/* 353 */   public void setDecryptionKeys(int[] decryptionKeys) { this.decryptionKeys = decryptionKeys; }
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 358 */     StringBuilder builder = new StringBuilder();
/* 359 */     builder.append(getClass().getSimpleName());
/* 360 */     builder.append("[id=");
/* 361 */     builder.append(this.id);
/* 362 */     builder.append("]");
/* 363 */     return builder.toString();
/*     */   }
/*     */ }


/* Location:              G:\guajiProject\guanji\ProjectS\lib\lib\Netty_Lib-0.0.1-SNAPSHOT.jar!\com\playmore\net\session\AbstractSession.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.7
 */