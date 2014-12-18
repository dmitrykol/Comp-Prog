/**
 * 
 */
package chap2;

/**
 * @author Dmitry
 * @date 9/11/14
 */
import java.util.Scanner;	//imports the Scanner Class

public class Prob5Input {

	public static void main(String[] args) {
		//create an instance for the Scanner class...
		Scanner keyboard = new Scanner(System.in);
		int num1,num2,sum;

		System.out.println("Welcome to my addition program\n");
		
		//ask for first number 
		System.out.println("Please enter the first number ");
		num1=keyboard.nextInt();
		
		//ask for second number 
		System.out.println("Please enter the second number ");
		num2=keyboard.nextInt();
		
		sum= num1+num2;
				System.out.println("the sum of your numbers is "+sum);
	}

}
