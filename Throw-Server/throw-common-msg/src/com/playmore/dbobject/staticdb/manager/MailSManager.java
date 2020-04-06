package com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import com.playmore.dbobject.staticdb.MailS;
import com.playmore.dbobject.staticdb.dao.MailSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class MailSManager extends AbstractManager<java.lang.Integer,MailS> {

	private MailSManager(){
	}
	private static final MailSManager DEFAULT = new	MailSManager();
	public static MailSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<MailS> queryAllFromDb() {
		return MailSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(MailS t) {
		return t.getId();
	}
}
