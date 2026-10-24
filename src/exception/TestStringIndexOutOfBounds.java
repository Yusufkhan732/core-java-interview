package exception;

public class TestStringIndexOutOfBounds {

	public static void main(String[] args) {

		String s = "abc";
		try {
			System.out.println(s.charAt(3));

		} catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}

	}
}
