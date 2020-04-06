package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.RewardlevelS;
import com.playmore.dbobject.staticdb.dao.RewardlevelSDaoImpl;
import com.playmore.manager.AbstractManager;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
/**
 * Do not touch! Close it Now! 
 */
@Component
public class RewardlevelSManager extends AbstractManager<java.lang.Integer,RewardlevelS> {

	@Autowired
	RewardlevelSDaoImpl daoImpl;

	private RewardlevelSManager(){
	}
	private static final RewardlevelSManager DEFAULT = new	RewardlevelSManager();
	public static RewardlevelSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<RewardlevelS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(RewardlevelS t) {
		return t.getId();
	}
}
