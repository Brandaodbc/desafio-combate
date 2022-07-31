package entities;

public class Champion {

	private String name;
	private int life;
	private int attack;
	private int armor;
	
	public Champion(String name, int life, int attack, int armor) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
	}
		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public void takeDamage(int attack) {
		
		if (attack > armor) {
			life -= (attack - armor);
		}
		else {
			life -= 1;
		}
		
		if (life <= 0) {
			life = 0;
		}
	}
	
	public String status() {
		String status;
		if (life == 0) {
			status = name + ": " + String.format("%d", life) + " de vida (morreu)";
		}
		else {
			status = name + ": " + String.format("%d", life) + " de vida";
		}
		return status;
	}
	
}
