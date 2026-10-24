package thread;

public class RunnableThread extends Thread {

	String name = null;

	public RunnableThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {

		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " = " + name);
		}
	}
}