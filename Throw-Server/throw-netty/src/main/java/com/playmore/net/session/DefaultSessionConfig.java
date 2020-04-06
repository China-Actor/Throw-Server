/*     */ package com.playmore.net.session;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class DefaultSessionConfig
/*     */   implements ISessionConfig
/*     */ {
/*     */   private static final long serialVersionUID = -8047633776756087866L;
/*     */   private boolean autoFlush;
/*     */   private boolean autoCloseByChannelClosed;
/*     */   private int readIdleTime;
/*     */   private int writeIdleTime;
/*  31 */   private static final DefaultSessionConfig KEEPALIVE_INSTANCE = new DefaultSessionConfig();
/*     */   
/*  33 */   public static DefaultSessionConfig getKeepAliveInstance() { return KEEPALIVE_INSTANCE; }
/*     */ 
/*     */   
/*  36 */   private static final DefaultSessionConfig SHORT_CONNECTION_INSTANCE = new DefaultSessionConfig(false, false, 1200000, 0);
/*     */   
/*  38 */   public static DefaultSessionConfig getShortConnectionInstance() { return SHORT_CONNECTION_INSTANCE; }
/*     */ 
/*     */ 
/*     */   
/*  42 */   public static DefaultSessionConfig getDefault() { return KEEPALIVE_INSTANCE; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public DefaultSessionConfig(boolean autoFlush, boolean autoCloseByChannelClosed, int readIdleTime, int writeIdleTime) {
/*     */     this.autoFlush = true;
/*     */     this.autoCloseByChannelClosed = true;
/*     */     this.readIdleTime = 1800000;
/*     */     this.writeIdleTime = 0;
/*  55 */     this.autoFlush = autoFlush;
/*  56 */     this.autoCloseByChannelClosed = autoCloseByChannelClosed;
/*  57 */     this.readIdleTime = readIdleTime;
/*  58 */     this.writeIdleTime = writeIdleTime;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  67 */   public boolean isAutoFlush() { return this.autoFlush; } public DefaultSessionConfig() {
/*     */     this.autoFlush = true;
/*     */     this.autoCloseByChannelClosed = true;
/*     */     this.readIdleTime = 1800000;
/*     */     this.writeIdleTime = 0;
/*  72 */   } public ISessionConfig copy() { return null; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  77 */   public int getReadIdleTime() { return this.readIdleTime; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  82 */   public int getWriteIdleTime() { return this.writeIdleTime; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  87 */   public boolean isAutoCloseByChannelClosed() { return this.autoCloseByChannelClosed; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  94 */   public void setAutoFlush(boolean autoFlush) { this.autoFlush = autoFlush; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 101 */   public void setAutoCloseByChannelClosed(boolean autoCloseByChannelClosed) { this.autoCloseByChannelClosed = autoCloseByChannelClosed; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 108 */   public void setReadIdleTime(int readIdleTime) { this.readIdleTime = readIdleTime; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 115 */   public void setWriteIdleTime(int writeIdleTime) { this.writeIdleTime = writeIdleTime; }
/*     */ }


/* Location:              G:\guajiProject\guanji\ProjectS\lib\lib\Netty_Lib-0.0.1-SNAPSHOT.jar!\com\playmore\net\session\DefaultSessionConfig.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.7
 */