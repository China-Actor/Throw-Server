package com.playmore.xysword.constant;

public interface HttpErrorCode {

	/**正确返回状态*/
	short OK = (short)0;
	
	/**参数错误，一般由前台错传参数或者玩家发包造成*/
	short ERROR_PARAMETER = 1;
	
	/**
	 * 异常错误
	 */
	short UNKNOW_EXCEPTION = -127;
	
}
