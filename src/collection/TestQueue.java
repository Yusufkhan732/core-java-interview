package collection;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class TestQueue {

	public static void main(String[] args) {
		// PriorityQueue mein smallest number ki priority highest hai:
		Queue<Integer> q = new PriorityQueue<Integer>();

		// rayBlockingQueue = FIFO + fixed capacity
		// IllegalStateException
		// Queue<Integer> q = new ArrayBlockingQueue<Integer>(3);

		q.add(200);
		q.add(300);
		q.add(500);
		q.offer(100);

		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q.contains(100));

		System.out.println(q);

	}
}