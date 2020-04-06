package com.playmore;

import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.dao.DataAccessException;

import com.alibaba.fastjson.JSON;
import com.playmore.dbobject.gameserver.dao.MazeRobotDaoImpl;
import com.playmore.dbobject.gameserver.queue.MazeRobotDBQueue;
import com.playmore.opsconfig.config.db.DynamicDataSourceConfig;
import com.playmore.util.GameServerIDUtil;
@ComponentScan(basePackages = {"com.playmore.dbobject.gameserver.dao","com.playmore.dbobject.gameserver.queue","com.playmore.dbobject.opsconfig"})
@Import({DynamicDataSourceConfig.class})
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class TestBootApplication {
 
	@Autowired
	MazeRobotDaoImpl daoImpl;
	
	@Autowired
	MazeRobotDBQueue queue;
	
	public static void main(String[] args) {
		SpringApplication.run(TestBootApplication.class, args);
	}
	
	@PostConstruct
	public void init() throws Exception {
        // 数据源ONE
    	try {
    		System.out.println("xxx"+daoImpl );
 			List<Map<String, Object>> queryForList = daoImpl.getJdbcTemplate().queryForList("SELECT *FROM maze_robot");
			System.out.println("数据"+JSON.toJSONString(queryForList));
    		System.out.println("id----->"+GameServerIDUtil.getDefault().nextId());
    		
//    		MazeRobot mazeRobot = new MazeRobot();a
//    		mazeRobot.setId(3);
//    		queue.insert(mazeRobot);
//    		queue.flush();
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
	}

}
