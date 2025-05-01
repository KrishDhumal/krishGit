package com.zubair.bank;

public final class AccountsFactory {
	private AccountsFactory() {
	}

	public static Savings openSavingsAccount(String holder) {
		return new Savings(holder);
	}
	
	public static Current openCurrentAccount(String holder) {
		return new Current(holder);
	}
}
