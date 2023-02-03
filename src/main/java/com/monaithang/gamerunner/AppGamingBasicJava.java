package com.monaithang.gamerunner;

import com.monaithang.gamerunner.game.GameRunner;
import com.monaithang.gamerunner.game.PacmanGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        // Step 1 - Game object creation: Uncomment to switch games
//        var game = new MarioGame();
        var game = new PacmanGame();
//        var game = new SuperContraGame();
        // Step 2 - Object creation with wiring of dependencies
        // Game is a dependency of GameRunner
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
