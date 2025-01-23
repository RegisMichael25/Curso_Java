package br.com.curso.poo.pokemon;

import java.util.Random;

public class Pokemon {
	
	int hp;
	int atk;
	int def;
	int speed;
	int level;
	int xp;
	String name;
	String type;
	
	Random random = new Random();
	
	
	public Pokemon(int hpIn, 
			int defIn, int xpIn,
			String nameIn, String typeIn) {
		hp = hpIn;
		atk = 14 + random.nextInt(11);
		def = defIn;
		speed = 50 + random.nextInt(51);
		xp = xpIn;
		name = nameIn;
		type = typeIn;
		
	}
	
	void takeDamage(int amountDamage) {
		hp = hp - (amountDamage-def);
	}
	
	void upXp(int amountXp) {
		xp = xp + amountXp;
		if(xp >= 10) {
			level++;
		}
	}

	@Override
	public String toString() {
		return "Pokemon [hp=" + hp + ", atk=" + atk + ", def=" + def + ", speed=" + speed + ", level=" + level + ", xp="
				+ xp + ", name=" + name + ", type=" + type + "]";
	}																																																																																																																																																																																																																																																																																																																																																																								
	
}
