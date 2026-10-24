package corejava;

public class SecondHigInArray {

	public static void main(String[] args) {

		int[] num = { 77, 5, 8, 6, 10, 15, 25, 1 };

		int temp = 0;
		int count = 0;

		for (int i = 0; i < num.length; i++) {

			if (temp < num[i]) {

				count = temp;

				temp = num[i];
			}
			if (count < num[i] && temp > num[i]) {
				count = num[i];
			}

		}
		System.out.println(count);

	}

}
