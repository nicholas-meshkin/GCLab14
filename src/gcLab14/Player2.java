package gcLab14;

import java.util.Random;

public class Player2 extends Player {

	private Roshambo throwVal;

	public Player2() { // constructor
	}
	
	public void setName(String name) { //called to set the opponent's name
		this.name = name;
	}
	public String getName() {  //called when need name of opponent
		return name;
	}

	public Roshambo generateRoshambo() { // generates a random throw
		Random rand = new Random();
		int val = rand.nextInt(2);
		if (val == 0) {
			throwVal = Roshambo.ROCK;
		} else if (val == 1) {
			throwVal = Roshambo.PAPER;
		} else if (val == 2) {
			throwVal = Roshambo.SCISSORS;
			;
		}
		return throwVal;
	}
}
