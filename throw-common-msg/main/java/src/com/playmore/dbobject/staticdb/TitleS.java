package main.java.com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class TitleS implements Serializable {

	@DBFieldName(fieldName="章节ID", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="章节名称", isNullable="columnNullable")
	private String name;
	@DBFieldName(fieldName="章节名", isNullable="columnNullable")
	private String title;
	@DBFieldName(fieldName="章节顺序", isNullable="columnNullable")
	private int order;
	@DBFieldName(fieldName="关卡数", isNullable="columnNullable")
	private int stageNum;
	@DBFieldName(fieldName="背景图", isNullable="columnNullable")
	private int image;
	@DBFieldName(fieldName="解锁条件", isNullable="columnNullable")
	private int condition;
	@DBFieldName(fieldName="解锁条件值", isNullable="columnNullable")
	private int conditionValue1;
	@DBFieldName(fieldName="解锁条件值", isNullable="columnNullable")
	private int conditionValue2;
	@DBFieldName(fieldName="挂机怪物", isNullable="columnNullable")
	private int hangMonster;

	public TitleS(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setTitle(String title) {
		this.title=title;
	}

	public String getTitle() {
		return title;
	}

	public void setOrder(int order) {
		this.order=order;
	}

	public int getOrder() {
		return order;
	}

	public void setStageNum(int stageNum) {
		this.stageNum=stageNum;
	}

	public int getStageNum() {
		return stageNum;
	}

	public void setImage(int image) {
		this.image=image;
	}

	public int getImage() {
		return image;
	}

	public void setCondition(int condition) {
		this.condition=condition;
	}

	public int getCondition() {
		return condition;
	}

	public void setConditionValue1(int conditionValue1) {
		this.conditionValue1=conditionValue1;
	}

	public int getConditionValue1() {
		return conditionValue1;
	}

	public void setConditionValue2(int conditionValue2) {
		this.conditionValue2=conditionValue2;
	}

	public int getConditionValue2() {
		return conditionValue2;
	}

	public void setHangMonster(int hangMonster) {
		this.hangMonster=hangMonster;
	}

	public int getHangMonster() {
		return hangMonster;
	}

	public String toString() {
		return "TitleS [id=" + id + " ,name=" + name + " ,title=" + title + " ,order=" + order + " ,stageNum=" + stageNum + " ,image=" + image + " ,condition=" + condition + " ,conditionValue1=" + conditionValue1 + " ,conditionValue2=" + conditionValue2 + " ,hangMonster=" + hangMonster+ "]";
	}
}
