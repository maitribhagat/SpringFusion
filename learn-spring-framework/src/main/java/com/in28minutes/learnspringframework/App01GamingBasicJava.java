package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.PacmanGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		
     	//var game = new MarioGame();
		//var game = new SuperContraGame();
		
     	var game = new PacmanGame(); //1: Object Creation
     	
		var gameRunner = new GameRunner(game); //2 Object Creation + wiring of dependencies
		//Game is a Dependency
		
		gameRunner.run();
		
	}
}