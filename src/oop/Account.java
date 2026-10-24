package oop;

public class Account {

	private String number;

	private String accountType;

	private double balance;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		if (balance > 0) {
			this.balance = balance;
		} else {
			System.out.println("Invalid balance");
		}
	}

	// Deposit method
	public void deposit(double amount) {
		if (amount > 0) {
			balance = balance + amount;
			System.out.println("Deposited:" + amount);
			System.out.println("Total Balance:" + balance);
		} else {
			System.out.println("Invalid amount:");
		}
	}

	// Withdraw method
	public void withdrawal(double amount) {
		if (amount > 0 && amount <= balance) {
			balance = balance - amount;
			System.out.println("Withdrawn amount: " + amount);
			System.out.println("Remaining Balance: " + balance);
		} else if (amount > balance) {
			System.out.println("Insufficiant funds:");
		} else {
			System.out.println("Invalid amount:");
		}
	}

	// Fund Transfer method
	public void fundTransfer(Account accountToTransfer, double amount) {
		if (amount > 0 && amount <= balance) {
			balance = balance - amount;
			accountToTransfer.balance = accountToTransfer.balance + amount;
			System.out.println("Transferred " + amount + " to " + accountToTransfer.getNumber());
			System.out.println("Your New Balance: " + this.balance);
		} else {
			System.out.println("Transfer failed. Insufficient funds or invalid amount");
		}
	}

	// Pay Bill method
	public void payBill(String biller, double amount) {
		if (amount > 0 && amount <= balance) {
			balance = balance - amount;
			System.out.println("Paid " + amount + " to " + biller);
			System.out.println("New Balance: " + balance);
		} else {
			System.out.println("Payment failed. Insufficient funds or invalid amount");
		}
	}

	// Display Account Details
	public void displayAccountInfo() {
		System.out.println("Account Details:");
		System.out.println("Account Number: " + number);
		System.out.println("Account Type: " + accountType);
		System.out.println("Balance: " + balance);
	}

}