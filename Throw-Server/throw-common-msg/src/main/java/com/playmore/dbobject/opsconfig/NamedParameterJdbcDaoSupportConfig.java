package com.playmore.dbobject.opsconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;

@Configuration
public class NamedParameterJdbcDaoSupportConfig {

	@Bean
	public NamedParameterJdbcDaoSupport getNamedParameterJdbcDaoSupport(JdbcTemplate jdbcTemplate) {
		NamedParameterJdbcDaoSupport dao=new NamedParameterJdbcDaoSupport();
		dao.setJdbcTemplate(jdbcTemplate);
		return dao;
	}
}
