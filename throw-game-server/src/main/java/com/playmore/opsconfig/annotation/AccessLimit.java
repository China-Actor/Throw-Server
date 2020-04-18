package com.playmore.opsconfig.annotation;

import java.lang.annotation.*;

/**
 * 定义注释，主键
 * 
 * @author Host-0222
 * 
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AccessLimit
{
	int seconds();
}
