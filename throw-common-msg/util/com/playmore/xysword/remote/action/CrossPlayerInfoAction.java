package com.playmore.xysword.remote.action;

import java.util.List;

import com.playmore.dbobject.gameserver.PlayerInfo;
import com.playmore.dbobject.guild.GuildBossHurt;
import com.playmore.msg.x2gameserver.BaseRequest;
import com.playmore.msg.x2gameserver.EquipmentCardRequest;
import com.playmore.msg.x2gameserver.MailInfo;
import com.playmore.msg.x2gameserver.QueryObject;
import com.playmore.remote.annotation.MainCMD;
import com.playmore.remote.annotation.SubCMD;
import com.playmore.xysword.enumtype.CrossCommand;

@MainCMD(CrossCommand.COMMS)
public interface CrossPlayerInfoAction {
	
	@SubCMD(value=1,async=true)
	Object getPlayerInfo(int serverId,PlayerInfo msg);

	@SubCMD(value=2,async=true)
	Object guildApply(int serverId, List<Long> playerIds);
	
	@SubCMD(value=3,async=true)
	Object guildLog(long guildId, int duty, int type, String...args);
	
	@SubCMD(value=13,async=true)
	Object guildBossRewardMail(List<GuildBossHurt> list);

	@SubCMD(value=14,async=true)
	Object sendMail(List<Long> playerIds, int type,Object... param);
	/**---------------���ѿ��----------**/
	@SubCMD(value=4,async=true)
	Object findFriendBlack(QueryObject request);
	
	@SubCMD(value=5,async=true)
	Object pushApplyFriendInfo(QueryObject request);
	
	@SubCMD(value=6,async=true)
	Object applyFriendResult(QueryObject request);
	
	@SubCMD(value=7,async=true)
	Object giveFriendGift(QueryObject request);
	
	@SubCMD(value=8,async=true)
	Object deleteFriendResult(QueryObject request);
	
	@SubCMD(value=9,async=true)
	Object findAppleFriend(QueryObject request);

	@SubCMD(value=10,async=true)
	Object findPersonInfo(BaseRequest request);
	
	@SubCMD(value=11,async=true)
	Object friendBattleFormation(EquipmentCardRequest request);

	
	@SubCMD(value=12,async=true)
	Object findEquipmentCards(BaseRequest request);

	
	
	

	
}