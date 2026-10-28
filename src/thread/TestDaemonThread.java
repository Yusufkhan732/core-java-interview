package thread;

public class TestDaemonThread {

	public static void main(String[] args) {

		BackgroundThread t1 = new BackgroundThread("Deomon Thread");

		t1.setDaemon(true); // yeh htane se infinte chlega ..
		t1.start();

		for (int i = 1; i <= 5; i++) {

			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i + " main Thread");
		}
	}
}