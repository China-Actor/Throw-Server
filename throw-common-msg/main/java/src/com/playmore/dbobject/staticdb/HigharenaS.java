package main.java.com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class HigharenaS implements Serializable {

	@DBFieldName(fieldName="ID", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="分段类型（1最强王者，2钻石，3白金，4黄金，5白银，6青铜）", isNullable="columnNullable")
	private int type;
	@DBFieldName(fieldName="分段人数", isNullable="columnNullable")
	private int num;
	@DBFieldName(fieldName="段位名称（仅显示段位，数值程序自定义）", isNullable="columnNullable")
	private String name;
	@DBFieldName(fieldName="每小时获得的徽章奖励", isNullable="columnNullable")
	private int reward1;
	@DBFieldName(fieldName="每小时获得的积分奖励", isNullable="columnNullable")
	private int reward2;
	@DBFieldName(fieldName="每日活跃奖励", isNullable="columnNullable")
	private int dailyreward;
	@DBFieldName(fieldName="初始机器人", isNullable="columnNullable")
	private int robot;

	public HigharenaS(){
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

	public void setNum(int num) {
		this.num=num;
	}

	public int getNum() {
		return num;
	}

	public void setName(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setReward1(int reward1) {
		this.reward1=reward1;
	}

	public int getReward1() {
		return reward1;
	}

	public void setReward2(int reward2) {
		this.reward2=reward2;
	}

	public int getReward2() {
		return reward2;
	}

	public void setDailyreward(int dailyreward) {
		this.dailyreward=dailyreward;
	}

	public int getDailyreward() {
		return dailyreward;
	}

	public void setRobot(int robot) {
		this.robot=robot;
	}

	public int getRobot() {
		return robot;
	}

	public String toString() {
		return "HigharenaS [id=" + id + " ,type=" + type + " ,num=" + num + " ,name=" + name + " ,reward1=" + reward1 + " ,reward2=" + reward2 + " ,dailyreward=" + dailyreward + " ,robot=" + robot+ "]";
	}
}
