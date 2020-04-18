package com.playmore;

import static org.hamcrest.CoreMatchers.is;

import java.lang.reflect.Method;
import java.net.SocketAddress;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.dao.DataAccessException;

import com.bottle.c2s.test.S2CReward.RewardItem;
import com.google.protobuf.GeneratedMessageV3.Builder;
import com.playmore.dbobject.gameserver.dao.MazeRobotDaoImpl;
import com.playmore.dbobject.gameserver.queue.MazeRobotDBQueue;
import com.playmore.dbobject.staticdb.manager.ArenaSManager;
import com.playmore.net.cmd.CmdSearcher;
import com.playmore.net.netty.codec.server.IChannelConstants;
import com.playmore.net.netty.session.NettyKeepAliveSession;
import com.playmore.net.session.ISession;
import com.playmore.net.session.ISessionConfig;
import com.playmore.net.session.ISessionHolder;
import com.playmore.net.session.MessageCounter;
import com.playmore.opsconfig.DataSourceAspect;
import com.playmore.opsconfig.config.db.DynamicDataSourceConfig;
import com.playmore.service.test.DataSourceTestService;

import io.netty.channel.Channel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.util.AttributeKey;
@ComponentScan(basePackages = {"com.playmore.dbobject.gameserver.dao",/*"com.playmore.dbobject.gameserver.queue",*/"com.playmore.dbobject.staticdb.dao"
		,"com.playmore.opsconfig","com.playmore.service","com.playmore.dbobject.staticdb.manager"})
@Import({DynamicDataSourceConfig.class})
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class Application {
 
//	@Autowired
//	MazeRobotDaoImpl daoImpl;
//	
//	@Autowired
//	MazeRobotDBQueue queue;
//	
//	@Autowired
//	ArenaSManager manager;
//	
//	@Autowired
//	DataSourceTestService serivce;
//	
//	@Autowired
//	DataSourceAspect as;
//	
	@Autowired
	CmdSearcher cmdSearcher;
	
 
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	static class Con
	{
		public void test(ISession session,RewardItem rewardItem) {
			System.out.println("执行");
		}
	}
	
	@PostConstruct
	public void init() throws Exception {
        // 数据源ONE 
    	try {  
//    		Con c=new Con();
//    		Method method = Con.class.getMethods()[0];
//    		RewardItem.Builder rewardItem=RewardItem.newBuilder();
//    		rewardItem.setId(1).setValue("cc");
//    		method.invoke(c, new Object[] {null,rewardItem.build()});
//    		
//    		Object object = cmdSearcher.getObjectMap().get(Short.valueOf((short) 30));
//    		Method method2 = cmdSearcher.getMethedMap().get(Short.valueOf((short) 30));
//			method2.invoke(object, new Object[] {null,rewardItem.build()});
    		
//    		System.out.println(manager.values().size());
    		//serivce.test2();
    		//System.out.println("xxx--->"+manager);
// 			List<Map<String, Object>> queryForList = daoImpl.getJdbcTemplate().queryForList("SELECT *FROM maze_robot");
//			System.out.println("数据"+JSON.toJSONString(queryForList.get(0)));
//    		System.out.println("id----->"+GameServerIDUtil.getDefault().nextId());
    		
//    		MazeRobot mazeRobot = new MazeRobot();
//    		mazeRobot.setId(3);
//    		queue.insert(mazeRobot);
//    		queue.flush();
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
	}
	

}
