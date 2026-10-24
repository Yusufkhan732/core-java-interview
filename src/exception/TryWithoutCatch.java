package exception;

public class TryWithoutCatch {

	public static void main(String[] args) {

		try {
			
			System.out.println("hello");
			
		} finally {
			
			System.out.println("finally");
		}
	}
}
