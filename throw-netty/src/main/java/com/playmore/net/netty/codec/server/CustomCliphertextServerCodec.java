/*    */ package com.playmore.net.netty.codec.server;
/*    */ 
/*    */ import com.playmore.net.cmd.CommandMessage;
/*    */ import io.netty.channel.CombinedChannelDuplexHandler;
/*    */ import io.netty.handler.codec.ByteToMessageDecoder;
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
/*    */ public class CustomCliphertextServerCodec
/*    */   extends CombinedChannelDuplexHandler<ByteToMessageDecoder, MessageToByteEncoder<CommandMessage>>
/*    */ {
/* 20 */   public CustomCliphertextServerCodec() { this(new CustomCiphertextDecoder(), new CustomCliphertextSingleEncoder()); }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 25 */   public CustomCliphertextServerCodec(ByteToMessageDecoder inboundHandler, MessageToByteEncoder<CommandMessage> outboundHandler) { super(inboundHandler, outboundHandler); }
/*    */ }


/* Location:              G:\guajiProject\guanji\ProjectS\lib\lib\Netty_Lib-0.0.1-SNAPSHOT.jar!\com\playmore\net\netty\codec\server\CustomCliphertextServerCodec.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.7
 */