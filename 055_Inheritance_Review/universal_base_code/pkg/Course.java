package pkg;
import java.util.Scanner;
import java.util.Random;


public class Course {
	String teacher;
	int grade;
	int cred;
	
	public void calcCred() {
		
		if(grade >= 90) {
			cred = 4;
		}
		else if(grade >= 80) {
			cred = 3;
		}
		else if(grade >= 70) {
			cred = 2;
		}
		else if (grade >= 60) {
			cred = 1;
		}
		else if(grade < 60) {
			cred = 0;
		}
	}
	
	public static void setGrade(int grade) {
		this.grade = grade;
	}
	
	public static void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	
	public static int getGrade() {
		return grade;
	}
	
	public static String getTeacher() {
		return teacher;
	}

}

