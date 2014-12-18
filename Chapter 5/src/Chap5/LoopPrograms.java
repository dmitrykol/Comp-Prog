package Chap5;
import java.util.Scanner;	
import java.text.DecimalFormat;
public class LoopPrograms {

private static Scanner keyboard = new Scanner (System.in);
	private static DecimalFormat f= new DecimalFormat("$#,##0.00");
	private static DecimalFormat p= new DecimalFormat("#,##0.0");		
	
	public static void main(String[] args) {
		// Loop Programs from worksheet, prining labeled columns
		// menu driven with switch
		int c;
		
	 do{	
		  c= menu();
		
		
		switch (c) {
		case 1:
			System.out.println("First Number\n");
			//firstNumber();
			break;
			
		case 2:
			System.out.println("Second Number\n");
			//secondNumber();
			break;
			
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
			;
			break;
			
		case 6:
			break;
		
				
		case 7:
			System.out.println("Bye Bye Birdie");
			
			break;
		
		default:
			System.out.println("hEY WEENIE 1-7!");
			System.out.println("bad input");
			
			}
			
	
		
	 }while(c!=7); // quit loop when not 1-8
	 
	keyboard.close();
	}// end main method
	
	public static int menu(){
		// ask for choice
		// print choices here
		System.out.println("\n1.) First prob");
		System.out.println("2.) Second prob");
		System.out.println("3.) ");
		System.out.println("4.) ");
		System.out.println("5.) ");
		System.out.println("6.) ");
		System.out.println("7.) ");
		System.out.println("9.) Quit");

		System.out.println("\n");
		System.out.println("please enter choice ");
		int c=keyboard.nextInt();
		return c;

}
}	
		