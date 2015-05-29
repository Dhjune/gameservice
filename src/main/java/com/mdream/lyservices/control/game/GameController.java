package com.mdream.lyservices.control.game;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mdream.lyservices.model.BaseValueObject;
import com.mdream.lyservices.model.ReturnCode;
import com.mdream.lyservices.model.ReturnMsg;
import com.mdream.lyservices.model.game.GameObject;
import com.mdream.lyservices.model.game.comment.CommentObject;
import com.mdream.lyservices.model.game.info.GameInfoObject;
import com.mdream.lyservices.model.game.list.ListGameObject;
import com.mdream.lyservices.model.game.list.ListPageKeeper;
import com.mdream.lyservices.model.game.search.SearchListObject;
import com.mdream.lyservices.model.game.search.SearchPageKeeper;
import com.mdream.lyservices.service.game.CommentServiceImp;
import com.mdream.lyservices.service.game.GameServiceImp;

@Controller
@RequestMapping("game")
public class GameController {
	
	@Autowired
	private GameServiceImp  gameServiceImp;
	
	@Autowired
	private CommentServiceImp commentServiceImp;
	
	//根据四个场景分别获取游戏列表
	@RequestMapping(value="list/{flag}/{page}",produces = "application/json")
	@ResponseBody
	public BaseValueObject<ListGameObject> getListByFlag(@PathVariable String flag,@PathVariable int page){
		ListGameObject lg = new ListGameObject ();	
		BaseValueObject<ListGameObject> vo =  new BaseValueObject<ListGameObject>();		
		try {
			lg = gameServiceImp.getListGameObjectByFlag(new ListPageKeeper(page, 10, flag, ""));
			lg.setPage(page);
		
			vo.setContent(lg);			
		} catch (Exception e) {
			vo.setEcode(ReturnCode.FAILED);
			vo.setEmsg(ReturnMsg.FAILED_MSG);
		}
		
		return vo;
		
		
	}
	@RequestMapping(value="list/all/{page}",produces = "application/json")
	@ResponseBody
	public BaseValueObject<ListGameObject> getList(@PathVariable int page){
		ListGameObject lg = new ListGameObject ();	
		BaseValueObject<ListGameObject> vo =  new BaseValueObject<ListGameObject>();			
		try {
			
			lg = gameServiceImp.getListGameObject(new ListPageKeeper(page, 10, "0", ""));
			lg.setPage(page);
		
			vo.setContent(lg);				
		} catch (Exception e) {
			vo.setEcode(ReturnCode.FAILED);
			vo.setEmsg(ReturnMsg.FAILED_MSG);
		}
		
		return vo;
	}
	
	@RequestMapping(value="listtype/{typeid}/{page}",produces = "application/json")
	@ResponseBody
	public BaseValueObject<ListGameObject>  getListByType(@PathVariable String typeid,@PathVariable int page){
		ListGameObject lg = new ListGameObject ();	
		BaseValueObject<ListGameObject> vo =  new BaseValueObject<ListGameObject>();			
		try {
			
			lg = gameServiceImp.getListGameObjectByType(new ListPageKeeper(page, 10, "", typeid));
			lg.setPage(page);
		
			vo.setContent(lg);				
		} catch (Exception e) {
			vo.setEcode(ReturnCode.FAILED);
			vo.setEmsg(ReturnMsg.FAILED_MSG);
		}
				
		return vo;
		//return gameServiceImp.getGameListByFlag(new ListPageKeeper(page, 10, "", typeid));
	}
	
