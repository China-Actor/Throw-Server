package com.playmore.opsconfig.interceptor;

import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import com.playmore.opsconfig.annotation.AccessLimit;
import com.playmore.opsconfig.compent.redis.RedisUtil;

/**
 * 同一ip 指定时间限制接口访问
 */
@Component
public class AccessInterceptor implements HandlerInterceptor
{
	private static final Logger LOG = LoggerFactory.getLogger("requestLog");

	/**
	 * 其他缓存
	 */
	@Autowired
	private RedisUtil redisUtil;

	
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception
	{
		if (handler instanceof HandlerMethod)
		{
			HandlerMethod hm = (HandlerMethod) handler;
			// 使用注解
			AccessLimit accessLimit = hm.getMethodAnnotation(AccessLimit.class);
			if (accessLimit == null)
			{
				return true;
			}
			String ip = "";
			String url = request.getRequestURL().toString();
			String key = "req_limit_".concat(url).concat(ip);
			// 1秒
			int seconds = accessLimit.seconds();

			if (redisUtil.get(key) == null)
			{
				redisUtil.set(key, "req", seconds);
				return true;
			}
			render(response);
			LOG.info("访问太频繁:" + key);
			return false;
		}
		return true;
	}

	private void render(HttpServletResponse response) throws Exception
	{
		response.setContentType("application/json;charset=UTF-8");
		OutputStream out = response.getOutputStream();
		String str = "访问太频繁";
		out.write(str.getBytes("UTF-8"));
		out.flush();
		out.close();
	}


}
