package corejava;

public class FunctionalInterfaceLemda {

	public static void main(String[] args) {

		FunctionalInt f = (a, b) -> {

			return a + b;

		};

		int a = 30;

		int b = 20;

		System.out.println(f.Sum(a, b));
	}

}
