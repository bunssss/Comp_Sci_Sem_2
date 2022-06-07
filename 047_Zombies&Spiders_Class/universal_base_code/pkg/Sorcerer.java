package pkg;
import java.util.Scanner;
import java.util.Random;


public class Sorcerer implements Role{
    Random rand = new Random();
    String name;
    int health;
    int atk;
    
    public Sorcerer () {
        name = "gafongo";
        health = rand.nextInt(16)+1;
        atk = rand.nextInt(16)+1;
    }
    
public boolean attack(Creature b) {
    if(b.takeDamage(atk)) {
        System.out.println("The creature is dead!");
        return true;
    }
    else {
        System.out.println("The creature is still alive and has " + b.getHealth() + " health left!");
        return false;
    }
}

public int getHealth() {
    return health;
}

public void setHealth(int a) {
    health = a;
}

    public String getName() {
        return name;
    }

    
}



