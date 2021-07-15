package com.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		BankAccount personalAccount = new BankAccount();
		Scanner input = new Scanner(System.in);
		int option;
		do {
			System.out.println("-------Menu--------");
			System.out.println("Choose an option");
			System.out.println("1. withdraw");
			System.out.println("2. deposit");
			System.out.println("3. print balance");
			System.out.println("4. account status");
			System.out.println("5. add receiver");
			System.out.println("6. exit ");
			option = input.nextInt();
			switch (option) {
				case 1:
					System.out.println("Insert the quantity you want to withdraw");
					float amount = input.nextFloat();
					personalAccount.withdraw(amount);
					break;
				case 2:
					System.out.println("Insert the quantity you want to deposit");
					float deposit = input.nextFloat();
					personalAccount.deposit(deposit);
					break;
				case 3:
					System.out.println("Your balance is: " + personalAccount.checkBalance());
				case 5:
					System.out.println("Insert receiver's name");
					String name = input.next();
					personalAccount.receiver = name;
					break;
				}
		} while (option == 6);
		input.close();
	}

}
