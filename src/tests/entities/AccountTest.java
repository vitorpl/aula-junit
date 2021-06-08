package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Account;
import tests.factory.AccountFactory;

public class AccountTest {

	//<ACAO> should <EFEITO> [when <CENÁRIO>]
	@Test
	public void depositShouldIncreaseBalanceWhenPositiveAmount() {
		
		/**
		 * Arranje -> Instancie o que for necessário
		 * Act -> Execute os métodos
		 * Assert -> declare o que deveria acontecer (resultado esperado)
		 */
		
		//Arranje
		double amount = 200.0; //200 - 2%  = 196
		double expectedValue = 196.0;
		Account acc = AccountFactory.createAccount(); //new Account(1L, 0);
		//Act
		acc.deposit(amount);
		//Assert
		Assertions.assertEquals(expectedValue, acc.getBalance());		
	}
	
	@Test
	public void withdrawSouldDecreaseBalanceWhenPositiveAmount() {
		
		double amount = 50;
		double initialValue = 200;
		double expectedValue = 150;
		Account acc = AccountFactory.createAccount(initialValue);//new Account(1L, initialValue);
		
		acc.withdraw(amount);
		
		Assertions.assertEquals(expectedValue, acc.getBalance());
	}
	
	@Test
	public void depositShouldDoNothingWhenNegativeAmount() {
		
		double amount = -5.0;
		double initValue = 100.0;
		double expectedValue = initValue;
		Account acc = AccountFactory.createAccount(initValue); //new Account(1L, initValue);
		
		acc.deposit(amount);
		
		Assertions.assertEquals(expectedValue, acc.getBalance());		
	}
}
