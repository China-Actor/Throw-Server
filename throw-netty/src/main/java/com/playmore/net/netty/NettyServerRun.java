package com.playmore.net.netty;

import com.playmore.net.netty.context.NettyServer;
import com.playmore.net.netty.context.ServerStatusConstants;
import com.playmore.util.context.SpringContextLoader;

public class NettyServerRun {

	public static void main(String[] args) {
		try {
			SpringContextLoader.main(args);
			NettyServer.getDefault().setStatus(ServerStatusConstants.RUNNING);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void start() {
		main(new String[] {});
	}
}
