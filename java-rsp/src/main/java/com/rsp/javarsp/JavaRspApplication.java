package com.rsp.javarsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.rsp.game.player.player;

@SpringBootApplication
public class JavaRspApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaRspApplication.class, args);
		player p = new player();
	
		p.chooseCard();
		p.makeResult();
	}


}
