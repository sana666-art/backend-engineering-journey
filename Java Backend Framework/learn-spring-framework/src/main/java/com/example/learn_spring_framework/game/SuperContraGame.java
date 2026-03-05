package com.example.learn_spring_framework.game;

import com.example.learn_spring_framework.GamingConsole;

public class SuperContraGame implements GamingConsole {

    public void up() {
        System.out.println("UP SuperContraGame");
    }
    public void down() {
        System.out.println("DOWN SuperContraGame");
    }
    public void left() {
        System.out.println("LEFT SuperContraGame");
    }
    public void right() {
        System.out.println("RIGHT SuperContraGame");
    }
}
