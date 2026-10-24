package thread;

public class TestRacing {
	
	public static void main(String[] args) {

		RacingThread t1 = new RacingThread("abc");
		
		RacingThread t2 = new RacingThread("xyz");
		
		t1.start();
		t2.start();
		
	}
}