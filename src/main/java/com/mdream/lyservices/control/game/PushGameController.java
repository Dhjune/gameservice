package com.mdream.lyservices.control.game;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mdream.lyservices.model.BaseValueObject;
import com.mdream.lyservices.model.ReturnCode;
import com.mdream.lyservices.model.ReturnMsg;
import com.mdream.lyservices.model.game.list.ListGameObject;
import com.mdream.lyservices.model.game.list.ListPageKeeper;

@Controller
@RequestMapping("pushgame")
public class PushGameController {
	
	//根据四个场景分别获取游戏列表
		@RequestMapping(value="list/{flag}/{page}",produces = "application/json")
		@ResponseBody
		public BaseValueObject<ListGameObject> getListByFlag(@PathVariable String flag,@PathVariable int page){
			ListGameObject lg = new ListGameObject ();	
			BaseValueObject<ListGameObject> vo =  new BaseValueObject<ListGameObject>();		
			try {
			//	lg = gameServiceImp.getListGameObjectByFlag(new ListPageKeeper(page, 10, flag, ""));
				lg.setPage(page);
			
				vo.setContent(lg);			
			} catch (Exception e) {
				vo.setEcode(ReturnCode.FAILED);
				vo.setEmsg(ReturnMsg.FAILED_MSG);
			}
			
			return vo;
			
			
		}
	
}
