package _01_Olympic_Rings;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		Robot r1 = new Robot(400, 700);
		Robot r2 = new Robot(800, 700);
		Robot r3 = new Robot(1200, 700);
		Robot r4 = new Robot(1200, 700);
		Robot r5 = new Robot(1200, 700);
		
		r1.setSpeed(10);
		r2.setSpeed(10);
		r3.setSpeed(10);
		r4.setSpeed(10);
		r5.setSpeed(10);
		

		r1.moveTo(0, 700);
		r2.moveTo(200, 700);
		r3.moveTo(400, 700);
		r4.moveTo(600, 700);
		r5.moveTo(800, 700);
		
		Thread t1 = new Thread(()->r1.move(2));
		Thread t2 = new Thread(()->r2.move(2));
		Thread t3 = new Thread(()->r3.move(2));
		Thread t4 = new Thread(()->r4.move(2));
		Thread t5 = new Thread(()->r5.move(2));
		Thread t6 = new Thread(()->r1.turn(2));
		Thread t7 = new Thread(()->r2.turn(2));
		Thread t8 = new Thread(()->r3.turn(2));
		Thread t9 = new Thread(()->r4.turn(2));
		Thread t10 = new Thread(()->r5.turn(2));
		
		for(int i = 0; i < 180; i ++) {
			t1.start();
			t2.start();
			t3.start();
			t4.start();
			t5.start();
			t6.start();
			t7.start();
			t8.start();
			t9.start();
			t10.start();
		}

	}
}

