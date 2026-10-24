package comparable;

import java.util.ArrayList;
import java.util.List;

public class TestEmp {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(new Test(1, "ilyas", 12000));
		list.add(new Test(2, "yusuf", 13000));
		list.add(new Test(3, "haseem", 14000));
		list.add(new Test(4, "azam", 15000));
		list.add(new Test(5, "anas", 17000));

		System.out.println(list);
	}
}
