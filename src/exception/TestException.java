package exception;

public class TestException {

	public static void main(String[] args) {

		int a = 10;

		try {

			System.out.println(a / 4);

		} catch (ArithmeticException e) {

			System.out.println(e);

		}

	}

}
