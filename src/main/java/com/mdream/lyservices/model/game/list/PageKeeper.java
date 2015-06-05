package com.mdream.lyservices.model.game.list;

public class PageKeeper {

	private int start_row;
	private int end_row;
	private int page;
	private int rows;
	
	
	public PageKeeper(int page,int rows){
		start_row = rows*(page-1);
		end_row = rows;
		this.page = page;
		this.rows = rows;
	}
	
	public int getStart_row() {
		return start_row;
	}
	public void setStart_row(int start_row) {
		this.start_row = start_row;
	}
	public int getEnd_row() {
		return end_row;
	}
	public void setEnd_row(int end_row) {
		this.end_row = end_row;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	
}
