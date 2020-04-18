package com.playmore.msghandler;

import com.bottle.c2s.test.S2CReward.RewardItem;
import com.playmore.net.cmd.CMD;
import com.playmore.net.session.ISession;

public class TestHandler {

	/**
	 * 登录响应
	 * @param session
	 * @param res
	 */
	public void reward(ISession v, @CMD(cmd = 30) RewardItem reward) {  
		System.out.println("收到协议:"+reward);
	}

//	public void reward(String v, @CMD(cmd = 30) RewardItem reward) {  
//		System.out.println("收到协议:"+reward);
//	}
 
}
