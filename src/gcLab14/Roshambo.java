package gcLab14;

public enum Roshambo {

	ROCK, PAPER, SCISSORS;
	@Override
	public String toString() {
		if (this == ROCK) {
			return "Rock";
		} else if (this == PAPER) {
			return "Paper";
		} else {
			return "Scissors";
		}
	}
}
