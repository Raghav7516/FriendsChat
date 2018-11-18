package com.group.service;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.util.Collection;
import java.util.List;

import org.java_websocket.WebSocket;
import org.java_websocket.drafts.Draft;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.server.WebSocketServer;

public class WebsocketServerService extends WebSocketServer{

	public WebsocketServerService(int port) {
		super(new InetSocketAddress(port));
	}

	@Override
	public void onMessage(WebSocket conn, ByteBuffer message) {
		super.onMessage(conn, message);
	}


	@Override
	public void onWebsocketCloseInitiated(WebSocket conn, int code, String reason) {
		super.onWebsocketCloseInitiated(conn, code, reason);
	}


	@Override
	public void onWebsocketClosing(WebSocket conn, int code, String reason, boolean remote) {
		super.onWebsocketClosing(conn, code, reason, remote);
	}


	@Override
	protected void releaseBuffers(WebSocket c) throws InterruptedException {
		super.releaseBuffers(c);
	}


	@Override
	protected boolean removeConnection(WebSocket ws) {
		return super.removeConnection(ws);
	}


	@Override
	public void run() {
		super.run();
	}


	@Override
	public void start() {
		super.start();
	}


	@Override
	public void stop() throws IOException, InterruptedException {
		super.stop();
	}


	@Override
	public void stop(int arg0) throws IOException, InterruptedException {
		super.stop(arg0);
	}


	public WebsocketServerService(InetSocketAddress port) {
		super(port);
	}
	
	@Override
	public void onOpen(WebSocket webSocket, ClientHandshake handshake) {
		System.out.println("server handshake : "+handshake.getResourceDescriptor());
		webSocket.getReadyState();
	}

	@Override
	public void onMessage(WebSocket webSocket, String msg) {
		System.out.println("Server message :"+msg);
		webSocket.send("HI");
	}
	

	@Override
	public void onClose(WebSocket webSocket, int status, String msg, boolean b) {
		System.out.println("close :"+"status :"+status+" "+b+" msg :"+msg);
		if (b==true) {
			System.out.println("closed");
		} else {
			webSocket.send("websocket close");
		}
	}

	@Override
	public void onError(WebSocket webSocket, Exception exception) {
		System.out.println(exception);
		webSocket.send("Error");
	}



	@Override
	protected boolean addConnection(WebSocket ws) {
		return super.addConnection(ws);
	}
	
	
	@Override
	protected void allocateBuffers(WebSocket c) throws InterruptedException {
		super.allocateBuffers(c);
	}
	
	
	@Override
	public Collection<WebSocket> connections() {
		return super.connections();
	}
	
	
	@Override
	public ByteBuffer createBuffer() {
		return super.createBuffer();
	}
	
	
	@Override
	public InetSocketAddress getAddress() {
		return super.getAddress();
	}
	
	
	@Override
	public List<Draft> getDraft() {
		return super.getDraft();
	}
	
	
	@Override
	protected String getFlashSecurityPolicy() {
		return super.getFlashSecurityPolicy();
	}
	
	
	@Override
	public InetSocketAddress getLocalSocketAddress(WebSocket conn) {
		return super.getLocalSocketAddress(conn);
	}
	
	
	@Override
	public int getPort() {
		return super.getPort();
	}
	
	
	@Override
	public InetSocketAddress getRemoteSocketAddress(WebSocket conn) {
		return super.getRemoteSocketAddress(conn);
	}
	
	
	@Override
	public void onCloseInitiated(WebSocket conn, int code, String reason) {
		super.onCloseInitiated(conn, code, reason);
	}
	
	
	@Override
	public void onClosing(WebSocket conn, int code, String reason, boolean remote) {
		super.onClosing(conn, code, reason, remote);
	}
	
	
	@Override
	protected boolean onConnect(SelectionKey key) {
		return super.onConnect(key);
	}
}
