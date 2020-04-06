package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.MazeCardsS;
import com.playmore.dbobject.staticdb.dao.MazeCardsSDaoImpl;
import com.playmore.manager.AbstractManager;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
/**
 * Do not touch! Close it Now! 
 */
@Component
public class MazeCardsSManager extends AbstractManager<java.lang.Integer,MazeCardsS> {

	@Autowired
	MazeCardsSDaoImpl daoImpl;

	private MazeCardsSManager(){
	}
	private static final MazeCardsSManager DEFAULT = new	MazeCardsSManager();
	public static MazeCardsSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<MazeCardsS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(MazeCardsS t) {
		return t.getId();
	}
}
