/**
 * 
 */
package chap2;
/**
 * 
 */
import java.util.Scanner; 
/**
 * @author 327011
 *
 */
public class StraightLinePrograms {
		/**
		 * @param args
		 */
		public static void main(String[] args) {
			// welcomeand display menu
			System.out.println("Welcome to my chap 2 Menu Program \n");
			//do while loop begins... 
		do {
			int c = menu(); 			// run menu method RETURN THE user choice
			Scanner keyboard = new Scanner(System.in);
			String s1, s2;
			
			switch (c) {
			case 1:
				//run method for prob 1
				dollarsToYen();
				break;

			case 2:
				//run method for prob 2
				break;
			case 3:
				//run method for prob 3

				break;
			case 4:
				//run method for prob 4
				
						break;
			default:
				System.out.println("hey , enter 1-4");
			}
		} while (c<= 5);
	}

		public static int menu() {
			Scanner keyboard = new Scanner(System.in);
			System.out.println("1.) Convert dollars to yen  ");
			System.out.println("2.) Convert yen to dollars ");
			System.out.println("3.) Convert euros to dollars ");
			System.out.println("4.) Convert degrees to radians ");
			System.out.println("5.) Quit");
			System.out.println("enter choice");
			int c = keyboard.nextInt();
			return c;
		}
		
	public static void dollarsToYen(){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter how many dollars to convert to yen");
		double d = keyboard.nextDouble();
		double yen=d*107.39;
		
		//output
		System.out.println("$"+d+" ="+yen+"yen");
		
	}
	
	public static void yenToDollars(){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter how many yen to convert to dollars");
		double y = keyboard.nextDouble();
		double dollars=y/107.39;
		
		//output
		System.out.println("yen =" + d +" dollars");
	}

	public static void eurosToDollars(){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter how many euros to convert to dollars");
		double u = keyboard.nextDouble();
		double dollars=u/.77223;
		
		//output
		System.out.println("euros=" );
			
	}
	
	public static void desreesToRadians(){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter how many degrees to convert to radians");
		double d = keyboard.nextDouble();
		double radians= d*(3.14/180);
		
		//output
		System.out.println("$"+d+" ="+dollars+"dollars");
	}
	
	}