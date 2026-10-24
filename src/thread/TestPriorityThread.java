package thread;

public class TestPriorityThread {
	
	public static void main(String[] args) {

		PriorityThread t1 = new PriorityThread("abc");

		PriorityThread t2 = new PriorityThread("xyz");

		// Set thread priorities
		t1.setPriority(1); // Maximum priority
		t2.setPriority(10); // Minimum priority

		t1.start();

		t2.start();
	}
}