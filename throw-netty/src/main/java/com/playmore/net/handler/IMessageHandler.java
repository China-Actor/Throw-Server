package com.playmore.net.handler;

import com.playmore.net.cmd.CommandMessage;
import com.playmore.net.session.ISession;

public interface IMessageHandler {
  void handle(ISession paramISession, CommandMessage paramCommandMessage) throws Throwable;
}


/* Location:              G:\guajiProject\guanji\ProjectS\lib\lib\Netty_Lib-0.0.1-SNAPSHOT.jar!\com\playmore\net\handler\IMessageHandler.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.7
 */