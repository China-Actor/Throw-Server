package com.playmore.net.handler;

import java.lang.reflect.Method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.playmore.net.cmd.CommandMessage;
import com.playmore.net.session.ISession;

public class SynchronizedHandlerContorller extends AbstractMessageHandlerContorller {
	private Logger logger = LoggerFactory.getLogger(getClass());

	private static final SynchronizedHandlerContorller DEFAULT_INSTANCE = new SynchronizedHandlerContorller();

	private HandlerControllerInterceptor interceptor;

	public static SynchronizedHandlerContorller getDefault() {
		return DEFAULT_INSTANCE;
	}

	public void setInterceptor(HandlerControllerInterceptor interceptor) {
		this.interceptor = interceptor;
	}

	protected void doHandler(Method method, Object object, Method thransMethod, ISession session, CommandMessage message) {
		long useTime;
		long start = System.currentTimeMillis();
		Object msg = null;
		try {

			if (this.interceptor != null) {
				this.interceptor.receiveMessage(method, object, thransMethod, session, message);
			}
			if (thransMethod != null) {
				msg = thransMethod.invoke(null, new Object[] { message.getBody() });
				if (this.interceptor != null) {
					this.interceptor.afterThransfer(session, message, msg);
				}
			}
			if (session.getProcessingCmd().getAndSet(message.getCommandId()) != message.getCommandId()) {
				method.invoke(object, new Object[] { session, msg });
				session.resetProcessingCmd();
			} else {
				this.logger.info("repeated message!!" + message.getCommandId());
			}
		} catch (Throwable e) {
			session.resetProcessingCmd();
			if (this.logger.isErrorEnabled()) {
				this.logger.error("{},{},{},{},{}", new Object[] { method, object, session, message, (e == null) ? e : e.getStackTrace() });
				if (e != null)
					e.printStackTrace();
			}
		} finally {
			useTime = System.currentTimeMillis() - start;
			if (this.interceptor != null)
				this.interceptor.afterProcess(method, object, thransMethod, session, message, useTime);
		}
	}
}
