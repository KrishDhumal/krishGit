package com.zubair.bank;

public class Savings extends Accounts {

	public Savings() {
	}

	public Savings(String hodler) {
		super(hodler, MIN_SAVINGS_BALANCE);
	}

	@Override
	public void withdraw(double amount) throws BalanceException {
		if(amount <= (getBalance() - MIN_SAVINGS_BALANCE)) 
			balance -= amount;
		else
			throw new BalanceException("Insufficient balance");
	}
}
