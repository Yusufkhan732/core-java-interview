package thread;

public class Join {

	public static void main(String[] args) {

		JoinThread j1 = new JoinThread("yusf");
		JoinThread j2 = new JoinThread("khan");

		j1.start();

		try {
			j1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		j2.start();
	}
}
