package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.BattlepassS;
import com.playmore.dbobject.staticdb.dao.BattlepassSDaoImpl;
import com.playmore.manager.AbstractManager;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
/**
 * Do not touch! Close it Now! 
 */
@Component
public class BattlepassSManager extends AbstractManager<java.lang.Integer,BattlepassS> {

	@Autowired
	BattlepassSDaoImpl daoImpl;

	private BattlepassSManager(){
	}
	private static final BattlepassSManager DEFAULT = new	BattlepassSManager();
	public static BattlepassSManager getDefault() {
		return DEFAULT;
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
