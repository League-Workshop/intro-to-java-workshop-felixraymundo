package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		// 2.  Ask the user a question 
		String input = JOptionPane.showInputDialog(null, "What is 2+2-4?");
		// 3.  Use an if statement to check if their answer is correct
		if (input.equals("0")) {
			
		}
		else {
			
		}
		// 4.  if the user's answer was correct, add one to their score 
		if (input.equals("0")) {
			score += 1;
			JOptionPane.showMessageDialog(null, "Your Score = " + score);
			
		}
		else {
			JOptionPane.showMessageDialog(null, "Your Score = " + score);
			score = 0;
		}
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		input = JOptionPane.showInputDialog(null, "What is 5+6-8+8");
		// 6.  After all the questions have been asked, print the user's score 
		if (input.equals("11")) {
		score += 1;
		JOptionPane.showMessageDialog(null, "Your Score = " + score);
		
		}
		else {
			score += 0;
			JOptionPane.showMessageDialog(null, "Your Score = " + score);
			
		}
		
		else {
			
		score += 1;
			JOptionPane.showMessageDialog(null, "Your Score = " + score);
		}
	}
}
