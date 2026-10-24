package string;

public class ConvertPrimitiveDataIntoString {

	public static void main(String[] args) {

		String btStr = String.valueOf(1); // "1"
		System.out.println("String = " + btStr);

		String shortStr = String.valueOf(2); // "2"
		System.out.println("String = " + shortStr);

		String intStr = String.valueOf(3); // "3"
		System.out.println("String = " + intStr);

		String longStr = String.valueOf(4L); // "4"
		System.out.println("String = " + longStr);

		String floatStr = String.valueOf(5.5F); // "5.5"
		System.out.println("String = " + floatStr);

		String doubleStr = String.valueOf(5.5D); // "5.5"
		System.out.println("String = " + doubleStr);

		String boolStr = String.valueOf(true); // "true"
		System.out.println("String = " + boolStr);

	}
}