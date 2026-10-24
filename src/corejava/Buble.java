package corejava;

public class Buble {

	public static void main(String[] args) {

		int num[] = { 12, 21, 45, 56, 90, 56 };

		int temp = 0;

		for (int i = 0; i < num.length; i++) {

			for (int j = i + 1; j < num.length; j++) {

				if (num[i] > num[j]) {

					temp = num[i];
					num[i] = num[j];

					num[j] = temp;

				}

			}
			System.out.print(num[i] + " ");

		}

	}
}