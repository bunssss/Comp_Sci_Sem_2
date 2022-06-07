package pkg;
import java.util.Scanner;
import java.util.Random;


public class Bear implements Pet {
	String name;	
	int age;			
	boolean trained;		

	public Bear() {		
	this("ber", 53, false);
	}
	
	public Bear(String name, int age, boolean trained) {
		this.name = name;
		this.age = age;
		this.trained = trained;
		this.interact();
	}
	
	public Bear(int age) {
	this("ber", age, false);
	}
	
	public Bear(String name) {
	this(name, 53, false);
	}
	
	public Bear(boolean trained) {
	this("ber", 53, trained);
	}
	
	public Bear(String name, boolean trained) {
		this(name, 53, trained);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setIsTrained(boolean trained) {
		this.trained = trained;
	}
	
    public String getName()	{
    	return name;
    }
    
    public int getAge() {
    	return age;
    }    
    
    public boolean getIsTrained() {
    	return trained;
    }   
    
    public void interact() {
    	System.out.println(name + " į̷̧̧͖̲͍͔͔̱̠͔͑̓̐̆́̏ ̶̛͚̰̭̬̳͙͚̙̙̠̝̅̍͗͆̅̓͐̔̋͛̇̕̚ą̶̹̼͉̙́̃m̷̞̜͕̉̓́̈͌̍̈́͒̐̀̽̈́͘͝ ̴̧̞͓͈̠̬̝̺͉͑b̶̜͍͍͎̞̊̌ȩ̴̥͎̰̮̣͖͖̩́̿͑̓̂̾̓̃͜͜͝ã̶̧̨͚͈̗̯̦̰̩͙̉̂͂̈́̽̂̕͘͠r̴̨̻̹̣͔̳̲͋̈́̃̎͊͌̍͗͝");
    }       
    
	public void trick() {
	if(trained) {
		System.out.println(name + " does his taxes");
	}
	else {
		System.out.println(name + " commits tax evasion");
	}
	}
	

}
