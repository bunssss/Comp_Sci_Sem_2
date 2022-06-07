package pkg;
import java.util.Scanner;
import java.util.Random;


public class Fish implements Pet {
	String name;	
	int age;			
	boolean trained;		

	public Fish() {		
	this("Laboon", 53, false);
	}
	
	public Fish(String name, int age, boolean trained) {
		this.name = name;
		this.age = age;
		this.trained = trained;
		this.interact();
	}
	
	public Fish(int age) {
	this("Laboon", age, false);
	}
	
	public Fish(String name) {
	this(name, 53, false);
	}
	
	public Fish(boolean trained) {
	this("Laboon", 53, trained);
	}
	
	public Fish(String name, boolean trained) {
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
    	System.out.println(name + " stares into your soul.");
    }       
    
	public void trick() {
	if(trained) {
		System.out.println(name + " plays soccer");
	}
	else {
		System.out.println(name + " swims in circles in its little glass ball trapped forever");
	}
	}
	

}
