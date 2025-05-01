package com.zubair.bank;

public class Current extends Accounts {
	private double overdraft;
	
	public Current() {
	}

	public Current(String hodler) {
		super(hodler, INIT_CURRENT_BALANCE);
		overdraft = OVERDRAFT_LIMIT;
	}

	@Override
	public void summary() {
		super.summary();
		System.out.println("Overdraft: " + overdraft);
	}

	@Override
	public void deposit(double amount) {
		overdraft += amount;
		if(overdraft > OVERDRAFT_LIMIT) {
			balance += (overdraft - OVERDRAFT_LIMIT);
			overdraft = OVERDRAFT_LIMIT;
		}
	}

	@Override
	public void withdraw(double amount) throws BalanceException {
		if(amount <= (balance + overdraft)) {
			balance -= amount;
			if(balance < MIN_CURRENT_BALANCE) {
				overdraft += balance;
				balance = MIN_CURRENT_BALANCE;
			}
		} else 
			throw new BalanceException("Insufficient balance!");
	}
}





