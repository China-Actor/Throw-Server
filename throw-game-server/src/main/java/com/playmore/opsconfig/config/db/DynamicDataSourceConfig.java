package com.playmore.opsconfig.config.db;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import com.playmore.opsconfig.DataSourceNames;
import com.playmore.opsconfig.DynamicDataSource;

@Configuration
public class DynamicDataSourceConfig {
    
    /**
     * 创建 DataSource Bean
     * */
    
    @Bean
    @ConfigurationProperties("spring.datasource.druid.static")
    public DataSource oneDataSource(){
        DataSource dataSource = DruidDataSourceBuilder.create().build();
        return dataSource;
    }

    @Bean
    @ConfigurationProperties("spring.datasource.druid.game")
    public DataSource twoDataSource(){
        DataSource dataSource = DruidDataSourceBuilder.create().build();
        return dataSource;
    }
    
    /**
     * 如果还有数据源,在这继续添加 DataSource Bean
     * */
    
    @Bean
    @Primary
    public DynamicDataSource dataSource(DataSource oneDataSource, DataSource twoDataSource) {
        Map<Object, Object> targetDataSources = new HashMap<Object, Object>(2);
        targetDataSources.put(DataSourceNames.STATIC, oneDataSource);
        targetDataSources.put(DataSourceNames.GAME, twoDataSource);
        // 还有数据源,在targetDataSources中继续添加
        System.out.println("DataSources:" + targetDataSources);
        return new DynamicDataSource(twoDataSource, targetDataSources);
    }
}