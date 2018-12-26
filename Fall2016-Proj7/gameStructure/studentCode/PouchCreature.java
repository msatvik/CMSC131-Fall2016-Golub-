package studentCode;

import studentCode.Universe.Outcomes;

/** 
 * A mutable class that represents a PouchCreature creature that might do battle
 * in our game.  As such, it implements the Battleable interface.
 * <br><br>
 * A PouchCreature object has a name (String) and a strength (int) as well
 * as a number of level-ups (int) above its base and an internal counter
 * for how many victories it has had since its last level-up (int).
 */
public class PouchCreature implements Battleable {
	
	private String name;
	private int strength;
	private int levelUps;
	private int victoriesSinceLevelUp;

	/**
	 * Standard constructor.  levelUps and victoriesSinceLevelUp start at 0.
	 * 
	 * @param nameIn desired name for this PouchCreature
	 * @param strengthIn starting strength for this PouchCreature
	 */
	public PouchCreature(String nameIn, int strengthIn) {
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
	public PouchCreature(PouchCreature other) {
		name=other.name;
		strength=other.strength;
		levelUps=other.levelUps;
		victoriesSinceLevelUp=other.victoriesSinceLevelUp;
	}
	
	
	/**
	 * Getter for skill level of the PouchCreature, which is based on the
	 * first character of its name and the number of levelUps it has.
	 * Specifically, the UNICODE value of the first character in its name
	 * taken %10 plus the levelUps.
	 * 
	 * @return skill level of the PouchCreature
	 */
	public int getLevel() {
		char x=this.getName().charAt(0);
		int y=x%10;
		return levelUps+y;
	}
	
	
	/**
	 * Getter for name of the PouchCreature.
	 * 
	 * @return reference to the name of the PouchCreature
	 */
	public String getName() {
		return this.name;
	}


	
	/**
	 * Getter for strength value of the PouchCreature.
	 * 
	 * @return strength value of the PouchCreature
	 */
	public int getStrength() {
		return this.strength;
	}

	
	/**
	 * Setter for the strength of the PouchCreature.
	 * @param newStrength the new strength value for the PouchCreature
	 */
	public void setStrength(int newStrength) {
		this.strength=newStrength;
	}

	
	
	/**
	 * Method that takes the outcome of a battle and increments the level
	 *   if the number of victories has passed the threshold.  We define 
	 *   "passed the threshold" as meaning the victories equals or exceeds 
	 *   the threshold.
	 * @param outcome the outcome of the battle in which this PouchCreature was 
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
		return result;
	}

	
	
	
	/**
	 * Method to create an independent copy of the PouchCreature.
	 * @return independent copy of the PouchCreature
	 */
	public Battleable returnDuplicate() {
		PouchCreature copy=new PouchCreature(this);
		return copy;
	}
	
	
	
	
	/**
	 * The "usual suspect" toString method.
	 * @return a String describing the BattleCow
	 */
	
	public String toString() {
		return "PouchCreature<Name: " + getName() + 
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
			PouchCreature casted = (PouchCreature)other;
			return 
					this.getName().equals(casted.getName()) 
					&& 
					this.getStrength() == casted.getStrength() 
					&& 
					this.getLevel() == casted.getLevel();
		}
	}
	
}


