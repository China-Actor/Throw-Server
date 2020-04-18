package com.playmore.net.util.concurrent;

public interface IoSessionFuture {
  boolean isDone();
  
  boolean isCancelled();
  
  boolean isSuccess();
  
  Throwable getCause();
}


/* Location:              G:\guajiProject\guanji\ProjectS\lib\lib\Netty_Lib-0.0.1-SNAPSHOT.jar!\com\playmore\ne\\util\concurrent\IoSessionFuture.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.7
 */