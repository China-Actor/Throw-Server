/*     */ package com.playmore.net.cmd;
/*     */ 
/*     */ import java.io.Serializable;
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
/*     */ public class CommandMessage
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = -1808056079744407110L;
/*  22 */   public static final CommandMessage SKIP_MESSAGE_INSTANCE = new CommandMessage(-1, null);
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private ProtocolFields protocolFields;
/*     */ 
/*     */ 
/*     */   
/*     */   private short commandId;
/*     */ 
/*     */ 
/*     */   
/*     */   private byte[] body;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CommandMessage(ProtocolFields protocolFields, int commandId) {
/*  41 */     this.protocolFields = protocolFields;
/*  42 */     this.commandId = (short)commandId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CommandMessage(ProtocolFields protocolFields, int commandId, byte[] body) {
/*  52 */     this(protocolFields, commandId);
/*  53 */     this.body = body;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CommandMessage(int commandId, byte[] body) {
/*  63 */     this.commandId = (short)commandId;
/*  64 */     this.body = body;
/*     */   }
/*     */ 
/*     */   
/*  68 */   public ProtocolFields getProtocolFields() { return this.protocolFields; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  76 */   public short getCommandId() { return this.commandId; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  84 */   public byte[] getBody() { return this.body; }
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/*  89 */     StringBuilder builder = new StringBuilder();
/*  90 */     builder.append("[");
/*  91 */     builder.append(this.protocolFields);
/*  92 */     builder.append(", commandId=");
/*  93 */     builder.append(this.commandId);
/*  94 */     builder.append("]");
/*  95 */     return builder.toString();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 103 */   public int getBodyLength() { return (this.body == null) ? 0 : this.body.length; }
/*     */ }


/* Location:              G:\guajiProject\guanji\ProjectS\lib\lib\Netty_Lib-0.0.1-SNAPSHOT.jar!\com\playmore\net\cmd\CommandMessage.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.7
 */