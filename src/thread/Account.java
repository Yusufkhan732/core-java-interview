package thread;

public class Account {
	
	private int balance = 0;

	public void setBalance(int balance) {
		try {										// setBalance method
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.balance = balance;
	}

	public int getBalance() {
		try {										// setBalance method
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return balance;
	}

	public synchronized void deposite(String name, int amt) {

		int total = getBalance() + amt;

		setBalance(total);

		System.out.println(name + " " + getBalance());
	}
}