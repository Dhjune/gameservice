package com.mdream.lyservices.dao.game;

import java.util.List;
import java.util.Map;

import com.mdream.lyservices.model.game.comment.CommentObject;

public interface CommentMapper {
	
	public CommentObject getComment(Map params)throws Exception;
	
	public List<CommentObject> getCommentsBygameId(int gameid)throws Exception;
	
	public void addCount(Map params)throws Exception;
	
	public int getGameCommentCount(Map params)throws Exception;
	
}
