package com.mdream.lyservices.model;

public interface ReturnCode {
	
	public static final String SUCESS = "0";
	public static final String FAILED = "-1";	
	public static final String ERROR = "-2";
	
	public static final String USER_NAME_DUPICATE = "-20000";
	public static final String USER_MOBILE_DUPICATE = "-20001";
	public static final String USER_VERIFICATION_CODE_ERROR = "-20002";
//	public static final String USER_NEED_VERIFICATION_CODE = "-20003";
//	public static final String USER_NEED_PASSWORD = "-20004";
	
}
