package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.RewardlevelS;
import com.playmore.dbobject.staticdb.dao.RewardlevelSDaoImpl;
import com.playmore.manager.AbstractManager;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
import com.playmore.annotation.DataSource;
import com.playmore.opsconfig.DataSourceNames;
/**
 * Do not touch! Close it Now! 
 */
@Component
public class RewardlevelSManager extends AbstractManager<java.lang.Integer,RewardlevelS> {

	@Autowired
	RewardlevelSDaoImpl daoImpl;


	@Override 
	public void load() {
	}

	@DataSource(DataSourceNames.STATIC)
	public void init() {
		super.load();
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
