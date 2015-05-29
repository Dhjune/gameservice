package com.mdream.lyservices.control.client;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mdream.lyservices.model.BaseValueObject;
import com.mdream.lyservices.model.ReturnCode;
import com.mdream.lyservices.model.ReturnMsg;
import com.mdream.lyservices.model.base.slide.SlideShowObject;
import com.mdream.lyservices.service.base.SlideServiceImp;

@Controller
@RequestMapping("client")
public class SlideController {

	@Autowired
	private SlideServiceImp slideServiceImp;
		
	
	//轮播场景,首页，最热，分类等。是字幕，还是图片，id号
	@RequestMapping(value="slideshow/{showtype}/{scene}",produces = "application/json")
	@ResponseBody
	public BaseValueObject<SlideShowObject> getSlide(@PathVariable String scene,@PathVariable String showtype){
		Map<String,String> params =  new HashMap<String,String>();
		params.put("scene", scene);
		params.put("showtype", showtype);
		BaseValueObject<SlideShowObject> vo =  new BaseValueObject<SlideShowObject>();
		SlideShowObject show = null;
	    try {
			show = slideServiceImp.getSlideShow(params);
			vo.setContent(show);
			
		} catch (Exception e) {
			vo.setEcode(ReturnCode.FAILED);
			vo.setEcode(ReturnMsg.FAILED_MSG);
		}	
		return vo;
	}
	
	//轮播场景,首页，最热，分类等。是字幕，还是图片，id号
	@RequestMapping(value="slideshow/{showid}",produces = "application/json")
	@ResponseBody
	public BaseValueObject<SlideShowObject>  getSlide(@PathVariable int showid){
		
		BaseValueObject<SlideShowObject> vo =  new BaseValueObject<SlideShowObject>();
		SlideShowObject show = null;
	    try {
			show = slideServiceImp.getSlideShow(showid);
			vo.setContent(show);			
		} catch (Exception e) {
			vo.setEcode(ReturnCode.FAILED);
			vo.setEcode(ReturnMsg.FAILED_MSG);
		}	
		return vo;	
		
	}
}
