package com.playmore.util;

import java.lang.reflect.InvocationTargetException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * LOG配置
 * 
 * @author user
 * 
 */
public class Log4j
{
	/**
	 * 获取异常具体信息
	 * 
	 * @param e
	 * @return
	 */
	public static String getExceptionInfo(Exception e)
	{
		StringBuffer exception = new StringBuffer();
		exception.append(e.getMessage() + "\n");
		StackTraceElement[] messages = e.getStackTrace();
		for (StackTraceElement stackTraceElement : messages)
		{
			exception.append(stackTraceElement + "\n");
		}
		return exception.toString();
	}

	/**
	 * 捕获反射方法向上抛出异常
	 * 
	 * @param e
	 * @return
	 */
	public static String handleException(Exception e)
	{
		StringBuffer exception = new StringBuffer();
		if (e instanceof InvocationTargetException)
		{
			Throwable targetEx = ((InvocationTargetException) e).getTargetException();
			if (targetEx != null)
			{
				exception.append(targetEx.getMessage() + "  ");
				StackTraceElement[] messages = targetEx.getStackTrace();
				for (StackTraceElement stackTraceElement : messages)
				{
					exception.append(stackTraceElement + "\n");
				}

			}
		}
		else
		{
			exception.append(e.getMessage());
		}

		return exception.toString();
	}
}
