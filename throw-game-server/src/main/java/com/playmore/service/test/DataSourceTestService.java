package com.playmore.service.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.playmore.annotation.DataSource;
import com.playmore.dbobject.staticdb.dao.ArenaSDaoImpl;
import com.playmore.opsconfig.DataSourceNames;
@Component
public class DataSourceTestService {
	//@Autowired
	ArenaSDaoImpl dao;

  
    @DataSource(DataSourceNames.STATIC)
    public void test2(){
    	int size = dao.queryAll().size();
    	System.out.println("查询:"+size);
    }
}