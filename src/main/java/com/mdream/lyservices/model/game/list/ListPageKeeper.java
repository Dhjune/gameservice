package com.mdream.lyservices.model.game.list;


public class ListPageKeeper extends PageKeeper {

	private String flag = "0";
	
	private String typeid;
	
	public ListPageKeeper(int page, int rows,String flag,String typeid) {
		super(page, rows);
		this.typeid = typeid;
		if(flag != null && (flag.equals("1") ||flag.equals("2")||flag.equals("3")||flag.equals("4") )){
			this.flag = flag;
		}
	}

	
	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}


	public String getTypeid() {
		return typeid;
	}


	public void setTypeid(String typeid) {
		this.typeid = typeid;
	}

	
	
}
