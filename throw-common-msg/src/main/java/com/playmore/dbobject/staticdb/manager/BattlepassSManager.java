package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.BattlepassS;
import com.playmore.dbobject.staticdb.dao.BattlepassSDaoImpl;
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
public class BattlepassSManager extends AbstractManager<java.lang.Integer,BattlepassS> {

	@Autowired
	BattlepassSDaoImpl daoImpl;


	@Override 
	public void load() {
	}

	@DataSource(DataSourceNames.STATIC)
	public void init() {
		super.load();
	}
	@Override
	public Collection<BattlepassS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(BattlepassS t) {
		return t.getId();
	}
}
