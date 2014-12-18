package rental;

/**
 * @author Sam (hella good hair)
 * @date 11/5/14
 *
 */
public class CarTester {
	private String make, model, licenseplate;
	private int year;
	
	public CarTester(){
		
		
	}
	
	public CarTester(String ma, String mo, String lp, int y){
		make=ma;
		model=mo;
		licenseplate=lp;
		year=y;
	}
	
	public String getMake(){
		return make;
	}
	public void setMake(String m){
		make=m;
	}
	public String getModel(){
		return model;
	}
	public void setModel(String m){
		model=m;
	}
	public String getLicensePlate(){
		return
		 licenseplate;
	}
	public void setLicensePlate(String lp){
		licenseplate=lp;
	}
	public int getYear(){
		return year;
	}
	public void setYear(int y){
		year=y;
	}
	// find special code
	public String getSpecialCode(){
		char a, b, c;
		String d;
		int num1, num2, num3; 
		//get 3 digit integer from license
		d=licenseplate.substring(3);
		int num = Integer.parseInt(d);

		// get the three char's
		a=licenseplate.charAt(0);
		b=licenseplate.charAt(1);
		c=licenseplate.charAt(2);

		// get their int values by casting
		num1=(int)a;
		num2=(int)b;
		num3=(int)c;

		//produce special code
		int s=num1+num2+num3+num;
		int remainder=s%26;
		int h = 65+remainder;		//65=A remember
		char specialChar=(char)h;
		
		//char+string=String
		String sp=""+specialChar+s;
		return sp;

		}

	public void printlabel(){
		System.out.println("Make is "+make);
		System.out.println("Model is "+model);
		System.out.println("Year is "+year);
		System.out.println("License Plate is "+licenseplate);
		System.out.println("Special Code is "+getSpecialCode());
	}

}

