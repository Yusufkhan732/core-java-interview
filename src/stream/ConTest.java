package stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ConTest {

	public static void main(String[] args) {

		List<TestCon> list = new ArrayList<TestCon>();

		list.add(new TestCon("shad", "9089098806"));
		list.add(new TestCon("yusuf", "7890988089"));
		list.add(new TestCon("akbar", "7989098800"));
		list.add(new TestCon("ilyas", "9189098809"));

		list.stream().filter(e -> e.mobileNo.length() == 10)
				.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
					Collections.shuffle(e);
					return e.stream();
				})).limit(1).forEach(e -> {
					System.out.println(e.name + " " + e.mobileNo);
				});

	}

}
