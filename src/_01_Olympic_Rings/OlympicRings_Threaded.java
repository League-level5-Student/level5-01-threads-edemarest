package _01_Olympic_Rings;

import java.awt.Color;

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
		

		r1.moveTo(0, 100);
		r2.moveTo(50, 150);
		r3.moveTo(100, 100);
		r4.moveTo(150, 150);
		r5.moveTo(200, 100);
		
		Thread t1 = new Thread(()-> {
			r1.penDown();
			r1.setPenColor(Color.BLUE);
			for(int i = 0; i < 360; i++) {
				r1.move(1);
				r1.turn(1);
			}
		});
		
		Thread t2 = new Thread(()-> {
			r2.penDown();
			r2.setPenColor(Color.YELLOW);
			for(int i = 0; i < 360; i++) {
				r2.move(1);
				r2.turn(1);
			}
		});
		
		Thread t3 = new Thread(()-> {
			r3.penDown();
			r3.setPenColor(Color.BLACK);
			for(int i = 0; i < 360; i++) {
				r3.move(1);
				r3.turn(1);
			}
		});
		
		Thread t4 = new Thread(()-> {
			r4.penDown();
			r4.setPenColor(Color.GREEN);
			for(int i = 0; i < 360; i++) {
				r4.move(1);
				r4.turn(1);
			}
		});
		
		Thread t5 = new Thread(()-> {
			r5.penDown();
			r5.setPenColor(Color.RED);
			for(int i = 0; i < 360; i++) {
				r5.move(1);
				r5.turn(1);
			}
		});
		
		
		
			t1.start();
			t2.start();
			t3.start();
			t4.start();
			t5.start();

		

	}
}

