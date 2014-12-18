package pc;

/**
 * Written by Student Programmer
 * Chapter 3
 * Assignment 1: Employee Class
 *
 * The Employee class stores data about an employee.
 */


public class Employee
{
	// Fields
	private String name;			// Employee's name
	private int idNumber;		// ID number
	private String department;	// Employee's department
	private String position;	// Job title
	
	//constructor
	public Employee (String n, int num,String d,String p){
		name =n;			// Employee's name
		idNumber=num;		// ID number
		department=d;	// Employee's department
		position=p;	
	}
	
	//default no arg constructor
	public Employee(){
		
	}
	
	/**
	 * The setName method accepts an argument
	 * which is stored in the name field.
	 */

	public void setName(String n)
	{
		name = n;
	}

	/**
	 * The setIdNumber method accepts an argument
	 * which is stored in the idNumber field.
	 */

	public void setIdNumber(int num)
	{
		idNumber = num;
	}	

	/**
	 * The setDepartment method accepts an argument
	 * which is stored in the department field.
	 */

	public void setDepartment(String d)
	{
		department = d;
	}
	
	/**
	 * The setPosition method accepts an argument
	 * which is stored in the position field.
	 */

	public void setPosition(String p)
	{
		position = p;
	}
	
	/**
	 * The getName method returns the value in
	 * the name field.
	 */

	public String getName()
	{
		return name;
	}

	/**
	 * The getIdNumber method returns the value in
	 * the idNumber field.
	 */

	public int getIdNumber()
	{
		return idNumber;
	}

	/**
	 * The getDepartment method returns the value in
	 * the department field.
	 */

	public String getDepartment()
	{
		return department;
	}
	
	/**
	 * The getPosition method returns the value in
	 * the position field.
	 */

	public String getPosition()
	{
		return position;
	}
}
