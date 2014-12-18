package assesment;

import java.util.Scanner;
public class AverageProgram {
	
	public static void main(String[] args) {
		
	Scanner keyboard = new Scanner(System.in);
		
	String name;	
	double test1;
	double test2;
	double test3;
	double avg;
	System.out.println("What is your name?");
	name = keyboard.nextLine();  
	
	System.out.println("Enter the first test score");
	test1 = keyboard.nextDouble();
	
	System.out.println("Enter the second test score");
	test2 = keyboard.nextDouble();
	
	System.out.println("Enter the third test score");
	test3 = keyboard.nextDouble();
	
	avg = ((test1 + test2 + test3)/3);
	System.out.println("The average test score is "+avg+"");
	
	
	}
	
}