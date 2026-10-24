package corejava;

public class BubbleShort {

	public static void main(String[] args) {

		int[] num = { 100, 34, 67, 78, 32 };

		int temp = 0;

		for (int i = 0; i < num.length; i++) {

			// 1 se start karega 34 se
			for (int j = i + 1; j < num.length; j++) {

				// 100 > 33 se true
				if (num[i] > num[j]) {
					// num[i] kiya hai 100 ko temp me swap ker diya
					temp = num[i];

					// num[j]34 ko swap kar diya num[i] me
					num[i] = num[j];

					// temp 100 ko swap kar diya num[j] m
					num[j] = temp;
				}

			}
			System.out.print(num[i] + " ");

		}
	}
}