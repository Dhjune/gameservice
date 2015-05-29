package com.mdream.lyservices.model.game.search;

import com.mdream.lyservices.model.game.list.PageKeeper;

public class SearchPageKeeper extends PageKeeper{

	private String  gamename;
	
	public SearchPageKeeper(int page, int rows,String gamename) {
		
		super(page, rows);
		this.gamename =  gamename;
		
	}

	public String getGamename() {
		return gamename;
	}

	public void setGamename(String gamename) {
		this.gamename = gamename;
	}
	
}
