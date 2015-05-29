package com.mdream.lyservices.dao.game;

import java.util.List;
import java.util.Map;

import com.mdream.lyservices.model.game.type.TypeObject;

public interface TypeMapper {
	
	public List<TypeObject> getTypes(Map params)throws Exception;

}
