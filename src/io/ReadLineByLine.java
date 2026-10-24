package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadLineByLine {
	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String line = reader.readLine();

		while (line != null) {
			System.out.println(line);
			line = reader.readLine();
		}
		reader.close();

	}
}