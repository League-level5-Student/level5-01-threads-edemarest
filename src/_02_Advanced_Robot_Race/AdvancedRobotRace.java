package _02_Advanced_Robot_Race;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.
	public static void main(String[] args) {
		boolean winner = false;
		Robot r1 = new Robot(100, 600);
		Robot r2 = new Robot(200, 600);
		Robot r3 = new Robot(300, 600);
		Robot r4 = new Robot(400, 600);
		Robot r5 = new Robot(500, 600);
		
		r1.setSpeed(10);
		r2.setSpeed(10);
		r3.setSpeed(10);
		r4.setSpeed(10);
		r5.setSpeed(10);
		
		Thread t1 = new Thread(()-> {
			boolean w = winner;
			while(r1.getY()>0) {
				if(w) {
					break;
				}
				else {
				int rand = new Random().nextInt(6);
				r1.move(rand);
				if(r1.getY()==0) {
					w = true;
				}
				}
			}
			
		});
		Thread t2 = new Thread(()-> {
			boolean w = winner;
			while(r2.getY()>0) {
				if(w) {
					break;
				}
				else {
				int rand = new Random().nextInt(6);
				r2.move(rand);
				if(r2.getY()==0) {
					w = true;
				}
				}
			}
		});
		Thread t3 = new Thread(()-> {
			boolean w = winner;
			while(r3.getY()>0) {
				if(w) {
					break;
				}
				else {
				int rand = new Random().nextInt(6);
				r3.move(rand);
				if(r3.getY()==0) {
					w = true;
				}
				}
			}
		});
		
		
		t1.start();
		t2.start();
		t3.start();

		
	}	
}
