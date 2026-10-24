package exception;

public class TestClassNotFound {

	public static void main(String[] args) {

		try {

			Class.forName("exception.TestArithicException");

			System.out.println("class found");
		} catch (ClassNotFoundException e) {

			System.out.println("class not found"+e);

		}

	}
}
