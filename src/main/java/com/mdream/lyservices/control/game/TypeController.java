package com.mdream.lyservices.control.game;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mdream.lyservices.model.BaseValueObject;
import com.mdream.lyservices.model.ReturnCode;
import com.mdream.lyservices.model.ReturnMsg;
import com.mdream.lyservices.model.game.GameObject;
import com.mdream.lyservices.model.game.list.ListPageKeeper;
import com.mdream.lyservices.model.game.type.TypeObject;
import com.mdream.lyservices.service.game.TypeServiceImp;

@Controller
@RequestMapping("game/type")
public class TypeController {
	
	@Autowired
	private TypeServiceImp typeServiceImp ;
	
	@RequestMapping(value="list",produces = "application/json")
	@ResponseBody
	public BaseValueObject<List<TypeObject>> getList(){
		BaseValueObject<List<TypeObject>> vo =  new BaseValueObject<List<TypeObject>>();		
		List<TypeObject> types = null;				
		try {
			types = typeServiceImp.getTypes(null);
		
			vo.setContent(types);			
		} catch (Exception e) {
			vo.setEcode(ReturnCode.FAILED);
			vo.setEmsg(ReturnMsg.FAILED_MSG);
		}
		
		return vo;
	}
	
}