	@RequestMapping(value="search/{page}",produces = "application/json")
	@ResponseBody
	public  BaseValueObject<SearchListObject> search(@PathVariable int page,@RequestParam("gamename") String gamename,HttpServletRequest request){
		BaseValueObject<SearchListObject> vo =  new BaseValueObject<SearchListObject>();
		try {
			System.out.println(request.getRequestURL());
			System.out.println(gamename);

	//		gamename= new String(gamename.getBytes("ISO-8859-1"),"UTF-8");
//			
			gamename = URLDecoder.decode("" 
					+ gamename, 
					"UTF-8"); 
		} catch (UnsupportedEncodingException e1) {
		
			e1.printStackTrace();
		}
		System.out.println(gamename);
		SearchListObject slist = null;
		try {
			
			slist = gameServiceImp.gameSearch(new SearchPageKeeper(page, 10, gamename));
			vo.setContent(slist);
			
			
		} catch (Exception e) {
			vo.setEcode(ReturnCode.FAILED);
			vo.setEmsg(ReturnMsg.FAILED_MSG);
		}
		return  vo;
		//return gameServiceImp.gameSearch(new SearchPageKeeper(page, 10, gamename));
		
	}
		
	
	@RequestMapping(value="info/{gameid}",produces = "application/json")
	@ResponseBody
	public BaseValueObject<GameInfoObject> getInfo(@PathVariable int gameid){
		
		BaseValueObject<GameInfoObject> vo =  new BaseValueObject<GameInfoObject>();
		GameInfoObject info = null;
		
		try {
			info = gameServiceImp.getGameInfo(gameid);
			vo.setContent(info);			
		} catch (Exception e) {
			vo.setEcode(ReturnCode.FAILED);
			vo.setEmsg(ReturnMsg.FAILED_MSG);
		}
	
		return vo;
		
		//return gameServiceImp.getGameInfo(gameid);
	}
	
	
	//和评价列表一样，可以加入到gameInfo中，具体还得思考
	@RequestMapping(value="pics/{gameid}",produces = "application/json")
	@ResponseBody
	public void getpics(){
		
		
		
	}
	
	@RequestMapping(value="praise/{gameid}/add",produces = "application/json")
	@ResponseBody
	public BaseValueObject<Map<String,Integer>> addPraise(@PathVariable int gameid){
		BaseValueObject<Map<String,Integer>> vo = new BaseValueObject<Map<String,Integer>>();
		try {
			int count = gameServiceImp.addPraiseCount(gameid);
			Map<String,Integer> content =  new HashMap <String,Integer>();
			content.put("count", count);
			vo.setContent(content);
		} catch (Exception e) {
			vo.setEcode(ReturnCode.FAILED);
			vo.setEmsg(ReturnMsg.FAILED_MSG);
		}
		return vo;
	}
	
	@RequestMapping(value="belittle/{gameid}/add",produces = "application/json")
	@ResponseBody
	public BaseValueObject<Map<String,Integer>> addBelittle(@PathVariable int gameid){
		BaseValueObject<Map<String,Integer>> vo = new BaseValueObject<Map<String,Integer>>();
		try {
			int count = gameServiceImp.addBelittleCount(gameid);
			Map<String,Integer> content =  new HashMap <String,Integer>();
			content.put("count", count);
			vo.setContent(content);
		} catch (Exception e) {
			vo.setEcode(ReturnCode.FAILED);
			vo.setEmsg(ReturnMsg.FAILED_MSG);
		}
		return vo;
				
	}
	
	
	
	
	@RequestMapping(value="comment/{gameid}/{commentid}/add",produces = "application/json")
	@ResponseBody
	public BaseValueObject<Map<String,Integer>> addComment(@PathVariable("gameid") String gameid,@PathVariable("commentid") String commentid){
		Map<String,String> params =  new HashMap<String,String>();
		params.put("gameid", gameid);
		params.put("commentid", commentid);
		BaseValueObject<Map<String,Integer>> vo = new BaseValueObject<Map<String,Integer>>();
		try {
			commentServiceImp.addCount(params);
			int count =  commentServiceImp.getGameCommentCount(params);
			Map<String,Integer> content =  new HashMap <String,Integer>();
			content.put("count", count);
			vo.setContent(content);
		} catch (Exception e) {
			vo.setEcode(ReturnCode.FAILED);
			vo.setEmsg(ReturnMsg.FAILED_MSG);
		}
		
		return vo;		
	}
	
	
	//和截图列表一样，可以加入到gameInfo中，具体还得思考
	@RequestMapping(value="comment/list/{gameid}",produces = "application/json")
	@ResponseBody
	public BaseValueObject<List<CommentObject>> getCommentList(@PathVariable int gameid) {
		BaseValueObject<List<CommentObject>> vo = new BaseValueObject<List<CommentObject>>();
		 try {
			 
			List<CommentObject> comments = commentServiceImp.getCommentsBygameId(gameid);
			vo.setContent(comments);
			
		} catch (Exception e) {
			
			vo.setEcode(ReturnCode.FAILED);
			vo.setEmsg(ReturnMsg.FAILED_MSG);
		}
		return vo;
	}
	
	
	
	
}
