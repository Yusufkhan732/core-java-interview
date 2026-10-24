package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

public class Test {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(3);

		list.add(2);

		list.add(3);

		list.add(4);

//		Collections.reverse(list);
//		
//		System.out.println(list);
//		

		for (int i = list.size() - 1; i >= 0; i--) {

			System.out.println(list.get(i));

		}

	}

}