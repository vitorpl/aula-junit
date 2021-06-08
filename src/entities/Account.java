package entities;

import java.math.BigDecimal;

public class Account {
	
	private Long id;
	public static double DEPOSIT_FEE_PERCENTAGE = 0.02;
	private double balance;
	
	public Account() {
		
	}
	
	public Account(Long id, double balance) {
		super();
		this.id = id;
		this.balance = balance;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}

	//Ex: taxa de 2% sob o depósito
	public void deposit(double amount) {
		if(amount > 0) {
			amount -= amount * DEPOSIT_FEE_PERCENTAGE;
			balance += amount;
		}
	}
	
	public void withdraw(double amount) {
		if(amount > balance) {
			throw new IllegalArgumentException("Saldo insuficiente para realizar o saque");
		}
		balance -= amount;
	}
	
	public double fullWithdraw() {
		double aux = balance;
		balance = 0.0;
		return aux;
	}
}
