package thread;

public class Test {

	public static void main(String[] args) {

		BackgroundThread thread = new BackgroundThread("deamon thread");

		thread.setDaemon(true);

		thread.start();

		for (int i = 1; i <= 10; i++) {

			try {

				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i + " main");
		}
	}
}
