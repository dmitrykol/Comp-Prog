/**
 * 
 */
package chap2;

/**
 * @author 327011
 *
 */
import java.util.Scanner;
public class AreaCircumference {

	/**
	 * @param args
	 */
	public static void main(String[] args){
	// run the area method
	//area();
		
		
	} //end main 
	
	public static void area(){
		// calculate area of circle 
		Scanner keyboard = new Scanner(System.in);
		double radius,area,circumfernce,pi;  
		pi=Math.PI; 
		
System.out.println("Welcome to my circle program\n");
String name= keyboard.nextLine();
		
		//ask for radius
		System.out.println("Please enter the radius ");
		radius=keyboard.nextInt();
		
		//calc ara and circumference 
		area=pi*Math.pow(radius, 2);
		circumfernce=2*pi*radius;
	
		//output 
		System.out.println("The area of a cirle is (area) ");
		System.out.println("The circumference of a circle is (circumfrence) ");

	}

}
