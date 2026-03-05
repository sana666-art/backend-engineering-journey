package com.example.learn_spring_framework.game;

import com.example.learn_spring_framework.GamingConsole;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PacManGame implements GamingConsole {

    public void up() {
        System.out.println("UP PacManGame");
    }

    public void down() {
        System.out.println("DOWN PacManGame");
    }

    public void left() {
        System.out.println("LEFT PacManGame");
    }

    public void right() {
        System.out.println("RIGHT PacManGame");
    }
}