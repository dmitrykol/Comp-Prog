package pc;

import java.util.Scanner;


	public class PizzaTester
	{
	  public static void main(String[] args)
	  {
	    Scanner keyboard= new Scanner(System.in);
	    String name;

	    System.out.print("Please enter your first name: ");
	    name = keyboard.nextLine();

	    PizzaParlor shop1 = new PizzaParlor(name);
	    
	    System.out.print("The name of your restaurant is: ");
	    System.out.println(shop1.getName() + "'s Pizza Parlor");

	    shop1.orderCheese(2);
	    shop1.orderCheese(2);
	    shop1.orderCheese();
	    shop1.orderPepperoni();
	    shop1.orderCheese();
	    shop1.orderPepperoni();
	    shop1.orderVeggie();
	    shop1.orderCheese();

	    System.out.println("# of Cheese ordered is " 
	+ shop1.getNumCheesePizzas());
	    System.out.println("# of Pepperoni ordered is " 
	+ shop1.getNumPepperoniPizzas());
	    System.out.println("# of Veggie ordered is " 
	+ shop1.getNumVeggiePizzas());

	    System.out.print("\nRemaining supply of cheese in ounces is: ");
	    System.out.println(shop1.getCheeseSupply());
	    System.out.print("Remaining supply of pepperoni in ounces is: ");
	    System.out.println(shop1.getPepperoniSupply());
	    System.out.print("Remaining supply of veggies in ounces is: ");
	    System.out.println(shop1.getVeggieSupply());

	    System.out.println("\nRevenue is $" + shop1.getRevenueTotal());
	    System.out.println("Bank balance is now $" 
	+ shop1.getBankAccountBalance());

	  }
	}

