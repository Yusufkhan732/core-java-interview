package encapsulation;

public class Account {

	private double balance = 0;

	public double getBalace() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;

	}

	public void deposit(double amount) {

		balance = balance + amount;

		System.out.println("Balance after Diposit " + balance);

	}

	public void Withdrwal(double amount) {

		if (balance < amount) {
			System.out.println("Insaficiant balance");
		} else {
			balance = balance - amount;
			System.out.println("balance after withdrwal " + balance);
		}

	}

	public void payBill(String bill, double amount) {

		if (balance < amount) {

			System.out.println("Indaficiant balance");

		} else {

			balance = balance - amount;
			System.out.println("bill no " + bill);
			System.out.println("bill paid " + amount);
			System.out.println("after reamning balance " + balance);
		}

	}
}
