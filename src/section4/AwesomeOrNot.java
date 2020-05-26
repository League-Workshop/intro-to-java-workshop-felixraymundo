package section4;

import java.awt.SystemColor;
import java.util.Random;

import javax.swing.JOptionPane;

import com.sun.corba.se.spi.orbutil.fsm.Input;
import com.sun.org.apache.xpath.internal.operations.Variable;

import sun.awt.AWTAccessor.SystemColorAccessor;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…

	public static void main(String[] args) {
		
	
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
		
		int number = new Random().nextInt(4);
	// 3. Print out this variable
		System.out.println(number);
	// 4. Get the user to enter something that they think is awesome
		JOptionPane.showInputDialog(null, "What, in your opinion, is awesome?");	
	// 5. If the random number is 0
		if ( number == 0) {
	// -- tell the user watever they entered is awesome!
		JOptionPane.showMessageDialog(null, "That is awesome!");
		}
	// 6. If the random number is 1
		if ( number == 1) {
	// -- tell the user whatever they entered is ok.
		JOptionPane.showMessageDialog(null, "That is ok");
		}
		// 7. If the random number is 2
		if ( number == 2) { 
	// -- tell the user whatever they entered is boring.
		JOptionPane.showMessageDialog(null, "That is boring");
		}
	// 8. If the random number is 3
		if ( number == 3) {
	// -- write your own answer
		JOptionPane.showMessageDialog(null, "I think Tacos are better. ");
		
		}

	}

	private static Random newRandom() {
		// TODO Auto-generated method stub
		return null;
	}
}


