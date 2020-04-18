package main.java.com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class TaskS implements Serializable {

	@DBFieldName(fieldName="任务id", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="系统类型（1.日常任务 2.周常任务 3.主线任务）", isNullable="columnNullable")
	private int type;
	@DBFieldName(fieldName="系统任务排序（不同页签下任务排序先后）", isNullable="columnNullable")
	private int sort;
	@DBFieldName(fieldName="任务类型（1.任意英雄等级达到xx级）", isNullable="columnNullable")
	private int tasktype;
	@DBFieldName(fieldName="系统任务组（主线任务中，同一类型任务属于同一组，完成前置任务后显示下一任务）", isNullable="columnNullable")
	private int taskgroup;
	@DBFieldName(fieldName="任务组顺序", isNullable="columnNullable")
	private int groupsort;
	@DBFieldName(fieldName="任务名称", isNullable="columnNullable")
	private String title;
	@DBFieldName(fieldName="任务描述", isNullable="columnNullable")
	private String desc;
	@DBFieldName(fieldName="任务进度（客户端进度显示）", isNullable="columnNullable")
	private int taskprogress;
	@DBFieldName(fieldName="任务类型值1", isNullable="columnNullable")
	private int value1;
	@DBFieldName(fieldName="任务类型值2", isNullable="columnNullable")
	private int value2;
	@DBFieldName(fieldName="任务类型值3", isNullable="columnNullable")
	private int value3;
	@DBFieldName(fieldName="任务奖励", isNullable="columnNullable")
	private int dropid;
	@DBFieldName(fieldName="任务活跃值", isNullable="columnNullable")
	private int taskactivity;
	@DBFieldName(fieldName="链接系统ID", isNullable="columnNullable")
	private int systemid;
	@DBFieldName(fieldName="链接系统ID值", isNullable="columnNullable")
	private int systemvalue;
	@DBFieldName(fieldName="解锁条件", isNullable="columnNullable")
	private int unlock;

	public TaskS(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setType(int type) {
		this.type=type;
	}

	public int getType() {
		return type;
	}

	public void setSort(int sort) {
		this.sort=sort;
	}

	public int getSort() {
		return sort;
	}

	public void setTasktype(int tasktype) {
		this.tasktype=tasktype;
	}

	public int getTasktype() {
		return tasktype;
	}

	public void setTaskgroup(int taskgroup) {
		this.taskgroup=taskgroup;
	}

	public int getTaskgroup() {
		return taskgroup;
	}

	public void setGroupsort(int groupsort) {
		this.groupsort=groupsort;
	}

	public int getGroupsort() {
		return groupsort;
	}

	public void setTitle(String title) {
		this.title=title;
	}

	public String getTitle() {
		return title;
	}

	public void setDesc(String desc) {
		this.desc=desc;
	}

	public String getDesc() {
		return desc;
	}

	public void setTaskprogress(int taskprogress) {
		this.taskprogress=taskprogress;
	}

	public int getTaskprogress() {
		return taskprogress;
	}

	public void setValue1(int value1) {
		this.value1=value1;
	}

	public int getValue1() {
		return value1;
	}

	public void setValue2(int value2) {
		this.value2=value2;
	}

	public int getValue2() {
		return value2;
	}

	public void setValue3(int value3) {
		this.value3=value3;
	}

	public int getValue3() {
		return value3;
	}

	public void setDropid(int dropid) {
		this.dropid=dropid;
	}

	public int getDropid() {
		return dropid;
	}

	public void setTaskactivity(int taskactivity) {
		this.taskactivity=taskactivity;
	}

	public int getTaskactivity() {
		return taskactivity;
	}

	public void setSystemid(int systemid) {
		this.systemid=systemid;
	}

	public int getSystemid() {
		return systemid;
	}

	public void setSystemvalue(int systemvalue) {
		this.systemvalue=systemvalue;
	}

	public int getSystemvalue() {
		return systemvalue;
	}

	public void setUnlock(int unlock) {
		this.unlock=unlock;
	}

	public int getUnlock() {
		return unlock;
	}

	public String toString() {
		return "TaskS [id=" + id + " ,type=" + type + " ,sort=" + sort + " ,tasktype=" + tasktype + " ,taskgroup=" + taskgroup + " ,groupsort=" + groupsort + " ,title=" + title + " ,desc=" + desc + " ,taskprogress=" + taskprogress + " ,value1=" + value1 + " ,value2=" + value2 + " ,value3=" + value3 + " ,dropid=" + dropid + " ,taskactivity=" + taskactivity + " ,systemid=" + systemid + " ,systemvalue=" + systemvalue + " ,unlock=" + unlock+ "]";
	}
}
