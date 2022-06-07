package pkg;
import java.util.Scanner;
import java.util.Random;


public class Apprentice extends Musician{
	String school;
	int yearsOfExperience;
	
	public Apprentice() {
	    school = "CVHS";
	    yearsOfExperience = 0;
	}
	
	public Apprentice(String school, int yearsOfExperience) {
	    this.school = school;
	    this.yearsOfExperience = yearsOfExperience;
	}
	
	public Apprentice(String instrument, String school, int yearsOfExperience) {
	    this.instrument = instrument;
	    this.school = school;
	    this.yearsOfExperience = yearsOfExperience;
	}
	
	public Apprentice(String name, int age, String instrument, String school, int yearsOfExperience) {
        this.name = name;
        this.age = age;
        this.instrument = instrument;
	    this.school = school;
	    this.yearsOfExperience = yearsOfExperience;
    }
    
    public void playInstrument() {
        System.out.println("The " + instrument + " is played alright");
    }
    
    public void practice() {
        super.practice();
        System.out.println(name + " has played for " + yearsOfExperience + " years");
    }
    
    public void perform() {
        super.perform();
        System.out.println("The performance needs some work still.");
    }
    
    public void practiceAtUniversity(){
        super.practice();
        System.out.println(name + " practices " + instrument + " at " + school);
    }

}

