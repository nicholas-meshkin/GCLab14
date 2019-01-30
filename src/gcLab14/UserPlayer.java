package gcLab14;
import java.util.Scanner;
public class UserPlayer extends Player{
	public UserPlayer() {
	
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	private Roshambo throwVal;
	Scanner scnr = new Scanner(System.in);
	
	public Roshambo generateRoshambo() {
	int userThrow = Validator.getInt(scnr, "Please select: 1 for Rock, 2 for Paper, and 3 for Scissors.", 1, 3);
	
	if (userThrow == 1) {
		throwVal = Roshambo.ROCK;
	} else if (userThrow == 2) {
		throwVal = Roshambo.PAPER;
	} else if (userThrow == 3) {
		throwVal = Roshambo.SCISSORS;
	}
	return throwVal;
}
}
