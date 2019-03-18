package com.invilliatest.rest.webservices.restfulwebservices.Exception;
import java.util.Date;

public class ExceptionResponse {
	
	private Date tmeStamp;
	private String message;
	private String detail;
	
	public ExceptionResponse(Date tmeStamp, String message, String detail) {
		super();
		this.tmeStamp = tmeStamp;
		this.message = message;
		this.detail = detail;
	}

	public Date getTmeStamp() {
		return tmeStamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDetail() {
		return detail;
	}
	
}
