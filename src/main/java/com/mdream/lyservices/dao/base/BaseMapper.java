package com.mdream.lyservices.dao.base;

import com.mdream.lyservices.model.base.Application;

public interface BaseMapper {
	
	public Application getAppinfo(int id) throws Exception;
	
}
