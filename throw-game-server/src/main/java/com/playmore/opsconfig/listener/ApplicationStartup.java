package com.playmore.opsconfig.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Service;

import com.playmore.net.netty.context.NettyServer;

@Service
public class ApplicationStartup implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	NettyServer nettyServer;

	public void onApplicationEvent(ContextRefreshedEvent event) {
		if (event.getApplicationContext().getParent() == null) {
			System.out.println("===============================================Spring 容器初始化完成===============================================");
			nettyServer.start();
			NettyServer.getDefault().setStatus((byte)2);
		}
	}
}
