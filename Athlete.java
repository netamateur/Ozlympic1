/**
 * The is the Driver of Ozlympic Game Program
 * which handles the main mechanics of the game.
 *
 * @author  Rita Tse
 * @version 1.0
 * @since   2017-04-07
 */

public class Athlete extends Participant {

	private int score=0;
	public String type;


	//Constructor
	public Athlete(String iD, String name, int age, String state, int score, String type) {
		super(iD, name, age, state);
		this.score=score;
		this.type=type;
	}

	//Getters
	public String getType() {
		return type;
	}
	public int getScore(){
		return score;
	}


	//Compete method for all Athletes, will be overridden depending on type of Athlete
	public double compete(){
		double time=0;
		return time;
	}

	//Score method for their ranking
	public int addScore(int points){
		return score += points;
	}

	//Prints Athlete details
	public String toString(){
		return " | ID: " + getID() + " |  " +  getType() + "  |  "  + getName() + "   ===  Total Score : " + getScore();
	}


}
