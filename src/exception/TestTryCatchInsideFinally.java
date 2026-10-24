package exception;

public class TestTryCatchInsideFinally {

	public static void main(String[] args) {

		try {

			System.out.println("try");
		} catch (Exception e) {
			System.out.println("catch");
		} finally {

			try {
				System.out.println("inside finally");

				int a = 10 / 0;
			} catch (ArithmeticException e2) {
				System.out.println(e2);
				System.out.println("inside finally catch");
			}
			System.out.println("finally end");
		}
	}

}
