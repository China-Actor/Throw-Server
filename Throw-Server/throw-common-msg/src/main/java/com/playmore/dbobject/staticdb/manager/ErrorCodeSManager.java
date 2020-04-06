package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.ErrorCodeS;
import com.playmore.dbobject.staticdb.dao.ErrorCodeSDaoImpl;
import com.playmore.manager.AbstractManager;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
/**
 * Do not touch! Close it Now! 
 */
@Component
public class ErrorCodeSManager extends AbstractManager<java.lang.Integer,ErrorCodeS> {

	@Autowired
	ErrorCodeSDaoImpl daoImpl;

	private ErrorCodeSManager(){
	}
	private static final ErrorCodeSManager DEFAULT = new	ErrorCodeSManager();
	public static ErrorCodeSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<ErrorCodeS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(ErrorCodeS t) {
		return t.getId();
	}
}
