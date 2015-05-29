package com.mdream.lyservices.model;

public interface ReturnMsg {
	
	public static final String SUCESS_MSG = "ok";
	public static final String FAILED_MSG = "failed";	
	public static final String ERROR_MSG = "error";
	
	public static final String USER_NAME_DUPICATE_MSG = "用户名已存在";
	public static final String USER_MOBILE_DUPICATE_MSG = "手机号码已存在";
	public static final String USER_VERIFICATION_CODE_ERROR_MSG = "验证码错误";
	
//	public static final String USER_NEED_VERIFICATION_CODE_MSG = "用户待验证";
//	public static final String USER_NEED_PASSWORD_MSG = "待设置密码";
	
}
