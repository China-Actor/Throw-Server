package com.playmore.net.session;

public interface ISessionHolder {
  void channelClosed();
  
  void channelActived();
  
  ISession getSession();
}


/* Location:              G:\guajiProject\guanji\ProjectS\lib\lib\Netty_Lib-0.0.1-SNAPSHOT.jar!\com\playmore\net\session\ISessionHolder.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.7
 */