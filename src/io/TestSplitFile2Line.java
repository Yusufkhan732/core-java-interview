package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class TestSplitFile2Line {

	public static void main(String[] args) throws Exception {

		File file = new File("D:\\io\\SplitFile.txt");

		BufferedReader reader = new BufferedReader(new FileReader(file));

		int fileNo = 1;

		String line = reader.readLine();

		while (line != null) {

			BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\io\\Split" + fileNo + ".txt"));

			for (int i = 1; i <= 2; i++) {

				if (line == null) {
					break;
				}

				writer.write(line);
				writer.newLine();

				line = reader.readLine();
				System.out.println(line);

			}

			writer.close();

			System.out.println("Create file" + fileNo);
			fileNo++;

		}

		reader.close();

	}
}