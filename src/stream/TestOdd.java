package stream;

import java.util.Arrays;

public class TestOdd {

	public static void main(String[] args) {

		int[] number = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		Arrays.stream(number).filter(e -> e % 2 != 0).forEach(System.out::println);
	}
}