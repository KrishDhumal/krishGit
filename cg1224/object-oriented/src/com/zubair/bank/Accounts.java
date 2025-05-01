package com.zubair.bank;

/**
 * This class represents generalised bank accounts.
 * @author Zubair
 * @version 1.0
 */
public abstract class Accounts implements Banking {
	private int acntNo;
	private String hodler;
	protected double balance;
	private static int generator = INIT_ACCOUNT_NO;
	
	/** Default constructor. */
	public Accounts() {
	}

	/**
	 * Paramaterised constructor.
	 * @param hodler
	 * @param balance
	 */
	public Accounts(String hodler, double balance) {
		this.acntNo = generator ++;
		this.hodler = hodler;
		this.balance = balance;
	}
	
	/** Method to print account summary. */
	public void summary() {
		System.out.println("A/C No: " + acntNo);
		System.out.println("Holder: " + hodler);
		System.out.println("Balance: " + balance);
	}
	
	// Business Logic (BL) Methods
	public void deposit(double amount) {
		balance += amount;
	}
	
	public abstract void withdraw(double amount) throws BalanceException;

	public double getBalance() {
		return balance;
	}
}

