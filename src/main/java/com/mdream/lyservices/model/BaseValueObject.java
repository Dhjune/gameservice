package com.mdream.lyservices.model;

public class BaseValueObject<T> implements ReturnCode,ReturnMsg{
	
	private String ecode; 		
	private String emsg;
	
	private T content;
	
	public BaseValueObject(){
		setEcode(SUCESS);
		setEmsg(SUCESS_MSG);
	}
	
	public String getEcode() {
		return ecode;
	}
	
	public void setEcode(String ecode) {
		this.ecode = ecode;
	}
	
	public String getEmsg() {
		return emsg;
	}
	
	public void setEmsg(String emsg) {
		this.emsg = emsg;
	}

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}
	
	

}
