package string;

public class IntegerSum {

	public static void main(String[] args) {

		String name = "madam";

		String reverse = "";

		for (int i = name.length()-1; i >= 0; i--) {

			reverse = reverse + name.charAt(i);

		}
		if (name.equals(reverse)) {
			System.out.println("palindrome");

		} else {
			System.out.println("not palindrome");
		}
	}
}
