package thread;

public class RacingThread extends Thread{
	
	String name = null;

	public static Account account = new Account();

	public RacingThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			account.deposite(name, 1000);
		}
	}
}