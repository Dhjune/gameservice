package com.mdream.lyservices.service.game;

import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mdream.lyservices.dao.game.CommentMapper;
import com.mdream.lyservices.model.game.comment.CommentObject;

@Service
@Transactional(value=TxType.NOT_SUPPORTED)
public class CommentServiceImp {
	
	@Autowired
	private CommentMapper commentMapper;
	
	
	public CommentObject getComment(Map params) throws Exception{
		return commentMapper.getComment(params);
	}
	
	public List<CommentObject> getCommentsBygameId(int gameid) throws Exception{
		return  commentMapper.getCommentsBygameId(gameid);
	}
	
	public void addCount(Map params) throws Exception{
		commentMapper.addCount(params);
	}
	
	public int getGameCommentCount(Map params)throws Exception{
		return commentMapper.getGameCommentCount(params);
	}
	
	
}
