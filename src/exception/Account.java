package exception;

public class Account {

	public int balance;

	public int getBalance() {

		return balance;
	}

	public void setBalance(int balance) {

		this.balance = balance;
	}

	public void deposit(int amount) {

		this.balance = balance + amount;

		System.out.println("after deposit: " + getBalance());
	}

	public void Withdrwal(int amount) throws InsufficientBalance {

		if (amount > balance) {

			throw new InsufficientBalance();

		} else {
			this.balance = balance - amount;

			System.out.println("after withdrwal: " + getBalance());
		}

	}

	public static void main(String[] args) throws InsufficientBalance {

		Account a = new Account();

		a.setBalance(5000);

		a.deposit(1000);

		try {
			a.Withdrwal(50000);
		} catch (InsufficientBalance e) {
			System.out.println(e.getMessage());
		}
		a.setBalance(100000);
		a.Withdrwal(50000);
	}
}
