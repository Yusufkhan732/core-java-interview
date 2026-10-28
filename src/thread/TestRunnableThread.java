package thread;

public class TestRunnableThread {

	public static void main(String[] args) {

		Thread t1 = new Thread(new ByRunnable("abc"));

		Thread t2 = new Thread(new ByRunnable("xyz"));

		t1.run();
		t2.run();
	}
}