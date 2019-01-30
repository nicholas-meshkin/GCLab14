package gcLab14;

public class Player1 extends Player{

	
	private Roshambo throwVal = Roshambo.ROCK;
	public Player1() {
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	@Override
	public Roshambo generateRoshambo() {
		return throwVal;
	}
	
	
}
