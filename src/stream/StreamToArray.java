package stream;

import java.util.stream.Stream;

public class StreamToArray {
	public static void main(String[] args) {

		Stream<String> str = Stream.of("abc", "xyz");

		String[] arr = str.toArray(String[]::new);

		for (String s : arr) {

			System.out.println(s);

		}
	}
}