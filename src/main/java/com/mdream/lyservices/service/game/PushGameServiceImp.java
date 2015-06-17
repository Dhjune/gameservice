package com.mdream.lyservices.service.game;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mdream.lyservices.dao.game.PushGameMapper;
import com.mdream.lyservices.model.game.list.ListGameObject;
import com.mdream.lyservices.model.game.list.ListPageKeeper;

@Service
@Transactional(value=TxType.NOT_SUPPORTED)
public class PushGameServiceImp {
	
	@Autowired
	private PushGameMapper pushGameMapper;
	
	public ListGameObject getListGameObjectByFlag(ListPageKeeper lp) throws Exception{
		ListGameObject lg = new ListGameObject();
		lg.setGames(pushGameMapper.getPushGameListByFlag(lp));
		int counts = pushGameMapper.pushGameListByFlagCount(lp);
		int totalpage = counts/10;
		if(counts%10!=0){
			totalpage +=1;
		}
		lg.setTotalpage(totalpage);
	
		return lg;
	}	
	
}
