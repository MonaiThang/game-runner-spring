package com.monaithang.gamerunner;

import com.monaithang.gamerunner.game.GameRunner;
import com.monaithang.gamerunner.game.GamingConsole;
import com.monaithang.gamerunner.game.PacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfig {
    @Bean
    public GamingConsole game() {
        var game = new PacmanGame();
        return game;
    }
    @Bean
    public GameRunner gameRunner(GamingConsole game){
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }
}
