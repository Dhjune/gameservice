package com.mdream.lyservices.service.base;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mdream.lyservices.dao.base.BaseMapper;
import com.mdream.lyservices.model.base.Application;

@Service
@Transactional(value=TxType.NOT_SUPPORTED)
public class BaseServiceImp {

	
	@Autowired
	private BaseMapper baseMapper;
	
	public Application getAppInfo(int id) throws Exception{
		return baseMapper.getAppinfo(id);
	}
	
	
}
