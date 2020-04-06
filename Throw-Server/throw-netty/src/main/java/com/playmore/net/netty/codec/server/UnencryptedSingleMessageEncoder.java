/*    */ package com.playmore.net.netty.codec.server;
/*    */ 
/*    */ import com.playmore.net.cmd.CommandMessage;
/*    */ import com.playmore.net.util.CheckSumUtil;

/*    */ import io.netty.buffer.ByteBuf;
/*    */ import io.netty.channel.ChannelHandlerContext;
/*    */ import io.netty.handler.codec.MessageToByteEncoder;
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
/*    */ public class UnencryptedSingleMessageEncoder
/*    */   extends MessageToByteEncoder<CommandMessage>
/*    */ {
	
/*    */   protected void encode(ChannelHandlerContext ctx, CommandMessage msg, ByteBuf out) throws Exception {
/* 23 */     int contentLength = msg.getBodyLength() + 
/* 24 */       10;
/* 25 */     out.writeShort(28987);
/* 26 */     out.writeInt(contentLength);
/* 27 */     int backWriterIndex = out.writerIndex();
/* 28 */     out.writeShort(0);
/* 29 */     out.writeShort(msg.getCommandId());
/*    */     
/* 31 */     if (msg.getBody() != null) {
/* 32 */       out.writeBytes(msg.getBody());
/*    */     }
/* 34 */     int lastWriterIndex = out.writerIndex();
/* 35 */     int checkSum = CheckSumUtil.calculate(out.nioBuffer(), 
/* 36 */         8, contentLength - 
/* 37 */         8);
/* 38 */     out.writerIndex(backWriterIndex);
/* 39 */     out.writeShort(checkSum);
/* 40 */     out.writerIndex(lastWriterIndex);

/*    */   }
/*    */ }


/* Location:              G:\guajiProject\guanji\ProjectS\lib\lib\Netty_Lib-0.0.1-SNAPSHOT.jar!\com\playmore\net\netty\codec\server\UnencryptedSingleMessageEncoder.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.7
 */