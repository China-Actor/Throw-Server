package com.playmore.opsconfig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.playmore.opsconfig.interceptor.AccessInterceptor;

@Configuration
public class CustomerWebAppConfigurer implements WebMvcConfigurer
{
	public void addCorsMappings(CorsRegistry registry)
	{
		registry.addMapping("/**")
				.allowedOrigins("*")
				.allowedMethods("PUT", "DELETE","GET","POST","OPTIONS")
				.allowedHeaders("*")
				.exposedHeaders("access-control-allow-headers",
						"access-control-allow-methods",
						"access-control-allow-origin",
						"access-control-max-age",
						"X-Frame-Options")
				.allowCredentials(false).maxAge(7200);
	}


//	private CorsConfiguration corsConfig() {
//		CorsConfiguration corsConfiguration = new CorsConfiguration();
//		corsConfiguration.addAllowedOrigin("*");
//		corsConfiguration.addAllowedHeader("*");
//		corsConfiguration.addAllowedMethod("*");
//		corsConfiguration.setAllowCredentials(true);
//		corsConfiguration.setMaxAge(3600L);
//		return corsConfiguration;
//	}
//	@Bean
//	public CorsFilter corsFilter() {
//		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//		source.registerCorsConfiguration("/**", corsConfig());
//		return new CorsFilter(source);
//	}

	/**
	 * 添加AccessInterceptor初始化(拦截器在IOC容器之前初始化)
	 *
	 * @return
	 */
	@Bean
	public AccessInterceptor getAccessInterceptors()
	{
		return new AccessInterceptor();
	}

	/**
	 * 配置拦截器
	 *
	 * @param registry
	 */
	public void addInterceptors(InterceptorRegistry registry)
	{
		//这里可以添加多个拦截器
		registry.addInterceptor(getAccessInterceptors()).addPathPatterns("/**");
	}
}
