package com.main;

public class BankAccount {
	String institute = "";
	String receiver = "";
	float balance = 0;
	long accountNumber = 0;
	String product = "";
	String address = "";
	String id = "";

	public void deposit(float monto) {
		this.balance = this.balance + monto;
	}

	public void withdraw(float monto) {
		if (monto < this.balance && monto > 0) {
			this.balance = this.balance - monto;
		}
	}

	public float checkBalance() {
		return this.balance;
	}

	public String accountStatus() {
		return "";
	}
}
