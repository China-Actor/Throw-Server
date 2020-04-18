package com.playmore.net.handler;

import com.playmore.net.cmd.CommandMessage;
import com.playmore.net.session.ISession;

public interface SendMessageIntercepter {
  void sendMessage(ISession paramISession, Object paramObject);
  
  void sendMessage(ISession paramISession, CommandMessage paramCommandMessage, Object paramObject);
}


/* Location:              G:\guajiProject\guanji\ProjectS\lib\lib\Netty_Lib-0.0.1-SNAPSHOT.jar!\com\playmore\net\handler\SendMessageIntercepter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.7
 */