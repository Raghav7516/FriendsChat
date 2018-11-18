package com.group;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.group.service.WebsocketServerService;

@SpringBootApplication
public class FriendsChatApplication {
	@Value("${server.socket}")
	public int port;
	public static WebsocketServerService websocketServerService;

	public static void main(String[] args) {
		SpringApplication.run(FriendsChatApplication.class, args);
	}
	
	@EventListener(ApplicationReadyEvent.class)
	public void doAfterStartJob() {
		System.out.println("server socket started on port :"+port);
		websocketServerService =new WebsocketServerService(port);
		websocketServerService.start();
	}
		
}
