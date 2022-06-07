package pkg;
import java.util.Scanner;
import java.util.Random;


public interface Role {
	public String getName();
	public void setHealth(int a);
	public int getHealth();
	public boolean attack(Creature b);
	
}



