package Chap4;

public class FirstIf {

	/**
	 * IF then else Conditional / Relational Expressions
	 * Operators:  >, <, <=, >=,  == (boolean equals, not assign)
	 *     != (not equal)
	 */
	public static void main(String[] args) {	
		int x,y,z;	
		x=15;
		y=14;
		z=50;
		boolean fail;
		fail=z<60||(5<z&& z==50);			// notice how you can use bool's

		if(x>y && fail)
			System.out.println(x+ " is greater than "+ y);
		else
			System.out.println(x+"  is not greater than "+y);
		
		// using boolean var's
		if (fail)
			System.out.println("ouch");
		else
			System.out.println("woo hoo");
		System.out.println("done");
	}
}
