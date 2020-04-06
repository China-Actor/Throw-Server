package com.playmore.net.netty.test;

import com.playmore.net.netty.context.NettyServer;
import com.playmore.net.netty.context.ServerStatusConstants;
import com.playmore.util.context.SpringContextLoader;

public class MainContext {

	public static void main(String[] args) {
		try {
			SpringContextLoader.main(new String[] {});
			NettyServer.getDefault().setStatus(ServerStatusConstants.RUNNING);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
