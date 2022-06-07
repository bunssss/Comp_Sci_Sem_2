package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spiderman {
	String actor;		// What's the actors name!
	int age;			// How many times should it be printed
	String villain;		// Who's the arch nemesis of this Spiderman

	public Spiderman() {			// Default constructor!
	this("Tobey Maguire", 46, "Green Goblin");
	}
	
	// Create constructors for each combination of actor/age/villain. Use the defaults above if not an input parameter.
	public Spiderman(String actor, int age, String villain) {
		this.actor = actor;
		this.age = age;
		this.villain = villain;
	}
	public Spiderman(int age, String villain) {
	this("Tobey Maguire", age, villain);
	}
	public Spiderman(String actor, String villain) {
	this(actor, 46, villain);
	}
	public Spiderman(String actor, int age) {
	this(actor, age, "Green Goblin");
	}
	

	
	// ---------------------------------------
	// Create accessor and mutator methods for actor, age, and villain (6 total methods)
	public int getAge() {
		return age;
	}
	public String getActor() {
		return actor;
	}
	public String getVillain() {
		return villain;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public void setVillain(String villain) {
		this.villain = villain;
	}


	public void fight(){
		System.out.println("Spidey shoots his web at " + villain);
	}

	public void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                ");   
    System.out.println("         /    			  "); 
	}

	

}
