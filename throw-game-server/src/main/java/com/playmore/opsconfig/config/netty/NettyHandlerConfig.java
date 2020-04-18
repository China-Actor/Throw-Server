package com.playmore.opsconfig.config.netty;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.playmore.net.cmd.CmdSearcher;
import com.playmore.net.handler.SynchronizedHandlerContorller;
import com.playmore.net.netty.codec.server.NettyMessageFactory;
import com.playmore.net.netty.context.NettyServer;
import com.playmore.net.netty.session.NettyKeepAliveSessionFactory;
import com.playmore.net.netty.session.NettyKeepAliveSessionManager;
import com.playmore.net.session.DefaultSessionIdentityMaker;
import com.playmore.net.util.NetServiceProvider;
import com.playmore.opsconfig.interceptor.DefaultHandlerControllerInterceptor;
import com.playmore.opsconfig.interceptor.DefaultSendMessageIntercepter;

@Configuration
public class NettyHandlerConfig {

	@Bean
	public DefaultHandlerControllerInterceptor contorllerInterceptor() {
		return DefaultHandlerControllerInterceptor.getDefault();
	}

	@Bean
	public SynchronizedHandlerContorller handlerContorller(CmdSearcher cmdSearcher, DefaultHandlerControllerInterceptor contorllerInterceptor) {
		SynchronizedHandlerContorller handlerContorller = SynchronizedHandlerContorller.getDefault();
		handlerContorller.setCmdSearcher(cmdSearcher);
		handlerContorller.setInterceptor(contorllerInterceptor);
		return handlerContorller;
	}

	@Bean
	public CmdSearcher cmdSearcher() {
		CmdSearcher cmdSearcher = new CmdSearcher("com.playmore.msghandler");
		return cmdSearcher;
	}

	@Bean
	public DefaultSessionIdentityMaker identityMaker() {
		return DefaultSessionIdentityMaker.getDefault();
	}
	
	@Bean
	public NettyMessageFactory messageFactory() {
		return NettyMessageFactory.getDefault();
	}

	@Bean
	public NettyKeepAliveSessionFactory sessionFactory() {
		return NettyKeepAliveSessionFactory.getDefault();
	}

	@Bean
	public NettyKeepAliveSessionManager sessionManager(NettyKeepAliveSessionFactory sessionFactory, DefaultSendMessageIntercepter intercepter) {
		NettyKeepAliveSessionManager sessionManager = new NettyKeepAliveSessionManager(sessionFactory);
		NettyKeepAliveSessionManager.setIntercepter(intercepter);
		return sessionManager;
	}

	@Bean
	public DefaultSendMessageIntercepter defaultSendMessageIntercepter() {
		DefaultSendMessageIntercepter defaultSendMessageIntercepter = new DefaultSendMessageIntercepter();
		return defaultSendMessageIntercepter;
	}

	@Bean
	public NetServiceProvider netServiceProvider(NettyKeepAliveSessionManager sessionManager, NettyMessageFactory messageFactory,
			SynchronizedHandlerContorller handlerContorller) {
		NetServiceProvider netServiceProvider = NetServiceProvider.getDefault();
		netServiceProvider.setSessionManager(sessionManager);
		netServiceProvider.setMessageFactory(messageFactory);
		netServiceProvider.setMessageHandler(handlerContorller);
		return netServiceProvider;
	}
	
//	 <bean id="nettyServer" class="com.playmore.net.netty.context.NettyServer"
//				factory-method="getDefault" init-method="start">
//				<property name="port" value="${net.server.port}" />
//				<property name="hostAddress" value="${net.server.host}" />
//				<property name="version" value="${server.version}" />
	
	@Bean
	public NettyServer nettyServer() {
		NettyServer nettyServer = NettyServer.getDefault();
		nettyServer.setHostAddress("127.0.0.1");
		nettyServer.setPort(9999);;
		nettyServer.setVersion("v1.0.0");
		return nettyServer;
	}
}
