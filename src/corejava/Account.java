package corejava;

public class Account {

	private double balance = 0;

	public double getBalance() {
		return balance;
	}

	public void getBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {

		balance = balance + amount;

		System.out.println("after deposit amount " + amount);

	}

	public void Withdrwal(double amount) {

		if (balance < amount) {

			System.out.println("Insafisiant balance");
		} else {
			balance = balance - amount;

			System.out.println("after withdrwal amount " + balance);
			System.out.println("reamainig balance " + amount);
		}

	}

	public void payBill(String bill, double amount) {

		if (balance < amount) {

			System.out.println("Insaficiant balance");

		} else {
			balance = balance - amount;
			System.out.println("bill no " + bill);
			System.out.println("bill paid " + amount);
			System.out.println("after reaminig  balance  " + balance);

		}

	}
}
