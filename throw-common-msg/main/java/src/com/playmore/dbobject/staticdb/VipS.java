package main.java.com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class VipS implements Serializable {

	@DBFieldName(fieldName="ID", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="VIP等级", isNullable="columnNullable")
	private int level;
	@DBFieldName(fieldName="成长值", isNullable="columnNullable")
	private int exp;
	@DBFieldName(fieldName="特权描述", isNullable="columnNullable")
	private String desc;
	@DBFieldName(fieldName="奖励", isNullable="columnNullable")
	private int reward;

	public VipS(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setLevel(int level) {
		this.level=level;
	}

	public int getLevel() {
		return level;
	}

	public void setExp(int exp) {
		this.exp=exp;
	}

	public int getExp() {
		return exp;
	}

	public void setDesc(String desc) {
		this.desc=desc;
	}

	public String getDesc() {
		return desc;
	}

	public void setReward(int reward) {
		this.reward=reward;
	}

	public int getReward() {
		return reward;
	}

	public String toString() {
		return "VipS [id=" + id + " ,level=" + level + " ,exp=" + exp + " ,desc=" + desc + " ,reward=" + reward+ "]";
	}
}
