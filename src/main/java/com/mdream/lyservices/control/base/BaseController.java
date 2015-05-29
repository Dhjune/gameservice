package com.mdream.lyservices.control.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mdream.lyservices.model.BaseValueObject;
import com.mdream.lyservices.model.ReturnCode;
import com.mdream.lyservices.model.ReturnMsg;
import com.mdream.lyservices.model.base.Application;
import com.mdream.lyservices.service.base.BaseServiceImp;

@Controller
@RequestMapping("base")
public class BaseController {
	
	@Autowired
	private BaseServiceImp baseServiceImp;
	
	@RequestMapping(value="appinfo",produces = "application/json")
	@ResponseBody
	public BaseValueObject<Application> getInfo(){
		
		BaseValueObject<Application> vo =  new BaseValueObject<Application>();
		Application app = null;
		try {
			app = baseServiceImp.getAppInfo(1);
			vo.setContent(app);
			
		} catch (Exception e) {			
			vo.setEcode(ReturnCode.FAILED);
			vo.setEmsg(ReturnMsg.FAILED_MSG);						
		}
		return vo;
	}
	
}
