package pkg;
import java.util.Scanner;
import java.util.Random;


public class dwarf {
	String name;
	int age;
	
	public dwarf() {
		name = "";
		age = 0;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
		
	public boolean isSameName(String name) {
	if(this.name.equals(name)) {
		return true;
	}
	else {
	return false;
	}
	
	}
}

