package thread;

public class TestWithoutThread {
	
	public static void main(String[] args) {
		
		WithoutThread t1 = new WithoutThread("Pushpraj");
		
		WithoutThread t2 = new WithoutThread("Kachhaway");
		
		t1.run();
		
		t2.run();
	}
}