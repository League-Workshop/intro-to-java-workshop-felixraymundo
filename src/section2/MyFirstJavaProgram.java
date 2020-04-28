package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		Robot robot = new Robot();
		robot.penDown();
		robot.setSpeed(100);
		robot.setPenColor(Color.blue);
		
//		robot.move(100);
//		robot.turn(90);//<--- Robot se mueve derecha 90 grados
//		robot.move(100);
//		robot.turn(90);
//		robot.move(100);
//		robot.turn(90);
//		robot.move(100);
//		robot.turn(90);
		
		for( int i = 0; i < 4; i++) {    // <
			robot.move(100);
			robot.turn(90);
		}
		
	
	
		
	}
}
