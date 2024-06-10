package coffeestand;

import static coffeestand.Type.*;
import static coffeestand.Move.*;

public abstract class Pokemon {
	/**
	 * What type variant the Pokemon is set as
	 * <li>This will be defined in the constructor</li>
	 * 
	 * @see Type
	 */
	final Type TYPE;
	final int MAX_HEALTH, ATTACK, DEFENSE, SPEED;
	int hp;
	Move[] MOVES;

	public Pokemon(final Type TYPE, final int MAX_HEALTH, final int ATTACK, final int DEFENSE, final int SPEED) {
		this.TYPE = TYPE;
		this.MAX_HEALTH = MAX_HEALTH;
		this.ATTACK = ATTACK;
		this.DEFENSE = DEFENSE;
		this.SPEED = SPEED;
		hp = MAX_HEALTH;
	}

	/**
	 * Handles dealing damage (subtracting HP) to the Pokemon
	 * 
	 * @param dmg How much damage to deal
	 */
	void takeDamage(int dmg) {
		hp -= dmg;
	}
}

class Charmander extends Pokemon {
	public Charmander() {
		super(Fire, 39, 52, 43, 65);
		MOVES = new Move[] {Tackle, Ember};
	}
}

class Electrode extends Pokemon {
	public Electrode() {
		super(Electric, 60, 50, 70, 150);
		MOVES = new Move[] {Tackle, SelfDestruct, Thunderbolt};
	}
}

class Oddish extends Pokemon {
	public Oddish() {
		super(Poison, 45, 50, 55, 30);
		MOVES = new Move[] { Tackle };
	}

}

class JigglyPuff extends Pokemon {
	public JigglyPuff() {
		super(Fairy, 115, 45, 20, 20);
		MOVES = new Move[] { Tackle };
	}
}

class Machoke extends Pokemon {
	public Machoke() {
		super(Fighting, 80, 100, 70, 45);
		MOVES = new Move[] { Tackle, DynamicPunch };
	}
}

class Cloyster extends Pokemon {
	public Cloyster() {
		super(Ice, 50, 95, 180, 70);
		MOVES = new Move[] { Tackle };
	}
}