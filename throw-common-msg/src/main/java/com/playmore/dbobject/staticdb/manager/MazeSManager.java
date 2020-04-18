package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.MazeS;
import com.playmore.dbobject.staticdb.dao.MazeSDaoImpl;
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
public class MazeSManager extends AbstractManager<java.lang.Integer,MazeS> {

	@Autowired
	MazeSDaoImpl daoImpl;


	@Override 
	public void load() {
	}

	@DataSource(DataSourceNames.STATIC)
	public void init() {
		super.load();
	}
	@Override
	public Collection<MazeS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(MazeS t) {
		return t.getId();
	}
}
