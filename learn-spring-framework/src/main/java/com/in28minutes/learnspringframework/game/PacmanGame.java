package com.in28minutes.learnspringframework.game;

public class PacmanGame implements GamingConsole{
	public void up() {
        System.out.println("upward");
    }

    public void down() {
        System.out.println("downward");
    }

    public void left() {
        System.out.println("backward");
    }
    
	public void right() {
		System.out.println("ahead");
		
	}
}
