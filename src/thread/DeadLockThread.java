package thread;

//Deadlock tab hota hai jab do threads ek-dusre ke
//lock ka wait karte rehte hain aur koi bhi aage nahi badh pata.
public class DeadLockThread {

	static Object lock1 = new Object();

	static Object lock2 = new Object();

	public static void main(String[] args) {

		Thread t1 = new Thread() {

			@Override
			public void run() {

				synchronized (lock1) {

					System.out.println("thrad 1");

					synchronized (lock2) {

						System.out.println("thrad 2");
					}

				}
			}

		};

		Thread t2 = new Thread() {

			@Override
			public void run() {

				synchronized (lock1) {
					System.out.println("thras 1");

					synchronized (lock2) {

						System.out.println("thrad 2");
					}

				}

			}

		};

		t1.start();
		t2.start();

	}

}
