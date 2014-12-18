package chap3;


/**
 * 
 * @author 
 * Creating  our first Class or Object
 * 10/16/14
 * 
 */
public class Rectangle {
// instance fields (attributes)
// things the Class should KNOW
	private double width;    //auto 0 if not otherwise defined
	private double length;
	
	/*// Constructor(s)
	public Rectangle(){
		// default constructor - if you don't write one Java 
		//gives you one set to zero
		width=0;
		length=0;
	}
	
	public Rectangle(double len,double wid){
		// overloading constructors
		width=wid;
		length=len;
	}
	
	
	public Rectangle(double s){
		length=s;
		width=s;
	}*/
	
	// Mutator Methods - change stuff 
	/**
	* The setLength method accepts an argument
	* that is stored in the length field.
	* void means it doesn't return or give back a value
	*/
	public void setLength(double len)  
	// void means does not return a value
	{
			length = len;
	}
	
	public void setWidth(double wid){
		width=wid;
	}
	
	/*
	 * Accessor methods - get or access information
	 * need return TYPES not VOID
	 */
	public double getLength(){
		return length;
	}
	
	public double getWidth(){
		

		return width;
	}
	
	
	public double getArea(){
		double area=length*width;
		return area;    
	}
	
}
