/**
 * 
 */
package chap2;

/**
 * @author Dmitry
 *@date 9/12/14
 */
import java.util.Scanner;
public class Prob8910 {

/**
 * End of chap2 write "methods" for 8,9,10
 * call the methods in the main 
 */
	public static void main(String[] args) {
		// number 8
		//salesTax();
		//milesPerGallon();
		//testAvg();

	}//main method

	public static void salesTax(){
		//number 8
		Scanner keyboard = new Scanner(System.in);
		double stateTax,countyTax,totalTax,price,totalCost;
		price= double Scanner keyboard;
		
		//calc taxes
		stateTax= price*.04;
		countyTax= price*.02;
		totalTax= stateTax+countyTax;
		totalCost= price+totalTax; 
		
		//print out everything...
		System.out.println("Purchase price: $"+price); 
		System.out.println("State tax: $"+stateTax);
		System.out.println("State tax: $"+countyTax);
		System.out.println("Total tax: $"+totalTax);
		System.out.println("Total: $"+totalCost);	
	}
}


	public static void milesPerGallon(){
	//number 9 	
	Scanner keyboard = new Scanner(System.in);
	double gallons, miles, mpg;
	
	System.out.println("Welcome to my MPg calculator");
	
	
	
		
	}