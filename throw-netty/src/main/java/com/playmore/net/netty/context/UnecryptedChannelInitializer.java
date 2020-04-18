/*    */ package com.playmore.net.netty.context;
import com.playmore.net.netty.codec.server.UnecryptedServerCodec;
import com.playmore.net.netty.handler.BinaryFrameHandler;
import com.playmore.net.netty.handler.NettyServerInboundHandlerAdpter;
import com.playmore.net.netty.handler.TextFrameHandler;

/*    */ import io.netty.channel.ChannelInitializer;
/*    */ import io.netty.channel.ChannelPipeline;
/*    */ import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler;
/*    */ import io.netty.handler.logging.LogLevel;
/*    */ import io.netty.handler.logging.LoggingHandler;
import io.netty.handler.stream.ChunkedWriteHandler;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class UnecryptedChannelInitializer
/*    */   extends ChannelInitializer<SocketChannel>
/*    */ {
/*    */   protected void initChannel(SocketChannel ch) throws Exception {
/* 23 */     ChannelPipeline p = ch.pipeline();
/* 24 */     p.addLast("logger", new LoggingHandler(LogLevel.INFO));
			 p.addLast(new HttpServerCodec());
			 // 对写大数据流的支持 
			 p.addLast(new ChunkedWriteHandler());
			// 对httpMessage进行聚合，聚合成FullHttpRequest或FullHttpResponse
		p.addLast(new HttpObjectAggregator(1024 * 64));
		p.addLast(new WebSocketServerProtocolHandler("/ws"));
		p.addLast("handler", new NettyServerInboundHandlerAdpter());
		
/*    */   }
/*    */ }


 