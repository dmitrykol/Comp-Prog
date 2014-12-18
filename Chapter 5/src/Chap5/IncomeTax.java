package Chap5;
import java.util.Scanner; 
public class IncomeTax {

	public static void main(String[] args) {
	
Scanner key = new Scanner(System.in);

String status;
System.out.println("What is your marital status? Type 'S' for single and 'M' for married" );
status = key.next();

System.out.println("What is your annual income?");
double income;
income = key.nextDouble();

double marriedTax;
double singleTax;

if (status.equals("S")){
	if (income > 0 && income <= 27050){
	singleTax = income * .15;	
	}
}
else if (income > 27050 && income <= 65550){
	singleTax = income * .275 + 4057.50;
	}
else if (income > 65550 && income <= 136750){
		singleTax = income * .305 + 14645.00;	
		}
else if (income > 136750 && income <= 297350){
		singleTax = income * .355 + 36361.00;	
		}
	}
}