package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.QualityS;
import com.playmore.dbobject.staticdb.dao.QualitySDaoImpl;
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
public class QualitySManager extends AbstractManager<java.lang.Integer,QualityS> {

	@Autowired
	QualitySDaoImpl daoImpl;


	@Override 
	public void load() {
	}

	@DataSource(DataSourceNames.STATIC)
	public void init() {
		super.load();
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
