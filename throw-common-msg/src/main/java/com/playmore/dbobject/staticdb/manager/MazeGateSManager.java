package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.MazeGateS;
import com.playmore.dbobject.staticdb.dao.MazeGateSDaoImpl;
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
public class MazeGateSManager extends AbstractManager<java.lang.Integer,MazeGateS> {

	@Autowired
	MazeGateSDaoImpl daoImpl;


	@Override 
	public void load() {
	}

	@DataSource(DataSourceNames.STATIC)
	public void init() {
		super.load();
	}
	@Override
	public Collection<MazeGateS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(MazeGateS t) {
		return t.getId();
	}
}
