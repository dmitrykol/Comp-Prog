/**
 * 
 */
package chap2;

/**
 * @author 327011
 *
 */
public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="fred";
		String s2 ="Wilma";
		
		System.out.println(s +" "+s2);
		
		System.out.println(s.equals(s2));
		
		System.out.println(s.compareToIgnoreCase(s2));
		
		System.out.println(s.substring(2));
		System.out.println(s.substring(1,2));
		
		String num1 = "12";
		String num2 = "34";
		System.out.println(num1 + num2 + 56);
	}

}
