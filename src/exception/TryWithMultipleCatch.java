package exception;

public class TryWithMultipleCatch {

	public static void main(String[] args) {

		int b = 10;

		String name = "yusuf";

		int[] arr = { 1, 2 };

		try {

			System.out.println(arr[1]);
			int c = b / 0;
			System.out.println("Division = " + c);

			System.out.println(name.length());

		} catch (ArithmeticException e) {
			System.out.println(e);
			System.exit(0);

		} catch (NullPointerException e) {
			System.out.println(e);

		} finally {
			System.out.println("finally");
		}
	}
}