package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {

		System.out.println(System.getProperty("user.dir"));

		try {

			FileReader reader = new FileReader("exception.txt");
			// reader.read() file se 1 character read karta hai aur uski numeric value data
			// me rakhta hai.
			int data;
			// int data yahan file se read hone wale character ki numeric value temporarily
			// store karta hai.

			while ((data = reader.read()) != -1) {

				System.out.println((char) data);

			}

		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}