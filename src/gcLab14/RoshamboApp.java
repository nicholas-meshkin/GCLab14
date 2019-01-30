package gcLab14;

import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		UserPlayer user = new UserPlayer();
		Player1 badOpp = new Player1();
		Player2 avgOpp = new Player2();
		
		badOpp.setName("Bumpus");
		avgOpp.setName("Keanu Reeves");
		
		Player opp;
		
		Roshambo oppThrow = Roshambo.ROCK; //Java wanted me to initialize these
		Roshambo userThrow = Roshambo.ROCK;
		
		String more = "y"; //for checking if user wants to keep going
		
		int userWinCount= 0;  //These tick up based on results of opposed throws
		int oppWinCount = 0;
		int ties = 0;
		
		user.setName(Validator.getString(scnr, "Welcome! Please enter your name")); //gets user name
		System.out.println();
		
		
		int userOpp = Validator.getInt(scnr,
				"Please select an opponent. Press 1 for: " + badOpp.getName() + " Press 2 for: " + avgOpp.getName(),
				1, 2);
		
		if (userOpp == 1) {  //selects opponent, puts into empty player variable
			opp = badOpp;
		} else {
			opp = avgOpp;
		}
		
		while(more.equalsIgnoreCase("y")) {// goes until they want to stop
			
		userThrow = user.generateRoshambo(); //asks for user's throw choice
		oppThrow = opp.generateRoshambo(); // generates the opponents throw
		
		System.out.println(opp.getName() + " threw " + oppThrow);  //shows throw choices
		System.out.println(user.getName() + " threw " + userThrow);
		
		if(oppThrow==userThrow) {  // outcome if both throws are the same
			System.out.println("Tie!");
			ties ++;
			
		}else if (oppThrow == Roshambo.ROCK) {// outcomes if opp throws ROCK
			if(userThrow==Roshambo.PAPER) {
				System.out.println(user.getName() + " wins!");
				userWinCount++;
			}else if(userThrow==Roshambo.SCISSORS) {
				System.out.println(opp.getName() + " wins!");
				oppWinCount++;
			}
			
		} else if (oppThrow == Roshambo.PAPER) { // outcomes if opp throws PAPER
			if(userThrow==Roshambo.SCISSORS) {
				System.out.println(user.getName() + " wins!");
				userWinCount++;
			}else if(userThrow==Roshambo.ROCK) {
				System.out.println(opp.getName() + " wins!");
				oppWinCount++;
			}
			
		} else if (oppThrow == Roshambo.SCISSORS) { // outcomes if opp throws SCISSORS
			if(userThrow==Roshambo.ROCK) {
				System.out.println(user.getName() + " wins!");
				userWinCount++;
			}else if(userThrow==Roshambo.PAPER) {
				System.out.println(opp.getName() + " wins!");
				oppWinCount++;
			}
		}
		
		System.out.println(user.getName() + "'s win total: " + userWinCount); //prints out current win counts
		System.out.println(opp.getName() + "'s win total: " + oppWinCount);
		System.out.println("Ties: " + ties);
		
		more = Validator.getString(scnr, "Continue? (y/n)"); //asks if they wanna keep going
	}
		System.out.println("Goodbye!");
		scnr.close();
	}

}
