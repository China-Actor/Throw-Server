package com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import com.playmore.dbobject.staticdb.TaskBoxS;
import com.playmore.dbobject.staticdb.dao.TaskBoxSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class TaskBoxSManager extends AbstractManager<java.lang.Integer,TaskBoxS> {

	private TaskBoxSManager(){
	}
	private static final TaskBoxSManager DEFAULT = new	TaskBoxSManager();
	public static TaskBoxSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<TaskBoxS> queryAllFromDb() {
		return TaskBoxSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(TaskBoxS t) {
		return t.getId();
	}
}
