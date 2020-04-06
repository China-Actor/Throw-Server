package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.GradeS;
import com.playmore.dbobject.staticdb.dao.GradeSDaoImpl;
import com.playmore.manager.AbstractManager;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
/**
 * Do not touch! Close it Now! 
 */
@Component
public class GradeSManager extends AbstractManager<java.lang.Integer,GradeS> {

	@Autowired
	GradeSDaoImpl daoImpl;

	private GradeSManager(){
	}
	private static final GradeSManager DEFAULT = new	GradeSManager();
	public static GradeSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<GradeS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(GradeS t) {
		return t.getId();
	}
}
