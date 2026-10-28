package thread.racing;

public class TestRacing {
	public static void main(String[] args) {

		Racing t1 = new Racing("Akbar");

		Racing t2 = new Racing("Mansuri");

		t1.start();
		t2.start();
	}

}