package com.group.channel;

import java.util.List;

import org.java_websocket.WebSocket;

public class Socket {
	
	private String key;
	
	private List<WebSocket> webSocket;
	
	public String getKey() {
		return key;
	}
	
	public void setKey(String key) {
		this.key = key;
	}
	
	public List<WebSocket> getWebSocket() {
		return webSocket;
	}
	
	public void setWebSocket(List<WebSocket> webSocket) {
		this.webSocket = webSocket;
	}
	

}
