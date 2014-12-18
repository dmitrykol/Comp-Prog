package pc; 
public class PizzaParlor 
{  // instance variables
  private String myName;
  private int myNumCheesePizzas;	 //# of cheese pizzas
  private int myNumPeppPizzas; 	// # of pepperoni pizzas
  private int myNumVegPizzas; 		//# of veggie pizzas
  private int myCheeseSupply; 		// ounces of cheese
  private int myPepperoniSupply;	// ounces of pepperoni
  private int myVeggieSupply; 		// ounces of veggies
  private int myDoughSupply; //ounces of dough 
  private double myRevenue; // dollars collected
  private double myCost; 
  private double myOrigAcctBal; //original bank account balance

  // default constructor
 public PizzaParlor(String name)
  {
    myName = name;
    myNumCheesePizzas -= 4;
    myNumPeppPizzas = 1;
    myNumVegPizzas = 3;
    myCheeseSupply = 400;  
    myPepperoniSupply = 200;
    myVeggieSupply = 200;
    myDoughSupply = 400;
    myRevenue = 0;
    myCost = 214.75; 
    myOrigAcctBal = 2000;
  }
  
// constructor – look at the parameters
 public PizzaParlor(String name, double balance)
  {   // write the constructor….

  }


  // methods
 public void orderCheese()
  {
    myNumCheesePizzas++;	// myNumcheese=myNumCheese+1
    myRevenue += 8;		// cheese pizza price:$8
    myCheeseSupply -= 12;	//cheese needed per cheese pizza
    myDoughSupply -= 11; //dough needed per pizza
  }

 public void orderPepperoni() // fill in the necessary code – look at orderCheese as a reference! $12 per pie
  {
	    myNumCheesePizzas++;	// myNumcheese=myNumCheese+1
	    myRevenue += 12; //cheese pizza price
	    myCheeseSupply -= 12;	//cheese needed per cheese pizza
	    myDoughSupply -= 11; //dough needed per pizza
	    myPepperoniSupply -= 10; //pepperonni needed per pizza 
  }

 public void orderVeggie()		// fill in the necessary code $10per pie
  {
	    myNumCheesePizzas++;	// myNumcheese=myNumCheese+1
	    myRevenue += 10;		// cheese pizza price:$8
	    myCheeseSupply -= 12;	//cheese needed per cheese pizza
	    myDoughSupply -= 11; //dough needed per pizza
	    myVeggieSupply -= 10; //veggies needed per pizza 

}




// overload the order methods with a parameter for number sold
public void orderCheese( int n)
  {

  }

public void orderPepperoni(int n) 		// fill in the necessary code – look at orderCheese as a reference!
  {


  }

 public void orderVeggie(int n)		// fill in the necessary code
  {



}


public void restock(int c, int p, int v){	// amount of cheese, pepperoni, veggies in Ounces to add to current stock

}



 public String getName()
  {
    return myName;
  }

public int getNumCheesePizzas()
  {
    return myNumCheesePizzas;
  }

public int getNumPepperoniPizzas()
  {
    return myNumPeppPizzas;
  }

public  int getNumVeggiePizzas()
  {
    return myNumVegPizzas;
  }

public  int getCheeseSupply()
  {
    return myCheeseSupply;
  }

public  int getPepperoniSupply()
  {
    return myPepperoniSupply;
  }

public  int getVeggieSupply()
  {
    return myVeggieSupply;
  }

public int getDoughSupply()
{
	return myDoughSupply;
}
public  double getRevenueTotal()
  {
    return myRevenue;
  }

public double getCost()
{
	return myCost; 
}
public  double getBankAccountBalance()
  {
    return myOrigAcctBal + myRevenue - myCost;
  }
}

