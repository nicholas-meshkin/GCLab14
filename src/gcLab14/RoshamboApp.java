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
		
		Roshambo oppThrow = Roshambo.ROCK;
		Roshambo userThrow = Roshambo.ROCK;
		
		String more = "y";
		
		int userWinCount= 0;
		int oppWinCount = 0;
		int ties = 0;
		
		user.setName(Validator.getString(scnr, "Welcome! Please enter your name"));
		System.out.println();
		
//		System.out.println("Press 1 for: " + badOpp.getName());
//		System.out.println("Press 2 for: " + avgOpp.getName());
		
		int userOpp = Validator.getInt(scnr,
				"Please select an opponent. Press 1 for: " + badOpp.getName() + " Press 2 for: " + avgOpp.getName(),
				1, 2);
		
		if (userOpp == 1) {
			opp = badOpp;
//			System.out.println(opp.getName() + " threw " + oppThrow);
		} else {
			opp = avgOpp;

//			System.out.println(opp.getName() + " threw " + oppThrow);
		}
		
		while(more.equalsIgnoreCase("y")) {
		userThrow = user.generateRoshambo();
		oppThrow = opp.generateRoshambo();
		System.out.println(opp.getName() + " threw " + oppThrow);
		System.out.println(user.getName() + " threw " + userThrow);
		if(oppThrow==userThrow) {
			System.out.println("Tie!");
			ties ++;
		}else if (oppThrow == Roshambo.ROCK) {
			if(userThrow==Roshambo.PAPER) {
				System.out.println(user.getName() + " wins!");
				userWinCount++;
			}else if(userThrow==Roshambo.SCISSORS) {
				System.out.println(opp.getName() + " wins!");
				oppWinCount++;
			}
		} else if (oppThrow == Roshambo.PAPER) {
			if(userThrow==Roshambo.SCISSORS) {
				System.out.println(user.getName() + " wins!");
				userWinCount++;
			}else if(userThrow==Roshambo.ROCK) {
				System.out.println(opp.getName() + " wins!");
				oppWinCount++;
			}
		} else if (oppThrow == Roshambo.SCISSORS) {
			if(userThrow==Roshambo.ROCK) {
				System.out.println(user.getName() + " wins!");
				userWinCount++;
			}else if(userThrow==Roshambo.PAPER) {
				System.out.println(opp.getName() + " wins!");
				oppWinCount++;
			}
		}
		System.out.println(user.getName() + "'s win total: " + userWinCount);
		System.out.println(opp.getName() + "'s win total: " + oppWinCount);
		System.out.println("Ties: " + ties);
		more = Validator.getString(scnr, "Continue? (y/n)");
	}
		System.out.println("Goodbye!");
		scnr.close();
	}

}
