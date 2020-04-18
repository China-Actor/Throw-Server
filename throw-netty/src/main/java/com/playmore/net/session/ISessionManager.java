package com.playmore.net.session;

import java.util.Collection;
import java.util.Iterator;

public interface ISessionManager {
  ISession get(Number paramNumber);
  
  ISession create(Object paramObject, Number paramNumber) throws ExistIdentityException;
  
  void changeIdentity(Number paramNumber1, Number paramNumber2) throws SessionNotFoundException, ExistIdentityException;
  
  void remove(ISession paramISession);
  
  ISession remove(Number paramNumber);
  
  int size();
  
  Collection<ISession> getAll();
  
  Iterator<ISession> iterator();
  
  boolean isEmpty();
  
  void closeAllSessions();
}


/* Location:              G:\guajiProject\guanji\ProjectS\lib\lib\Netty_Lib-0.0.1-SNAPSHOT.jar!\com\playmore\net\session\ISessionManager.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.7
 */