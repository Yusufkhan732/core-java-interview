package stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class DistincitMethod {

	public static void main(String[] args) {

		Collection<String> list = Arrays.asList("A", "B", "C", "D", "E", "A");

		// Get collection without duplicate i.e. distinct only
		List<String> distinctElements = list.stream().distinct().collect(Collectors.toList());

		// Let's verify distinct elements
		System.out.println(distinctElements);

	}
}
