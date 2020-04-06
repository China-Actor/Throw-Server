package com.playmore.net.netty.context;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;

public class NettyServer {
	private static NettyServer DEFAULT = new NettyServer();

	public static NettyServer getDefault() {
		return DEFAULT;
	}

	private byte status = 7;
	private ServerBootstrap bootstrap;
	public static final String DEFAULT_HOST_ADDRESS = "localhost";
	public static final int DEFAULT_PORT = 9999;
	private String hostAddress = "localhost";
	private int port = 9999;
	private String version;
	private EventLoopGroup bossGroup;
	private EventLoopGroup workerGroup;
	private Logger logger = LoggerFactory.getLogger(getClass());
	private boolean enableEncrypted = false;
	private ChannelInitializer<SocketChannel> channelInitializer = null;
	private long startupTimestamp = 0L;

	public ChannelInitializer<SocketChannel> getChannelInitializer() {
		return this.channelInitializer;
	}

	public void setChannelInitializer(ChannelInitializer<SocketChannel> channelInitializer) {
		this.channelInitializer = channelInitializer;
	}

	public void start() {
		getDefault().setStatus((byte) 1);

		if (this.channelInitializer == null) {
			if (this.enableEncrypted) {
				this.channelInitializer = new CustomCiphertextChannelInitializer();
			} else {
				this.channelInitializer = new UnecryptedChannelInitializer();
			}
		}

		(new Thread("NettyServer-Thread") {

			public void run() {
				try {
					if (NettyServer.this.bossGroup == null) {
						NettyServer.this.bossGroup = new NioEventLoopGroup();
					}
					if (NettyServer.this.workerGroup == null) {
						NettyServer.this.workerGroup = new NioEventLoopGroup();
					}
					try {
						if (NettyServer.this.bootstrap == null) {
							NettyServer.this.bootstrap = new ServerBootstrap();
						}
						((ServerBootstrap) ((ServerBootstrap) ((ServerBootstrap) ((ServerBootstrap) ((ServerBootstrap) ((ServerBootstrap) ((ServerBootstrap) NettyServer.this.bootstrap
								.group(NettyServer.this.bossGroup, NettyServer.this.workerGroup)
								.channel(io.netty.channel.socket.nio.NioServerSocketChannel.class)).option(ChannelOption.SO_BACKLOG, Integer.valueOf(100)))
										.option(ChannelOption.TCP_NODELAY, Boolean.valueOf(true))).option(ChannelOption.SO_REUSEADDR, Boolean.valueOf(true)))
												.option(ChannelOption.AUTO_READ, Boolean.valueOf(true))).option(ChannelOption.SO_LINGER, Integer.valueOf(10)))
														.option(ChannelOption.SO_TIMEOUT, Integer.valueOf(30000)))
																.childHandler(NettyServer.this.channelInitializer);

						if (NettyServer.this.logger.isInfoEnabled()) {
							NettyServer.this.logger.info("bind to [{}:{}]", NettyServer.this.hostAddress, Integer.valueOf(NettyServer.this.port));
						}

						ChannelFuture future = null;
						if (NettyServer.this.hostAddress != null && NettyServer.this.hostAddress.length() > 0
								&& !NettyServer.this.hostAddress.equals("127.0.0.1") && !NettyServer.this.hostAddress.equals("0:0:0:0:0:0:0:1")) {
							future = NettyServer.this.bootstrap.bind(NettyServer.this.hostAddress, NettyServer.this.port).sync();
						} else {
							future = NettyServer.this.bootstrap.bind(NettyServer.this.port).sync();
						}

						future.channel().closeFuture().sync();
					} finally {

						if (NettyServer.this.bossGroup != null) {
							NettyServer.this.bossGroup.shutdownGracefully();
						}
						if (NettyServer.this.workerGroup != null)
							NettyServer.this.workerGroup.shutdownGracefully();
					}
				} catch (Exception ex) {
					ex.printStackTrace();
					NettyServer.this.logger.error("server start fail.[{}]:[{}]", new Object[] {});
				}
			}
		}).start();
	}

	public static void main(String[] args) throws Exception {
		(new NettyServer()).start();
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		if (this.status != 2 && status == 2) {
			this.startupTimestamp = System.currentTimeMillis();
		}
		this.status = status;
	}

	public long getStartupTimestamp() {
		return this.startupTimestamp;
	}

	public String getHostAddress() {
		return this.hostAddress;
	}

	public void setHostAddress(String hostAddress) {
		this.hostAddress = hostAddress;
	}

	public int getPort() {
		return this.port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public ServerBootstrap getBootstrap() {
		return this.bootstrap;
	}

	public void setBootstrap(ServerBootstrap bootstrap) {
		this.bootstrap = bootstrap;
	}

	public EventLoopGroup getBossGroup() {
		return this.bossGroup;
	}

	public void setBossGroup(EventLoopGroup bossGroup) {
		this.bossGroup = bossGroup;
	}

	public EventLoopGroup getWorkerGroup() {
		return this.workerGroup;
	}

	public void setWorkerGroup(EventLoopGroup workerGroup) {
		this.workerGroup = workerGroup;
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
}

/*
 * Location:
 * G:\guajiProject\guanji\ProjectS\lib\lib\Netty_Lib-0.0.1-SNAPSHOT.jar!\com\
 * playmore\net\netty\context\NettyServer.class Java compiler version: 7 (51.0)
 * JD-Core Version: 1.0.7
 */