package gcLab14;

public class Player1 extends Player{

	
	private Roshambo throwVal = Roshambo.ROCK; //this player will always throw rock
	
	public Player1() { // constructor
	}
	
	public void setName(String name) { //called to set name of opponent
		this.name = name;
	}
	
	public String getName() { // called when printing name of opponent
		return name;
	}

	@Override
	public Roshambo generateRoshambo() { // throws rock
		return throwVal;
	}
	
	
}
