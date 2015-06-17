package com.mdream.lyservices.dao.game;

import java.util.List;

import com.mdream.lyservices.model.game.GameObject;
import com.mdream.lyservices.model.game.list.ListPageKeeper;

public interface PushGameMapper {
	
	public List<GameObject> getPushGameListByFlag(ListPageKeeper lp)throws Exception;
	
	public int pushGameListByFlagCount(ListPageKeeper lp) throws Exception;

}
