package corejava;

public class ArmStrongNumber {

	public static void main(String[] args) {

		int number = 153;

		int sum = 0;

		int r = 0;

		int n = number;

		while (n > 0) {

			r = n % 10;

			sum = sum + (r * r * r);

			n = n / 10;

		}
		if (sum == number) {
			System.out.println("arm strongnumber");

		} else {
			System.out.println("not number");
		}

	}
}