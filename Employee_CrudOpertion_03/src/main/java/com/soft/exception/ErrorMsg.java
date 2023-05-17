package com.soft.exception;

import java.util.Date;

public class ErrorMsg {
	
	private int code;
	private String description;
	private Date date;
	public ErrorMsg() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ErrorMsg(int code, String description, Date date) {
		super();
		this.code = code;
		this.description = description;
		this.date = date;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
	

}
