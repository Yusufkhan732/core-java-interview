package corejava;

public class SecondHihest {

	public static void main(String[] args) {

		int num[] = { 23, 87, 88, 100 };

		int higest = 0;

		for (int i = 0; i < num.length; i++) {
			if (higest < num[i]) {
				
				higest = num[i];

			}

		}
		System.out.println(higest);
	}
}