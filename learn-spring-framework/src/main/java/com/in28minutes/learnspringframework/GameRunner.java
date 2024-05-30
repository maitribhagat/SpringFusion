package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GamingConsole;

public class GameRunner {
    private GamingConsole game;
    
    public GameRunner(GamingConsole game2) {
        this.game = game2;
    }
    
    public void run() {
        System.out.println("Running game: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
