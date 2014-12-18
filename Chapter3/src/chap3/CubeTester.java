package chap3;
/**
 * 
 * @author gsmith
 * Creating  our first Class or Object
 * 10/10/14
 */
public class CubeTester {
// instance fields (attributes)
// things the Class should KNOW
	private double width;    //auto 0 if not otherwise defined
	private double length;
	private double height;
	
	// Constructor(s) and OVERLoaded constructors
	public CubeTester(){
		// default constructor - if you don't write one Java 
		//gives you one set to zero
		width=1;
		length=1;
		height=1;
	}
	
	public CubeTester(double len,double wid, double h){
		// two double constructor  
		width=wid;
		length=len;
		height=h;
	}
	public CubeTester(double s){
		// a real "cube" constructor  
		width=s;
		length=s;
		height=s;
	}
	
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
	
	public void setWidth(double w){
		width=w;
	}
	
	public void setHeight(double h){
		height=h;
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
	
	public double getHeight(){
		return height;
	}
	
	
	public double getVolume(){
		double v=length*width*height;
		return v;
	}

	public double getSurfaceArea(){
		double s=2*length*height+2*length*width+2*width*height;
		return s;
	}
}