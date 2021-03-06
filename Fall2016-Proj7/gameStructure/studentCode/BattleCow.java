package studentCode;

import studentCode.Universe.Outcomes;

/** 
 * A mutable class that represents a BattleCow creature that might do battle
 * in our game.  As such, it implements the Battleable interface.
 * <br><br>
 * A BattleCow object has a name (String) and a strength (int) as well
 * as a number of level-ups (int) above its base and an internal counter
 * for how many victories it has had since its last level-up (int).
 */
public class BattleCow implements Battleable {
	
	private String name;
	private int strength;
	private int levelUps;
	private int victoriesSinceLevelUp;

	/**
	 * Standard constructor.  levelUps and victoriesSinceLevelUp start at 0.
	 * 
	 * @param nameIn desired name for this BattleCow
	 * @param strengthIn starting strength for this BattleCow
	 */
	public BattleCow(String nameIn, int strengthIn) {
		name=nameIn;
		strength=strengthIn;
		levelUps=0;
		victoriesSinceLevelUp=0;
	}

	
	/**
	 * Copy constructor.  
	 * 
	 * @param other reference to the existing object which is the basis of the new one
	 */
	public BattleCow(BattleCow other) {
		name=other.name;
		strength=other.strength;
		levelUps=other.levelUps;
		victoriesSinceLevelUp=other.victoriesSinceLevelUp;
	}
	
	
	/**
	 * Getter for skill level of the BattleCow, which is always 5 more than
	 * the number of levelUps they have.
	 * 
	 * @return skill level of the BattleCow
	 */
	public int getLevel() {
		return 5+levelUps;
	}
	
	
	/**
	 * Getter for name of the BattleCow.
	 * 
	 * @return reference to the name of the BattleCow
	 */
	public String getName() {
		return name;
	}


	
	/**
	 * Getter for strength value of the BattleCow.
	 * 
	 * @return strength value of the BattleCow
	 */
	public int getStrength() {
		return strength;
	}

	
	/**
	 * Setter for the strength of the BattleCow.
	 * @param newStrength the new strength value for the BattleCow
	 */
	public void setStrength(int newStrength) {
		strength=newStrength;
	}

	
	
	/**
	 * Method that takes the outcome of a battle and increments the level
	 *   if the number of victories has passed the threshold or sets the
	 *   strength to 0 if the outcome was a loss.  We define "passed the
	 *   threshold" as meaning the victories equals or exceeds the threshold.
	 *   Also, note that the drop in strength level is not true for all 
	 *   things that implement Battleable.
	 * @param outcome the outcome of the battle in which this BattleCow was 
	 *   involved
	 * @return true if the outcome conveyed caused a level-up
	 */
	public boolean inform(Universe.Outcomes outcome) {
		boolean result=false;
		if(outcome==Universe.Outcomes.WIN){
			this.victoriesSinceLevelUp++;
			if(this.victoriesSinceLevelUp>=Universe.THRESHOLD){
				this.levelUps++;
				result=true;
			}
		}
		else if(outcome==Universe.Outcomes.LOSE){
			this.setStrength(0);
		}
		return result;
	}

	
	
	/**
	 * Method to create an independent copy of the BattleCow.
	 * @return independent copy of the BattleCow
	 */
	public Battleable returnDuplicate() {
		BattleCow copy=new BattleCow(this);
		return copy;
	}
	
	
	
	/**
	 * The "usual suspect" toString method.
	 * @return a String describing the BattleCow
	 */
	
	public String toString() {
		return "BattleCow<Name: " + getName() + 
				"  Strength: " + getStrength() +
				"  Level: " + getLevel() +
				">";
	}
	
	
	
	/**
	 * The "usual suspect" equals method.
	 */
	
	public boolean equals(Object other) {
		if (other == null) {
			return false;
		}
		else if (this.getClass()!=other.getClass()) {
			return false;
		}
		else {
			BattleCow casted = (BattleCow)other;
			return 
					this.getName().equals(casted.getName()) 
					&& 
					this.getStrength() == casted.getStrength() 
					&& 
					this.getLevel() == casted.getLevel();
		}
	}
	
}
