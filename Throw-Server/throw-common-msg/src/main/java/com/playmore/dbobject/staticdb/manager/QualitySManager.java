package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.QualityS;
import com.playmore.dbobject.staticdb.dao.QualitySDaoImpl;
import com.playmore.manager.AbstractManager;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
/**
 * Do not touch! Close it Now! 
 */
@Component
public class QualitySManager extends AbstractManager<java.lang.Integer,QualityS> {

	@Autowired
	QualitySDaoImpl daoImpl;

	private QualitySManager(){
	}
	private static final QualitySManager DEFAULT = new	QualitySManager();
	public static QualitySManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<QualityS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(QualityS t) {
		return t.getId();
	}
}
