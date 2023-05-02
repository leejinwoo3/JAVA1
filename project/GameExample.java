package project;

import ch06.sec08.exam03.Car;

public class GameExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 인스턴스 생성될때 생성자가 실행된다.

		Game game = new Game();
		
		game.isLefthp();
		game.isLeftattack();
		game.run();
		game.isLeftdefend();
		game.recovery();
	
		
	}
}
