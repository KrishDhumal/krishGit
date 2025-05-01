package com.zubair.bank;

public interface Banking {
	// Constants of Accounts application
	int INIT_ACCOUNT_NO = 123001;
	double MIN_SAVINGS_BALANCE = 1000;
	double INIT_CURRENT_BALANCE = 5000;
	double MIN_CURRENT_BALANCE = 0;
	double OVERDRAFT_LIMIT = 10000;

	// Interface of Accounts application
	void summary();
	void deposit(double amount);
	void withdraw(double amount) throws BalanceException;
	double getBalance();
}
