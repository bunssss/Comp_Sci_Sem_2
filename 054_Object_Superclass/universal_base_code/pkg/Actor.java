package pkg;
import java.util.Scanner;
import java.util.Random;


public class Actor extends Performer {
	String type;

	public Actor() {
		type = "theater";
		
	}
	
	public Actor(String name, String type) {
		super(name);
		this.type = type;
	}
	
	public void practice() {
		System.out.println(super.getName() + " practices their stunts.");
	}
	
	public void perform() {
		System.out.println(super.getName() + " performs an Oscar worthy performance.");
	}
	
	public void monologue() {
		System.out.println("You can't win if you don't fight. Fight. Just fight.");
	}

}

