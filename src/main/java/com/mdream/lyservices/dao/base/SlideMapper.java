package com.mdream.lyservices.dao.base;

import java.util.List;
import java.util.Map;

import com.mdream.lyservices.model.base.slide.SlideShowObject;

public interface SlideMapper {
	
	public List<SlideShowObject> getSlideShow(Map params) throws Exception;
	
	public SlideShowObject getSlideShowById(int showid) throws Exception;
	
}
