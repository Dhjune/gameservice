package com.mdream.lyservices.service.game;

import java.util.List;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mdream.lyservices.dao.game.GameMapper;
import com.mdream.lyservices.model.game.GameObject;
import com.mdream.lyservices.model.game.info.GameInfoObject;
import com.mdream.lyservices.model.game.list.ListGameObject;
import com.mdream.lyservices.model.game.list.ListPageKeeper;
import com.mdream.lyservices.model.game.search.SearchListObject;
import com.mdream.lyservices.model.game.search.SearchPageKeeper;

@Service
@Transactional(value=TxType.NOT_SUPPORTED)
public class GameServiceImp {
	
	@Autowired
	private GameMapper  gameMapper ;
	
	public ListGameObject getListGameObjectByFlag(ListPageKeeper lp) throws Exception{
		ListGameObject lg = new ListGameObject();
		lg.setGames(gameMapper.getGameListByFlag(lp));
		int counts = gameMapper.gameListByFlagCount(lp);
		int totalpage = counts/10;
		if(counts%10!=0){
			totalpage +=1;
		}
		lg.setTotalpage(totalpage);
	
		return lg;
	}		
	
	public ListGameObject getListGameObjectByType(ListPageKeeper lp) throws Exception{
		ListGameObject lg = new ListGameObject();
		lg.setGames(gameMapper.getGameListByType(lp));
		int counts = gameMapper.gameListByTypeCount(lp);
		int totalpage = counts/10;
		if(counts%10!=0){
			totalpage +=1;
		}
		lg.setTotalpage(totalpage);
	
		return lg;
	}	
	
	public ListGameObject getListGameObject(ListPageKeeper lp) throws Exception{
		ListGameObject lg = new ListGameObject();
		lg.setGames(gameMapper.getGameList(lp));
		int counts = gameMapper.gameListCount();
		int totalpage = counts/10;
		if(counts%10!=0){
			totalpage +=1;
		}
		lg.setTotalpage(totalpage);
		return lg;
	}	
	
	public List<GameObject> getGameListByFlag(ListPageKeeper lp) throws Exception{
		return  gameMapper.getGameListByFlag(lp);
	}		
	
	public List<GameObject> getGameListByType(ListPageKeeper lp) throws Exception{
		return gameMapper.getGameListByType(lp);
	}
		
	public List<GameObject> getGameList(ListPageKeeper lp) throws Exception{
		return gameMapper.getGameList(lp);
	}
	
	public GameInfoObject getGameInfo(int gameid) throws Exception{
		return gameMapper.getGameInfo(gameid);
	}
	
	public int addPraiseCount(int gameid) throws Exception{
		
		gameMapper.addPraiseCount(gameid);
		return gameMapper.getPraiseCount(gameid);
	}
	
	public int addBelittleCount(int gameid) throws Exception{
		gameMapper.addBelittleCount(gameid);
		return gameMapper.getBelittleCount(gameid);
	}
	
	
	public SearchListObject gameSearch(SearchPageKeeper sp)throws Exception{
				 
		return new SearchListObject(gameMapper.gameSearchCount(sp),gameMapper.gameSearch(sp));
		
	}
	
	public int getGameListByFlagCount(ListPageKeeper lp) throws Exception{
		return gameMapper.gameListByFlagCount(lp);
	}
	
	public int getGameListByTypeCount(ListPageKeeper lp) throws Exception{
		return gameMapper.gameListByTypeCount(lp);
	}
	
	public int getGameListCount() throws Exception{
		return gameMapper.gameListCount();
	}


}
