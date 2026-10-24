package string;

public class Test1 {

	public static void main(String[] args) {

		String name = "yusuf kahan";

		int count = 0;

		for (int i = 0; i < name.length(); i++) {

			if (name.charAt(i) == 'a') {
				count++;

			}
		}
		System.out.print("a = " + count);
	}

}
