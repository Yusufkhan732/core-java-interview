package corejava;

public class FunctionalInterface {

	public static void main(String[] args) {

		FunctionalInt f = new FunctionalInt() {

			@Override
			public int Sum(int a, int b) {
				return a + b;
			}
		};
		int a = 20;
		int b = 30;

		System.out.println(f.Sum(a, b));
	}
}
