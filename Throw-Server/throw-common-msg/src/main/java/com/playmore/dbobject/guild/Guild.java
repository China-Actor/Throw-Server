package com.playmore.dbobject.guild;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class Guild implements Serializable {

	@DBFieldName(fieldName="公会id", isNullable="columnNoNulls")
	private long id;
	@DBFieldName(fieldName="公会名称", isNullable="columnNoNulls")
	private String name;
	@DBFieldName(fieldName="会标", isNullable="columnNoNulls")
	private int icon;
	@DBFieldName(fieldName="等级", isNullable="columnNoNulls")
	private int level;
	@DBFieldName(fieldName="状态", externalKey="GuildState", isNullable="columnNoNulls")
	private int state;
	@DBFieldName(fieldName="会长名字", isNullable="columnNoNulls")
	private String leaderName;
	@DBFieldName(fieldName="成员数", isNullable="columnNoNulls")
	private int member;
	@DBFieldName(fieldName="公会资金", isNullable="columnNoNulls")
	private int money;
	@DBFieldName(fieldName="繁荣度", isNullable="columnNoNulls")
	private int boom;
	@DBFieldName(fieldName="当前任务活跃值", isNullable="columnNoNulls")
	private int nowTaskActive;
	@DBFieldName(fieldName="工会任务活跃值", isNullable="columnNullable")
	private int totalTaskActive;
	@DBFieldName(fieldName="准入战力", isNullable="columnNoNulls")
	private int permitPower;
	@DBFieldName(fieldName="申请人数", isNullable="columnNoNulls")
	private int applyCount;
	@DBFieldName(fieldName="宣言", isNullable="columnNoNulls")
	private String outNotice;
	@DBFieldName(fieldName="公告", isNullable="columnNoNulls")
	private String inNotice;
	@DBFieldName(fieldName="创建时间", isNullable="columnNoNulls")
	private String createTime;
	@DBFieldName(fieldName="更新时间", isNullable="columnNoNulls")
	private String updateTime;
	@DBFieldName(fieldName="更新任务活跃", isNullable="columnNullable")
	private String updateTaskActiveTime;
	@DBFieldName(fieldName="公会加入等级", isNullable="columnNullable")
	private int joinLevel;
	@DBFieldName(fieldName="特殊boss", isNullable="columnNullable")
	private int specialBossId;
	@DBFieldName(fieldName="boss开启时间", isNullable="columnNullable")
	private String specialBossStartTime;
	@DBFieldName(fieldName="发送邮件标识", isNullable="columnNullable")
	private boolean specialBossMailFlag;

	public Guild(){
	}

	public void setId(long id) {
		this.id=id;
	}

	public long getId() {
		return id;
	}

	public void setName(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setIcon(int icon) {
		this.icon=icon;
	}

	public int getIcon() {
		return icon;
	}

	public void setLevel(int level) {
		this.level=level;
	}

	public int getLevel() {
		return level;
	}

	public void setState(int state) {
		this.state=state;
	}

	public int getState() {
		return state;
	}

	public void setLeaderName(String leaderName) {
		this.leaderName=leaderName;
	}

	public String getLeaderName() {
		return leaderName;
	}

	public void setMember(int member) {
		this.member=member;
	}

	public int getMember() {
		return member;
	}

	public void setMoney(int money) {
		this.money=money;
	}

	public int getMoney() {
		return money;
	}

	public void setBoom(int boom) {
		this.boom=boom;
	}

	public int getBoom() {
		return boom;
	}

	public void setNowTaskActive(int nowTaskActive) {
		this.nowTaskActive=nowTaskActive;
	}

	public int getNowTaskActive() {
		return nowTaskActive;
	}

	public void setTotalTaskActive(int totalTaskActive) {
		this.totalTaskActive=totalTaskActive;
	}

	public int getTotalTaskActive() {
		return totalTaskActive;
	}

	public void setPermitPower(int permitPower) {
		this.permitPower=permitPower;
	}

	public int getPermitPower() {
		return permitPower;
	}

	public void setApplyCount(int applyCount) {
		this.applyCount=applyCount;
	}

	public int getApplyCount() {
		return applyCount;
	}

	public void setOutNotice(String outNotice) {
		this.outNotice=outNotice;
	}

	public String getOutNotice() {
		return outNotice;
	}

	public void setInNotice(String inNotice) {
		this.inNotice=inNotice;
	}

	public String getInNotice() {
		return inNotice;
	}

	public void setCreateTime(String createTime) {
		this.createTime=createTime;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime=updateTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTaskActiveTime(String updateTaskActiveTime) {
		this.updateTaskActiveTime=updateTaskActiveTime;
	}

	public String getUpdateTaskActiveTime() {
		return updateTaskActiveTime;
	}

	public void setJoinLevel(int joinLevel) {
		this.joinLevel=joinLevel;
	}

	public int getJoinLevel() {
		return joinLevel;
	}

	public void setSpecialBossId(int specialBossId) {
		this.specialBossId=specialBossId;
	}

	public int getSpecialBossId() {
		return specialBossId;
	}

	public void setSpecialBossStartTime(String specialBossStartTime) {
		this.specialBossStartTime=specialBossStartTime;
	}

	public String getSpecialBossStartTime() {
		return specialBossStartTime;
	}

	public void setSpecialBossMailFlag(boolean specialBossMailFlag) {
		this.specialBossMailFlag=specialBossMailFlag;
	}

	public boolean getSpecialBossMailFlag() {
		return specialBossMailFlag;
	}

	public String toString() {
		return "Guild [id=" + id + " ,name=" + name + " ,icon=" + icon + " ,level=" + level + " ,state=" + state + " ,leaderName=" + leaderName + " ,member=" + member + " ,money=" + money + " ,boom=" + boom + " ,nowTaskActive=" + nowTaskActive + " ,totalTaskActive=" + totalTaskActive + " ,permitPower=" + permitPower + " ,applyCount=" + applyCount + " ,outNotice=" + outNotice + " ,inNotice=" + inNotice + " ,createTime=" + createTime + " ,updateTime=" + updateTime + " ,updateTaskActiveTime=" + updateTaskActiveTime + " ,joinLevel=" + joinLevel + " ,specialBossId=" + specialBossId + " ,specialBossStartTime=" + specialBossStartTime + " ,specialBossMailFlag=" + specialBossMailFlag+ "]";
	}
}
