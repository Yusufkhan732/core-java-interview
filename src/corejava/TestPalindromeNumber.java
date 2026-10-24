package corejava;

public class TestPalindromeNumber {

	public static void main(String args[]) {
		// r = n % 10; // last digit nikalo
		// n = n / 10; // last digit hatao
		
		int number = 121;

		int r = 0;

		int sum = 0;

		int n = number;

		while (n > 0) {

			r = n % 10;

			sum = (sum * 10) + r;

			n = n / 10;
		}

		if (sum == number) {

			System.out.println(number + " is a PalindromeNumber");
		} else {

			System.out.println(number + " is not a PalindromeNumber");

		}
	}
}
