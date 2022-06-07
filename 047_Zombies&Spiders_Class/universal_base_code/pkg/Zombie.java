package pkg;
import java.util.Scanner;
import java.util.Random;


public class Zombie implements Creature {
	Random rand = new Random();
	int health;
	String name;
	int attack;
	boolean amog;
	
	public void setHealth(int a) {
    health = a;
}

	public int getHealth() {
		return health;
	}
	
	public Zombie() {
		name = "Zack";
		health = rand.nextInt(6)+5;
		attack = rand.nextInt(6)+5;
		
	}
	public boolean takeDamage(int b) {
		health = health - b;
		if(isDead()) {
			amog = true;
		}
		else {
			amog=false;
		}
		return amog;
	}
	
		public boolean isDead() {
		
		if(health<=0) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public String getName() {
		return name;
	}
	
	public void attack(Role b) {
		int h = b.getHealth();
		h = h-attack;
		b.setHealth(h);
	}
	
	public void YW1vZ29z() {
		System.out.println("a sussy creature");
	}
}
