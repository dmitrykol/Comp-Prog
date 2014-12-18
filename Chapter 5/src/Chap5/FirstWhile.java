package Chap5;
import java.util.Scanner;
public class FirstWhile {

public static void main (String[]args){
int x,start,end,inc;	
 Scanner keyboard=new Scanner(System.in);
 
 System.out.println("enter first sum");
 start=keyboard.nextInt();
 
 System.out.println("enter last sum");
 end=keyboard.nextInt();
 
 System.out.println("enter increment");
 inc=keyboard.nextInt();
 
 x=start;
 
System.out.println("X"+"\t\t"+"x*x");
System.out.println("----------------");	
while (x<=end)
{
	System.out.println(x+"\t|\t"+x*x);
}
x+=inc;{
}
System.out.println(x);{
}
}}