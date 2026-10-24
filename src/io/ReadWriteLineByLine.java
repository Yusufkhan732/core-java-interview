package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteLineByLine {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new FileReader("D:\\io\\keyboard.txt"));

		BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\io\\output.txt"));
		String line = reader.readLine();

		while (line != null) {
			System.out.println(line);

			writer.write(line);
			writer.newLine();

			line = reader.readLine();

		}

		reader.close();
		writer.close();
	}

}