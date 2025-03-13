package com.learning.gaming_with_spring;

import com.learning.gaming_with_spring.game.GameRunner;
import com.learning.gaming_with_spring.game.MarioGame;
import com.learning.gaming_with_spring.game.PacMan;
import com.learning.gaming_with_spring.game.SuperContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		
		//var game = new MarioGame();
		//var game = new SuperContraGame();
		var game = new PacMan();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
		

	}

}
