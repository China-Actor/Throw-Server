package com.playmore.opsconfig.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.playmore.net.cmd.CommandMessage;
import com.playmore.net.handler.SendMessageIntercepter;
import com.playmore.net.session.ISession;

public class DefaultSendMessageIntercepter implements SendMessageIntercepter {

	private static Logger RESPONSE = LoggerFactory.getLogger("s2c");

	public void sendMessage(ISession session, Object message) {
		// if(!ServerSwitchUtil.isClose(ServerSwitchType.S2C_LOG, "", true)){
		CommandMessage msg = (CommandMessage) message;
		RESPONSE.debug("sendMessage cmd {} to {}", msg.getCommandId(), session);
		// }

//		DefaultHandlerControllerInterceptor.protocolLog(session , (CommandMessage)message , false);
	}

	public void sendMessage(ISession session, CommandMessage msg, Object message) {
		// if(!ServerSwitchUtil.isClose(ServerSwitchType.S2C_LOG, "", true)){
		RESPONSE.debug("sendMessage cmd {}:{} to {}.", msg.getCommandId(), message, session);
		// }

		DefaultHandlerControllerInterceptor.protocolLog(session, msg.getCommandId(), message, false);
	}
}
