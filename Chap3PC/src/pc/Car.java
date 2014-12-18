package pc;

public class Car {
	// Fields
		private String yearModel;			// Year of model 
		private String make;	// manufacturer 
		private String speed;	// top speed
		
		public Car (String n, int num,String d,String p){
			yearModel =n;		
			make=d;	
			speed=p;
		}
			
			public Car(){	
				
			}
			public void setName(String n)
			{
				yearModel = n;
			}

			public void setDepartment(String d)
			{
				make = d;
			}
			public void setPosition(String p)
			{
				speed = p;
	
			}
			public String getName()
			{
				return yearModel;
			}
			public String getDepartment()
			{
				return make;
			}
			
			public String getPosition()
			{
				return speed;
			

			}
}
