package com.jsp.estorezz.util;

public class AppResponse {
	
	private String status;
	
	private String statusCode;
	
	private String error;
	
	private Object data;

	public AppResponse(String status, String statusCode, String error, Object data) {
		super();
		this.status = status;
		this.statusCode = statusCode;
		this.error = error;
		this.data = data;
	}

	@Override
	public String toString() {
		return "AppResponse [status=" + status + ", statusCode=" + statusCode + ", error=" + error + ", data=" + data
				+ "]";
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	

}
