package io.serilization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee implements Externalizable {

	public transient int id;

	public String name;

	public Employee() {

	}

	public Employee(int id, String name) {

		this.id = id;
		this.name = name;

	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(id);
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
