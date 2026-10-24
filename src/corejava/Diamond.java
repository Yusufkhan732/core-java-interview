package corejava;

public class Diamond {

	public static void main(String[] args) {

		for (int i = 0; i <= 5; i++) {
			for (int j = 5 - i; j >= 0; j--) {

				System.out.print(" ");

			}
			for (int j = 2 * i - 1; j > 0; j--) {

				System.out.print("*");

			}
			System.out.println();
		}
		for (int i = 4; i >= 1; i--) {
			for (int j = 5 - i; j >= 0; j--) {
				System.out.print(" ");

			}
			for (int j = 2 * i - 1; j > 0; j--) {
				System.out.print("*");

			}
			System.out.println();

		}

	}

}