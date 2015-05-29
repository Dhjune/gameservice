package com.mdream.lyservices.model.game.info;

import java.util.List;

import com.mdream.lyservices.model.game.GameObject;
import com.mdream.lyservices.model.game.comment.CommentObject;
import com.mdream.lyservices.model.game.pics.GamePicObject;
import com.mdream.lyservices.model.game.type.GameTypeObject;

public class GameInfoObject extends GameObject{
	
	private List<GamePicObject> pics;
	
	private List<CommentObject> comments;
	
	private List<GameTypeObject> types;
	
	private int praisecount;
	
	private int belittlecount;
	
	private String description;
	
	private String gameimg;

	public List<GamePicObject> getPics() {
		return pics;
	}

	public void setPics(List<GamePicObject> pics) {
		this.pics = pics;
	}

	public List<CommentObject> getComments() {
		return comments;
	}

	public void setComments(List<CommentObject> comments) {
		this.comments = comments;
	}

	public int getPraisecount() {
		return praisecount;
	}

	public void setPraisecount(int praisecount) {
		this.praisecount = praisecount;
	}

	public int getBelittlecount() {
		return belittlecount;
	}

	public void setBelittlecount(int belittlecount) {
		this.belittlecount = belittlecount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGameimg() {
		return gameimg;
	}

	public void setGameimg(String gameimg) {
		this.gameimg = gameimg;
	}

	public List<GameTypeObject> getTypes() {
		return types;
	}

	public void setTypes(List<GameTypeObject> types) {
		this.types = types;
	}
	
	
}
