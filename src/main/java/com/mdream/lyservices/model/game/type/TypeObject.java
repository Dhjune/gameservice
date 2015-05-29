package com.mdream.lyservices.model.game.type;

import java.util.List;

import com.mdream.lyservices.model.game.tag.TagObject;

public class TypeObject {
	
	
	private String typeid;
	
	private String typename;
	
	private List<TagObject> tags;

	public String getTypeid() {
		return typeid;
	}

	public void setTypeid(String typeid) {
		this.typeid = typeid;
	}

	public String getTypename() {
		return typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}

	public List<TagObject> getTags() {
		return tags;
	}

	public void setTags(List<TagObject> tags) {
		this.tags = tags;
	}
	
	
}
