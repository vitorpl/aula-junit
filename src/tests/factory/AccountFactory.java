package tests.factory;

import entities.Account;

public class AccountFactory {

	public static Account createAccount() {
		return new Account(1L, 0);
	}
	
	public static Account createAccount(double initialValue) {
		return new Account(1L, initialValue);
	}
}
