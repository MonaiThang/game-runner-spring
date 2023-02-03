package com.monaithang.gamerunner;

import com.monaithang.gamerunner.game.GameRunner;
import com.monaithang.gamerunner.game.MarioGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();
    }
}
