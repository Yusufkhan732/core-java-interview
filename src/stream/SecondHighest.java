package stream;

import java.util.Arrays;

public class SecondHighest {
	public static void main(String[] args) {

		int[] arr = { 10, 30, 20, 50, 40, 39, 32, 42, 41 };

		int secondHighest = Arrays.stream(arr).boxed().sorted((a, b) -> b - a).distinct().skip(1).findFirst().get();
		System.out.println(secondHighest);
	}
}