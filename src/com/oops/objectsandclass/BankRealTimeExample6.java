package com.oops.objectsandclass;

class Account {
	int acc_no;
	String name;
	float amount;

	// Method to initialize object
	void insert(int a, String n, float amt) {
		acc_no = a;
		name = n;
		amount = amt;
	}

	// deposit method
	void deposit(float amt) {
		amount = amount + amt;
		System.out.println(amt + " deposited");
	}

	// withdraw method
	void withdraw(float amt) {
		if (amount < amt) {
			System.out.println("Insufficient Balance");
		} else {
			amount = amount - amt;
			System.out.println(amt + " withdrawn");
		}
	}
}

public class BankRealTimeExample6 {

}
