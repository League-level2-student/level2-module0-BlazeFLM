package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		// 2. create an array of 5 robots.
		Robot[] roboArray = new Robot[50];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < roboArray.length; i++) {
			roboArray[i] = new Robot();
			roboArray[i].setSpeed(100);
			// 4. make each robot start at the bottom of the screen, side by side, facing up
			roboArray[i].setX(50 + i * 50);
			roboArray[i].setY(500);
		}
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		boolean notWon = true;
		int winner = 0;
		while (notWon) {
			for (int i = 0; i < roboArray.length; i++) {
				Random ran = new Random();
				roboArray[i].move(ran.nextInt(51));
				// 6. use a while loop to repeat step 5 until a robot has reached the top of the
				// screen.
				if (roboArray[i].getY() <= 10) {
					notWon = false;
					winner = i;
					break;
				}

			}
		}
		// 7. declare that robot the winner and throw it a party!
		 JOptionPane.showMessageDialog(null, "Robot #" + winner + " is the winner");
		// 8. try different races with different amounts of robots.
		 
		// 9. make the robots race around a circular track.
	}

	
	
	void party(Robot r) {
		Random rando = new Random();
		r.penDown();
		r.setPenColor(rando.nextInt(256), rando.nextInt(256), rando.nextInt(256));
		for (int i = 0; i < rando.nextInt(10); i++) {
			r.turn(rando.nextInt(360));
			r.move(rando.nextInt(400));
		}
	}
}
