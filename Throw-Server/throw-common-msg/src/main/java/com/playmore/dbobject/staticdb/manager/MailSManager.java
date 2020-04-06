package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.MailS;
import com.playmore.dbobject.staticdb.dao.MailSDaoImpl;
import com.playmore.manager.AbstractManager;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
/**
 * Do not touch! Close it Now! 
 */
@Component
public class MailSManager extends AbstractManager<java.lang.Integer,MailS> {

	@Autowired
	MailSDaoImpl daoImpl;

	private MailSManager(){
	}
	private static final MailSManager DEFAULT = new	MailSManager();
	public static MailSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<MailS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(MailS t) {
		return t.getId();
	}
}
