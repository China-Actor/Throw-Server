package com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class ControlS implements Serializable {

	@DBFieldName(fieldName="控制类型", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="控制名称", isNullable="columnNullable")
	private String name;
	@DBFieldName(fieldName="表现效果", isNullable="columnNullable")
	private String show;
	@DBFieldName(fieldName="打断动作", isNullable="columnNullable")
	private int interruptAction;
	@DBFieldName(fieldName="打断技能", isNullable="columnNullable")
	private int interruptSkill;
	@DBFieldName(fieldName="能否行动", isNullable="columnNullable")
	private int enableAct;
	@DBFieldName(fieldName="能否使用技能", isNullable="columnNullable")
	private int enableSkill;
	@DBFieldName(fieldName="是否停止", isNullable="columnNullable")
	private int pause;
	@DBFieldName(fieldName="是否能成为目标", isNullable="columnNullable")
	private int isTarget;
	@DBFieldName(fieldName="击退格数", isNullable="columnNullable")
	private int repel;
	@DBFieldName(fieldName="是否可以移动", isNullable="columnNullable")
	private int enableMove;
	@DBFieldName(fieldName="是否可以重叠", isNullable="columnNullable")
	private int enableOverlay;
	@DBFieldName(fieldName="种类", isNullable="columnNullable")
	private int kind;

	public ControlS(){
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

	public void setShow(String show) {
		this.show=show;
	}

	public String getShow() {
		return show;
	}

	public void setInterruptAction(int interruptAction) {
		this.interruptAction=interruptAction;
	}

	public int getInterruptAction() {
		return interruptAction;
	}

	public void setInterruptSkill(int interruptSkill) {
		this.interruptSkill=interruptSkill;
	}

	public int getInterruptSkill() {
		return interruptSkill;
	}

	public void setEnableAct(int enableAct) {
		this.enableAct=enableAct;
	}

	public int getEnableAct() {
		return enableAct;
	}

	public void setEnableSkill(int enableSkill) {
		this.enableSkill=enableSkill;
	}

	public int getEnableSkill() {
		return enableSkill;
	}

	public void setPause(int pause) {
		this.pause=pause;
	}

	public int getPause() {
		return pause;
	}

	public void setIsTarget(int isTarget) {
		this.isTarget=isTarget;
	}

	public int getIsTarget() {
		return isTarget;
	}

	public void setRepel(int repel) {
		this.repel=repel;
	}

	public int getRepel() {
		return repel;
	}

	public void setEnableMove(int enableMove) {
		this.enableMove=enableMove;
	}

	public int getEnableMove() {
		return enableMove;
	}

	public void setEnableOverlay(int enableOverlay) {
		this.enableOverlay=enableOverlay;
	}

	public int getEnableOverlay() {
		return enableOverlay;
	}

	public void setKind(int kind) {
		this.kind=kind;
	}

	public int getKind() {
		return kind;
	}

	public String toString() {
		return "ControlS [id=" + id + " ,name=" + name + " ,show=" + show + " ,interruptAction=" + interruptAction + " ,interruptSkill=" + interruptSkill + " ,enableAct=" + enableAct + " ,enableSkill=" + enableSkill + " ,pause=" + pause + " ,isTarget=" + isTarget + " ,repel=" + repel + " ,enableMove=" + enableMove + " ,enableOverlay=" + enableOverlay + " ,kind=" + kind+ "]";
	}
}
