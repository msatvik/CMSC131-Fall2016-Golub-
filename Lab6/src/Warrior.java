
public class Warrior {
	String name;
	int strength;
	int healthLevel;

	public Warrior(String nameIn, int strengthIn, int health) {
		name = nameIn;
		strength = strengthIn;
		healthLevel = health;
	}

	public Warrior(String nameIn) {
		name = nameIn;
		strength = 10;
		healthLevel = 200;
	}

	public boolean isAlive() {
		return this.healthLevel > 0;
	}

	public void smite(Warrior enemy) {
		enemy.healthLevel -= strength;
	}

	public boolean equals(Warrior a, Warrior b) {
		if (a.name.equals(b) && a.strength == b.strength) {
			return true;
		} else {
			return false;
		}

	}

	public String toString() {
		return name + " - Strength: " + strength + ", Health: " + healthLevel;
	}

	public static Warrior fight(Warrior a, Warrior b) {
		while (a.isAlive() && b.isAlive()) {
			a.smite(b);
			if (b.healthLevel == 0) {
				return a;
			}
			b.smite(a);
			if (a.healthLevel == 0) {
				return b;
			}

		}
		return a;
	}

public static Warrior tournament(Warrior a, Warrior b, Warrior c,Warrior d){
	
	Warrior.fight(a, b);
	Warrior.fight(c, d);
	if(a.healthLevel==0&&c.healthLevel==0){
		Warrior.fight(b, d);
		if(b.healthLevel==0){
			return d;
		}
		else{
			return b;
		}
	}
	else if(a.healthLevel==0&&d.healthLevel==0){
		Warrior.fight(b, c);
		if(b.healthLevel==0){
			return c;
		}
		else{
			return b;
		}
	}
	else if(b.healthLevel==0&&c.healthLevel==0){
		Warrior.fight(a, d);
		if(a.healthLevel==0){
			return d;
		}
		else{
			return a;
		}
	}
	else{
		Warrior.fight(a, c);
		if(a.healthLevel==0){
			return c;
		}
		else{
			return a;
		}
	}
}
}