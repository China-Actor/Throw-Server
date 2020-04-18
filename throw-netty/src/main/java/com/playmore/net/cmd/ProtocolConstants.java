package com.playmore.net.cmd;

public interface ProtocolConstants {
  public static final short DEFAULT_HEADER_SIZE = 10;
  
  public static final short FLAG = 28987;
  
  public static final int FLAG_AND_LENGTH_DATA_SIZE = 6;
  
  public static final int HEAD_WITHOUT_FLAG_AND_LENGTH_SIZE = 4;
  
  public static final int CHECKSUM_SIZE = 2;
  
  public static final int CHECKSUM_SKIP_SIZE_FOR_CONTENT = 8;
}


/* Location:              G:\guajiProject\guanji\ProjectS\lib\lib\Netty_Lib-0.0.1-SNAPSHOT.jar!\com\playmore\net\cmd\ProtocolConstants.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.7
 */