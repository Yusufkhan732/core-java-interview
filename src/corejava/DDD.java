package corejava;

public class DDD {

	public static void main(String[] args) {

		int num[] = { 55, 22, 77, 88, 90 };

		int count = 0;

		int second = 0;

		for (int i = 0; i < num.length; i++) {

			if (second < num[i]) {

				count = second;

				second = num[i];
			}
			if (count > num[i] && second > num[i]) {

				count = num[i];
			}

		}
		System.out.println(count);
	}
}