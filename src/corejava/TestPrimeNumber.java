package corejava;

public class TestPrimeNumber {

	public static void main(String[] args) {

		int number = 3;

		int count = 0;

		for (int i = 2; i < number; i++) {

			if (number % i == 0) {

				count++;

			}

		}
		if (count == 0) {

			System.out.println("Number is a prime number");

		} else {

			System.out.println("Number is not a prime number");
		}

	}

}
