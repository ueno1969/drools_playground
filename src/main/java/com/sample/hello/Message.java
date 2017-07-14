package com.sample.hello;

/**
 * Created by k-ueno on 2017/07/14.
 */
public class Message {
	public static final int HELLO = 0;
	public static final int GOODBYE = 1;
	public static final int FINISH = 2;

	private String message;
	private int status;

	public Message() {
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
}
