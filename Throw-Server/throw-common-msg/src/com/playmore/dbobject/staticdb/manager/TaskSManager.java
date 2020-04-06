package com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import com.playmore.dbobject.staticdb.TaskS;
import com.playmore.dbobject.staticdb.dao.TaskSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class TaskSManager extends AbstractManager<java.lang.Integer,TaskS> {

	private TaskSManager(){
	}
	private static final TaskSManager DEFAULT = new	TaskSManager();
	public static TaskSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<TaskS> queryAllFromDb() {
		return TaskSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(TaskS t) {
		return t.getId();
	}
}
