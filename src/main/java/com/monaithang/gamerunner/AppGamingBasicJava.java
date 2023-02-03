package com.monaithang.gamerunner;

import com.monaithang.gamerunner.game.GameRunner;
import com.monaithang.gamerunner.game.PacmanGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        // Uncomment to switch games
//        var game = new MarioGame();
        var game = new PacmanGame();
//        var game = new SuperContraGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
