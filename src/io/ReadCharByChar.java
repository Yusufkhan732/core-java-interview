package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadCharByChar {

	public static void main(String[] args) throws IOException {

		FileReader file = new FileReader("D:\\h.txt");

		FileWriter filer = new FileWriter("D:\\Y.txt");

		int ch = file.read();

		while (ch != -1) {

			System.out.println((char) ch);

			filer.write(ch);

			ch = file.read();
		}

		filer.close();
		file.close();

		System.out.println("File copied successfully.");

	}

}
