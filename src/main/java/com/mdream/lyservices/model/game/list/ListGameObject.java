package com.mdream.lyservices.model.game.list;

import java.util.List;

import com.mdream.lyservices.model.game.GameObject;

public class ListGameObject extends ListObject{

	private String sort="";
	
	private String flag="";
	
	private int totalpage ;
	
	private List<GameObject> games;

	public List<GameObject> getGames() {
		return games;
	}

	public void setGames(List<GameObject> games) {
		this.games = games;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public int getTotalpage() {
		return totalpage;
	}

	public void setTotalpage(int totalpage) {
		this.totalpage = totalpage;
	}
	
	
	
}
