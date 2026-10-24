package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestConstestent {

	public static void main(String[] args) {

		List<Constestent> list = new ArrayList<Constestent>();

		list.add(new Constestent("Neeraj", "7879669613"));
		list.add(new Constestent("Lucky", "9876543322"));
		list.add(new Constestent("Chaitanya", "8796846334"));
		list.add(new Constestent("Rishabh", "7879669613"));

		list.stream().filter(e -> e.mobileNo.length() == 10)
				.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
					Collections.shuffle(e);
					return e.stream();
				})).limit(2).forEach(e -> {
					System.out.println(e.name + " " + e.mobileNo);
				});

	}

}
