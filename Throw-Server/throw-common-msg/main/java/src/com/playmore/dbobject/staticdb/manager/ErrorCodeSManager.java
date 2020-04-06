package main.java.com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import main.java.com.playmore.dbobject.staticdb.ErrorCodeS;
import main.java.com.playmore.dbobject.staticdb.dao.ErrorCodeSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class ErrorCodeSManager extends AbstractManager<java.lang.Integer,ErrorCodeS> {

	private ErrorCodeSManager(){
	}
	private static final ErrorCodeSManager DEFAULT = new	ErrorCodeSManager();
	public static ErrorCodeSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<ErrorCodeS> queryAllFromDb() {
		return ErrorCodeSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(ErrorCodeS t) {
		return t.getId();
	}
}
