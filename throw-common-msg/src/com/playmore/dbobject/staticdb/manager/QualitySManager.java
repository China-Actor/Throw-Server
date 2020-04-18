package com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import com.playmore.dbobject.staticdb.QualityS;
import com.playmore.dbobject.staticdb.dao.QualitySDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class QualitySManager extends AbstractManager<java.lang.Integer,QualityS> {

	private QualitySManager(){
	}
	private static final QualitySManager DEFAULT = new	QualitySManager();
	public static QualitySManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<QualityS> queryAllFromDb() {
		return QualitySDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(QualityS t) {
		return t.getId();
	}
}
