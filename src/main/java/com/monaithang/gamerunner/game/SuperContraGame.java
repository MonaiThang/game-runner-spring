package com.monaithang.gamerunner.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContra")
public class SuperContraGame implements GamingConsole {
    public void down() {
        System.out.println("Duck down");
    }
    public void left() {
        System.out.println("Go back");
    }
    public void right() {
        System.out.println("Fire!");
    }
    public void up() {
        System.out.println("Up");
    }
}
