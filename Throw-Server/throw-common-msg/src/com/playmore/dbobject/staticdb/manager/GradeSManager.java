package com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import com.playmore.dbobject.staticdb.GradeS;
import com.playmore.dbobject.staticdb.dao.GradeSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class GradeSManager extends AbstractManager<java.lang.Integer,GradeS> {

	private GradeSManager(){
	}
	private static final GradeSManager DEFAULT = new	GradeSManager();
	public static GradeSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<GradeS> queryAllFromDb() {
		return GradeSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(GradeS t) {
		return t.getId();
	}
}
