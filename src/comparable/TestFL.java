package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestFL {

	public static void main(String[] args) {

		List<FLShorting> list = new ArrayList<FLShorting>();

		list.add(new FLShorting("Neeraj", "Darbar"));
		list.add(new FLShorting("Neeraj", "Tomar"));
		list.add(new FLShorting("Rishabh", "Shrivastav"));
		list.add(new FLShorting("Ankit", "Rawat"));

		Collections.sort(list);

		for (FLShorting e : list) {
			System.out.println(e);
		}
	}
}