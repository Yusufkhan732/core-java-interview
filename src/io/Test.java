package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Externalizable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Test implements Externalizable {

	public transient int id;

	public String name;

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public Test(int id, String name) {

		this.id = id;
		this.name = name;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {

		out.write(id);
		out.writeObject(name);

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

		id = in.readInt();
		name = (String) in.readObject();

	}

	@Override
	public String toString() {
		return id + " " + name;

	}

}