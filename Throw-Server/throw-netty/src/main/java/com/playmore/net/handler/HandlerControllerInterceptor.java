package com.playmore.net.handler;

import com.playmore.net.cmd.CommandMessage;
import com.playmore.net.session.ISession;
import java.lang.reflect.Method;

public interface HandlerControllerInterceptor {
  void receiveMessage(Method paramMethod1, Object paramObject, Method paramMethod2, ISession paramISession, CommandMessage paramCommandMessage);
  
  void afterThransfer(ISession paramISession, CommandMessage paramCommandMessage, Object paramObject);
  
  void afterProcess(Method paramMethod1, Object paramObject, Method paramMethod2, ISession paramISession, CommandMessage paramCommandMessage, long paramLong);
}


/* Location:              G:\guajiProject\guanji\ProjectS\lib\lib\Netty_Lib-0.0.1-SNAPSHOT.jar!\com\playmore\net\handler\HandlerControllerInterceptor.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.7
 */