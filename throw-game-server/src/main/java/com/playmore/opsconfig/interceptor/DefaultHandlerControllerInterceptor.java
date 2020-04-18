package com.playmore.opsconfig.interceptor;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONObject;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.GeneratedMessageV3;
import com.playmore.dbobject.usercenter.Player;
import com.playmore.dbobject.usercenter.User;
import com.playmore.net.cmd.CmdSearcher;
import com.playmore.net.cmd.CommandMessage;
import com.playmore.net.handler.HandlerControllerInterceptor;
import com.playmore.net.session.ISession;
import com.playmore.util.LogUtil;

@Component
public class DefaultHandlerControllerInterceptor implements HandlerControllerInterceptor {

	@Autowired
	private CmdSearcher SEARCHER;

//	private static final class CmdSearcherField {
//		private static final CmdSearcher SEARCHER = SpringContextLoader.getContext().getBean(CmdSearcher.class);
//	}

	private static class DEFAULT {
		private static final DefaultHandlerControllerInterceptor provider = new DefaultHandlerControllerInterceptor();
	}

	public static DefaultHandlerControllerInterceptor getDefault() {
		return DEFAULT.provider;
	}

	private static Logger REQUEST = LoggerFactory.getLogger("request");

	public void afterThransfer(ISession session, CommandMessage message, Object msg) {
//		if(!ServerSwitchUtil.isClose(ServerSwitchType.C2S_LOG, "", true)){
		REQUEST.debug("beforeProcess cmd {}:{} from {}.", message.getCommandId(), msg, session);
//		}
	}

	public void afterProcess(Method method, Object object, Method thransMethod, ISession session, CommandMessage message, long useTime) {
//		ProfileLogger.profile(message.getCommandId(), useTime);

//		protocolLog(session , message , false);
	}

	public void receiveMessage(Method method, Object object, Method thransMethod, ISession session, CommandMessage message) {
//		if(!ServerSwitchUtil.isClose(ServerSwitchType.C2S_LOG, "", true)){
		REQUEST.debug("receive cmd {}", message.getCommandId());
//		}

		Object obj = SEARCHER.getObjectMap().get(message.getCommandId());
		try {
			obj = SEARCHER.getMsgClassMap().get(message.getCommandId()).invoke(obj, message.getBody());
		} catch (Exception e) {
			e.printStackTrace();
		}

		protocolLog(session, message.getCommandId(), obj, true);
	}

	static void protocolLog(ISession session, short commandId, Object messageObject, boolean isRevc) {
		Object obj = messageObject;

		Object o = session.getAttribute("SET_PLAYER_INTO_SESSION");

		String sign = null;
		if (isRevc)
			sign = "revc <-";
		else
			sign = "send ->";

//		String content = message.getCommandId() + sign + obj.toString().replaceAll("\n", " ");
		GeneratedMessageV3 msg = (GeneratedMessageV3) obj;
		Map<FieldDescriptor, Object> fieldMap = msg.getAllFields();

		HashMap<String, Object> map = new HashMap<String, Object>(fieldMap.size());
		Iterator<FieldDescriptor> fieldIter = fieldMap.keySet().iterator();
		while (fieldIter.hasNext()) {
			FieldDescriptor fd = fieldIter.next();
			Object value = fieldMap.get(fd);

			map.put(fd.getName(), value.toString().replaceAll("\n", " "));
		}

		String content = sign + " " + commandId + " " + JSONObject.toJSONString(map);

		if (o != null) {
			if (o instanceof Player) {
				User user = (User) session.getAttribute("SET_USER_INTO_SESSION");

				Player p = (Player) o;

				content = user.getThirdAccount() + " " + user.getThirdChannel() + " " + p.getId() + " " + content;
			}
		}

		LogUtil.protocol(content);
	}

}
