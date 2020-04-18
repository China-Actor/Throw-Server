/*    */ package com.playmore.net.netty.codec.server;

/*    */
/*    */ import com.playmore.net.session.ISession;

/*    */ import io.netty.util.AttributeKey;

/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */ public interface IChannelConstants
/*    */ {
	// new AttributeKey

	public static final AttributeKey<ISession> ISESSION_ATTRIBUTE_KEY = AttributeKey.newInstance("session");// new AttributeKey("session");
///*    */ 
///*    */ 
///*    */ 
///*    */ 
///*    */   
	public static final AttributeKey<int[]> DECRYPTION_KEYS_ATTRIBUTE_KEY = AttributeKey.newInstance("decryptionKeys");
	/*    */ }

/*
 * Location:
 * G:\guajiProject\guanji\ProjectS\lib\lib\Netty_Lib-0.0.1-SNAPSHOT.jar!\com\
 * playmore\net\netty\codec\server\IChannelConstants.class Java compiler
 * version: 7 (51.0) JD-Core Version: 1.0.7
 */