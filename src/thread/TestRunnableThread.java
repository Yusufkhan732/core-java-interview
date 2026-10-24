package thread;

public class TestRunnableThread {
	
	public static void main(String[] args) {

		Thread t1 = new Thread(new RunnableThread("abc"));

		Thread t2 = new Thread(new RunnableThread("xyz"));

		t1.start();
		t2.start();
	}
}