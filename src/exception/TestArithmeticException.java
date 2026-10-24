package exception;

public class TestArithmeticException {

	public static void main(String[] args) {

		// Java mein integer ko 0 se divide nahi kar sakte.

		int a = 10;

		try {

			System.out.println(a / 0);

		} catch (ArithmeticException e) {

			System.out.println(e);
			
		} finally {
			
			System.out.println("yusuf");
		}
	}

}
