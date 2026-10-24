package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {

		List<Emp> list = new ArrayList();

		list.add(new Emp("yusuf", "7804023605"));
		list.add(new Emp("shad", "9104023605"));
		list.add(new Emp("akbar", "9504023605"));
		list.add(new Emp("yusuf", "9804023605"));

		list.stream().filter(e -> e.mobileNo.length() == 10)
				.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {

					Collections.shuffle(e);
					return e.stream();
				})).limit(2).forEach(e -> {
					System.out.println(e.name + " " + e.mobileNo);
				});
	}

}