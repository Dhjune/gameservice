package com.mdream.lyservices.service.game;

import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mdream.lyservices.dao.game.TypeMapper;
import com.mdream.lyservices.model.game.type.TypeObject;

@Service
@Transactional(value=TxType.NOT_SUPPORTED)
public class TypeServiceImp {
	
	@Autowired
	private TypeMapper typeMapper;
	
	public List<TypeObject> getTypes(Map params)throws Exception{
		return typeMapper.getTypes(params);
	}
}
