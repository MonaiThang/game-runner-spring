package com.monaithang.gamerunner.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Pacman")
public class PacmanGame implements GamingConsole {
    public void down() {
        System.out.println("Down");
    }
    public void left() {
        System.out.println("Left");
    }
    public void right() {
        System.out.println("Right");
    }
    public void up() {
        System.out.println("Up");
    }
}
