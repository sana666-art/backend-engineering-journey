package com.example.learn_spring_framework;

import com.example.learn_spring_framework.enterprise.example.MyWebController;
import com.example.learn_spring_framework.game.GameRunner;
//import com.example.learn_spring_framework.game.MarioGame;
//import com.example.learn_spring_framework.game.SuperContraGame;


import com.example.learn_spring_framework.game.PacManGame;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.lang.module.Configuration;

@SpringBootApplication
//@ComponentScan("com.example.learn_spring_framework")
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {

//		MarioGame game = new MarioGame();
//		SuperContraGame game = new SuperContraGame();
//		PacManGame game = new PacManGame();

//		GamingConsole game;
//      game = new PacManGame();

//      GameRunner runner = new GameRunner(game);

//		GameRunner runner = context.getBean(GameRunner.class);
//		runner.run();
		ConfigurableApplicationContext context;
		context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);

		MyWebController controller = context.getBean(MyWebController.class);
		System.out.println(controller.returnValueFromBusinessService());
	}

}
