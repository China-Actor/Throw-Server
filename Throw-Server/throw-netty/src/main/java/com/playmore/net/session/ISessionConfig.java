package com.playmore.net.session;

import java.io.Serializable;

public interface ISessionConfig extends Serializable {
  public static final boolean SESSION_AUTO_FLUSH_DEFAULT = true;
  
  public static final int READ_IDLE_TIMEOUT_DEFAULT = 1800000;
  
  public static final int WRITE_IDEL_TIMEOUT_DEFAULT = 0;
  
  public static final boolean AUTO_CLOSE_SESSION_WHEN_CHANNEL_CLOSED = true;
  
  boolean isAutoFlush();
  
  ISessionConfig copy();
  
  int getReadIdleTime();
  
  int getWriteIdleTime();
  
  boolean isAutoCloseByChannelClosed();
}


/* Location:              G:\guajiProject\guanji\ProjectS\lib\lib\Netty_Lib-0.0.1-SNAPSHOT.jar!\com\playmore\net\session\ISessionConfig.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.7
 */