package corejava;

public class Lemda {

	public static void main(String[] args) {

		Functional f = new Functional() {

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