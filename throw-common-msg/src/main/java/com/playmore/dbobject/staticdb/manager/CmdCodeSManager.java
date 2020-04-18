package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.CmdCodeS;
import com.playmore.dbobject.staticdb.dao.CmdCodeSDaoImpl;
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
public class CmdCodeSManager extends AbstractManager<java.lang.String,CmdCodeS> {

	@Autowired
	CmdCodeSDaoImpl daoImpl;


	@Override 
	public void load() {
	}

	@DataSource(DataSourceNames.STATIC)
	public void init() {
		super.load();
	}
	@Override
	public Collection<CmdCodeS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.String getKey(CmdCodeS t) {
		return t.getId();
	}
}
