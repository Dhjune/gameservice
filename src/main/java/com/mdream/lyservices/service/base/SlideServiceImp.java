package com.mdream.lyservices.service.base;

import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mdream.lyservices.dao.base.SlideMapper;
import com.mdream.lyservices.model.base.slide.SlideShowObject;

@Service
@Transactional(value=TxType.NOT_SUPPORTED)
public class SlideServiceImp {

	@Autowired
	private SlideMapper slideMapper;
	
	public SlideShowObject getSlideShow(Map params) throws Exception{
		List<SlideShowObject> list =  slideMapper.getSlideShow(params);
		int size = list.size();
		//System.out.println("sdfasljglasjglkasjgklasfjg:"+size);
		if(size>0 && size<2){
			return list.get(0);
		}else if(size <=0){
			return null;
		}else{
			Random random = new Random(size-1);
			return list.get(random.nextInt());
		}			
	}
	
	public SlideShowObject getSlideShow(int showid) throws Exception{
		return  slideMapper.getSlideShowById(showid);
	}
	
}
