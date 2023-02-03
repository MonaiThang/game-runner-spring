package com.monaithang.gamerunner;

import com.monaithang.gamerunner.game.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppGamingSpringBeans {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(GamingConfig.class)) {
            context.getBean(GameRunner.class).run();
        }
    }
}
