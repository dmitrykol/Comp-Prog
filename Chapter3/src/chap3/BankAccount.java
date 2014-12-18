package chap3;

/**
 * BankAccount class This class simulates a bank account.
 */

public class BankAccount {// first, last,acct number
	private double balance;
	private double interestRate; // decimal percent like .02
	private double interest; // interest earned
	private String first,last;
	private int acctNum;
	/**
	 * Account balance Interest rate Interest earned The constructor initializes
	 * the balance and interestRate fields with the values passed to
	 * startBalance and intRate . The interest field is assigned 0.0.
	 */
	// build two constructors one no arg, one with 2 params
	// add getters and setters and other methods you
	// think what you'd need a BANK ACCOUNT to be ABLE TO DO!!!!

	public BankAccount() {
		setBalance(100.0);
		setInterestRate(2.0);
		setInterest(2.0);
	}

	public BankAccount(double balance, double interestRate) {
		this.setBalance(balance);
		this.setInterestRate(interestRate);
		setInterest(0.0);
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public int getAcctNum() {
		return acctNum;
	}

	public void setAcctNum(int acctNum) {
		this.acctNum = acctNum;
	}
}