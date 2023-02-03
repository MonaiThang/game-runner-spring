package com.monaithang.gamerunner.game;

public class MarioGame implements GamingConsole {
    public void down() {
        System.out.println("Dive down into pipe");
    }
    public void left() {
        System.out.println("Go back");
    }
    public void right() {
        System.out.println("Go forward");
    }
    public void up() {
        System.out.println("Jump");
    }
}
