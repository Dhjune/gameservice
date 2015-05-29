package com.mdream.lyservices.dao.game;

import java.util.List;

import com.mdream.lyservices.model.game.GameObject;
import com.mdream.lyservices.model.game.info.GameInfoObject;
import com.mdream.lyservices.model.game.list.ListPageKeeper;
import com.mdream.lyservices.model.game.search.SearchPageKeeper;

public interface GameMapper {
	
	public List<GameObject> getGameListByFlag(ListPageKeeper lp)throws Exception;
	
	public List<GameObject> getGameListByType(ListPageKeeper lp)throws Exception;
	
	public List<GameObject> getGameList(ListPageKeeper lp)throws Exception;
		
	public GameInfoObject getGameInfo(int gameid)throws Exception;
	
	public void addPraiseCount(int gameid)throws Exception;
	
	public void addBelittleCount(int gameid)throws Exception;
	
	public List<GameObject> gameSearch(SearchPageKeeper sp)throws Exception;
	
	public int  gameSearchCount(SearchPageKeeper sp)throws Exception;
	
	public int  getPraiseCount(int gameid)throws Exception;
	
	public int  getBelittleCount(int gameid)throws Exception;
	
	public int  gameListCount()throws Exception;
	
	public int gameListByFlagCount(ListPageKeeper lp) throws Exception;
	
	public int gameListByTypeCount(ListPageKeeper lp) throws Exception;
	
}
