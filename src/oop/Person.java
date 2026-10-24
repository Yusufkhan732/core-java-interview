package oop;

public class Person {

	private String name;

	private int Dob;

	private String address;

	public static final int Avg_Age = 24;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setDob(int Dob) {
		this.Dob = Dob;
	}

	public int getDob() {
		return Dob;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public int getAge() {
		return Avg_Age;
	}
}