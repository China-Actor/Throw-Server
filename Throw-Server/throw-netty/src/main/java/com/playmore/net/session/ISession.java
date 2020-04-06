package com.playmore.net.session;

import java.net.SocketAddress;
import java.util.concurrent.atomic.AtomicInteger;

import com.google.protobuf.GeneratedMessageV3;

public interface ISession {
  Number getId();
  
  boolean isOpen();
  
  AtomicInteger getProcessingCmd();
  
  void resetProcessingCmd();
  
  boolean isActive();
  
  void channelActived(Object paramObject);
  
  byte getStatus();
  
  Object getAttribute(Object paramObject);
  
  void setAttribute(Object paramObject1, Object paramObject2);
  
  void setSessionHolder(ISessionHolder paramISessionHolder);
  
  void removeAttribute(Object paramObject);
  
  SocketAddress localAddress();
  
  SocketAddress remoteAddress();
  
  boolean isWritable();
  
  boolean isAutoRead();
  
  void flush();
  
  void read();
  
  boolean write(Object paramObject);
  
  boolean write(short paramShort, GeneratedMessageV3.Builder<?> paramBuilder);
  
  void close(boolean paramBoolean1, boolean paramBoolean2);
  
  void channelClosed();
  
  Object getIoChannel();
  
  void setIoChannel(Object paramObject);
  
  ISessionHolder getSessionHolder();
  
  ISessionConfig getConfig();
  
  MessageCounter getMessgeCounter();
  
  boolean isIdleTimeout();
  
  boolean isReadIdleTimeout();
  
  boolean isWriteIdleTimeout();
  
  int[] getEncryptionKeys();
  
  int[] getDecryptionKeys();
}


/* Location:              G:\guajiProject\guanji\ProjectS\lib\lib\Netty_Lib-0.0.1-SNAPSHOT.jar!\com\playmore\net\session\ISession.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.7
 */