package io.serilization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestAccount {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Account a = new Account("Neeraj", 10000);

		System.out.println("Before Serilization = " + a);

		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:\\h.txt"));

		out.writeObject(a);

		System.out.println(out);

		out.close();

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\h.txt"));

		System.out.println(in.readObject());

		in.close();

	}

}
