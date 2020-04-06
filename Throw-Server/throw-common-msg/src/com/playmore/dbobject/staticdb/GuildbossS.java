package com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class GuildbossS implements Serializable {

	@DBFieldName(fieldName="id", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="怪物组ID", isNullable="columnNullable")
	private String bossid;
	@DBFieldName(fieldName="品阶（弃用）", isNullable="columnNullable")
	private int quailty;
	@DBFieldName(fieldName="等级（弃用）", isNullable="columnNullable")
	private int level;
	@DBFieldName(fieldName="boss类型", isNullable="columnNullable")
	private int type;
	@DBFieldName(fieldName="刷新类型", isNullable="columnNullable")
	private int refresh;
	@DBFieldName(fieldName="消耗活跃度数量", isNullable="columnNullable")
	private int cost;
	@DBFieldName(fieldName="战斗背景图", isNullable="columnNullable")
	private int image;
	@DBFieldName(fieldName="BOSS奖励预览包", isNullable="columnNullable")
	private int preview;

	public GuildbossS(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setBossid(String bossid) {
		this.bossid=bossid;
	}

	public String getBossid() {
		return bossid;
	}

	public void setQuailty(int quailty) {
		this.quailty=quailty;
	}

	public int getQuailty() {
		return quailty;
	}

	public void setLevel(int level) {
		this.level=level;
	}

	public int getLevel() {
		return level;
	}

	public void setType(int type) {
		this.type=type;
	}

	public int getType() {
		return type;
	}

	public void setRefresh(int refresh) {
		this.refresh=refresh;
	}

	public int getRefresh() {
		return refresh;
	}

	public void setCost(int cost) {
		this.cost=cost;
	}

	public int getCost() {
		return cost;
	}

	public void setImage(int image) {
		this.image=image;
	}

	public int getImage() {
		return image;
	}

	public void setPreview(int preview) {
		this.preview=preview;
	}

	public int getPreview() {
		return preview;
	}

	public String toString() {
		return "GuildbossS [id=" + id + " ,bossid=" + bossid + " ,quailty=" + quailty + " ,level=" + level + " ,type=" + type + " ,refresh=" + refresh + " ,cost=" + cost + " ,image=" + image + " ,preview=" + preview+ "]";
	}
}
