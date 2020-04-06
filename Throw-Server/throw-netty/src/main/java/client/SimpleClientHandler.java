/*    */ package client;
/*    */ 
/*    */ import com.playmore.net.cmd.CommandMessage;
/*    */ import com.playmore.net.netty.codec.server.IChannelConstants;
/*    */ import com.playmore.net.session.ISession;
/*    */ import com.playmore.net.util.NetServiceProvider;
/*    */ import handler.test.TestHandlerListener;
/*    */ import io.netty.channel.Channel;
/*    */ import io.netty.channel.ChannelHandlerContext;
/*    */ import io.netty.channel.ChannelInboundHandlerAdapter;
/*    */ import io.netty.util.Attribute;
/*    */ import org.slf4j.Logger;
/*    */ import org.slf4j.LoggerFactory;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SimpleClientHandler
/*    */   extends ChannelInboundHandlerAdapter
/*    */ {
/* 21 */   private Logger logger = LoggerFactory.getLogger(getClass());
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private Channel channel;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static boolean isConnected = false;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void channelActive(ChannelHandlerContext ctx) throws Exception {
/* 41 */     this.channel = ctx.channel();
/* 42 */     isConnected = true;
/*    */     
/* 44 */     TestHandlerListener.sendMsgToServer(this);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/* 49 */   public void sendMessage(CommandMessage msg) { this.channel.writeAndFlush(msg); }
/*    */ 
/*    */ 
/*    */   
/* 53 */   public void sendMessage(String msg) { this.channel.writeAndFlush(msg); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
/* 60 */     this.logger.debug("msg {} ", msg);
/* 61 */     Attribute<ISession> sessionAttribute = ctx.channel().attr(IChannelConstants.ISESSION_ATTRIBUTE_KEY);
/* 62 */     ISession session = (ISession)sessionAttribute.get();
/*    */     
/* 64 */     if (session == null) {
/* 65 */       if (this.logger.isDebugEnabled()) {
/* 66 */         this.logger.debug("channel {} not bound session", ctx.channel());
/*    */       }
/*    */       
/* 69 */       session = NetServiceProvider.getDefault().getSessionManager().create(ctx.channel(), null);
/*    */     } 
/*    */     
/* 72 */     if (msg instanceof CommandMessage) {
/*    */       try {
/* 74 */         NetServiceProvider.getDefault().getMessageHandler()
/* 75 */           .handle(session, (CommandMessage)msg);
/* 76 */       } catch (Throwable e) {
/* 77 */         if (this.logger.isErrorEnabled()) {
/* 78 */           this.logger.error("channel {} can't process msg {}.", ctx.channel(), msg);
/*    */         }
/*    */       }
/*    */     
/* 82 */     } else if (this.logger.isErrorEnabled()) {
/* 83 */       this.logger.error("channel {} can't process msg {}.", ctx.channel(), msg);
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 93 */   public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception { ctx.close(); }
/*    */ }


/* Location:              G:\guajiProject\guanji\ProjectS\lib\lib\Netty_Lib-0.0.1-SNAPSHOT.jar!\client\SimpleClientHandler.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.7
 */