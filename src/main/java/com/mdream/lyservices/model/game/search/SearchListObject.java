package com.mdream.lyservices.model.game.search;

import java.util.List;

import com.mdream.lyservices.model.game.GameObject;
import com.mdream.lyservices.model.game.list.ListObject;

public class SearchListObject extends ListObject{
	
	private int count;
	
	private List<GameObject> games;
	
	public SearchListObject(int count,List<GameObject> games){
		this.count = count;
		this.games = games;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public List<GameObject> getGames() {
		return games;
	}

	public void setGames(List<GameObject> games) {
		this.games = games;
	}
	
	

}
