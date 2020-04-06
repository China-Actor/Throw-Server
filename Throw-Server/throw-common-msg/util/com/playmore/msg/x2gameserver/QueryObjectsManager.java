package com.playmore.msg.x2gameserver;


public class QueryObjectsManager {

	private static class DEFAULT {
		private static final QueryObjectsManager provider = new QueryObjectsManager();
	}

	public static QueryObjectsManager getDefault() {
		return DEFAULT.provider;
	}

	
	public QueryObjects executeQueryObjects(int cmd ,long playerId ,Object...param)
	{
		QueryObjects obj =new QueryObjects();
		obj.setCmd(cmd+"_"+playerId);
		obj.setKey(param);
		return obj;
	}
	
	
	public QueryObjects AddQueryObjects(QueryObjects obj,Object...param)
	{
		Object [] objArr = obj.getKey();
		for (int i = 0; i < param.length; i++) {
			objArr[objArr.length+i+1] = param[i];
		}
	
		return obj;
	}
	
	
	public static void main(String[] args) 
	{
		
	}
	
	
	
}
