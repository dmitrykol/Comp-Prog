/**
 * 
 */
package chap2;

import java.util.Scanner;

/**
 * 
 */

/**
 * @author YOURNAME
 * @date 9/22/14
 */
import java.util.Scanner;
public class QuizReview1 {

	/**
	 * straight line programs worksheet review progs for this weeks prog quiz
	 */
	public static void main(String[] args) {
		// use a do loop and a menu, select case.....
		// from the worksheet , 15,17,19,20

		Scanner keyboard = new Scanner(System.in);
		System.out.println("welcome...");
		int c = 0;
		
		do {

			c = menu();

			switch (c) {
			case 1:
				grades();
				break;

			case 2:
				contract();
				break;
			case 3:
				profit();
				break;
			case 4:
				originalPrice();
				break;
				
			default:
				System.out.println("goodbye");
			}
		} while (c <= 4);
	}

	public static int menu() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("1.) Grading Program ");
		System.out.println("2.) Baseball Contract");
		System.out.println("3.) Profit ");
		System.out.println("4.) Orig Price");
		System.out.println("5.) Quit");
		System.out.println("enter choice");
		int c = keyboard.nextInt();
		return c;

	}
	
	public static void grades(){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to the gradebook program");
		double g1,g2,g3,finalGrade,avg;
		
System.out.println("enter grade 1");	
g1= keyboard.nextDouble();

System.out.println("enter grade 2");	
g2= keyboard.nextDouble();

System.out.println("enter grade 3");	
g3= keyboard.nextDouble();

System.out.println("enter exam grade");	
finalGrade= keyboard.nextDouble();

avg=( (g1+g2+g3+finalGrade*2)/5);

System.out.println("the class avg is "+avg+"");



	}
	
	public static void contract(){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to the contract program");
		double p,year2,j,totalPay;
		
		System.out.println("enter dollars the baseball player will make his first year");	
		p= keyboard.nextDouble();
		
		year2= p+p*.01;
		System.out.println("money the player will make second year is "+year2+"");	

		
		System.out.println("enter the percent he will make his third year");	
		j= keyboard.nextDouble();
		
		totalPay= (p+ year2+(year2*j));
		
		System.out.println("the total pay is "+totalPay+"");	
	
	}


	public static void profit(){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to the profit program");
		double one,two,three,taxRate,tax1,tax2,gross,profit;
		
		System.out.println("enter the number of items sold for $550");
		one= keyboard.nextDouble(); 
		
		System.out.println("enter the number of items sold for $620");
		two= keyboard.nextDouble(); 
		
		System.out.println("enter the number of items sold for $1750");
		three= keyboard.nextDouble(); 
		
		System.out.println("enter the tax rate");
		taxRate= keyboard.nextDouble();
		
		tax1=.1;
		tax2=.15;
		
		gross= one+two+three;
		
		profit= ((one*tax1)+(two*tax1)+(three*tax2));
		
		System.out.println("the gross pay is "+gross+"");
		System.out.println("the profit is "+profit+"");
		
				
		
	}

	public static void originalPrice(){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to the original price program");
		double s,d,original;
		
		System.out.println("enter the price being sold at now");	
		s=keyboard.nextDouble();
		
		System.out.println("enter the percent of discount");
		d=keyboard.nextDouble();
		
		original= s/(1-d);
		System.out.println("the original price is "+original+"");
		
		
	}
}
