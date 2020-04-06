package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.MazeGateS;
import com.playmore.dbobject.staticdb.dao.MazeGateSDaoImpl;
import com.playmore.manager.AbstractManager;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
/**
 * Do not touch! Close it Now! 
 */
@Component
public class MazeGateSManager extends AbstractManager<java.lang.Integer,MazeGateS> {

	@Autowired
	MazeGateSDaoImpl daoImpl;

	private MazeGateSManager(){
	}
	private static final MazeGateSManager DEFAULT = new	MazeGateSManager();
	public static MazeGateSManager getDefault() {
		return DEFAULT;
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
