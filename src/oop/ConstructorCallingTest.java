package oop;

public class ConstructorCallingTest extends ConstructorCalling {

	public ConstructorCallingTest(String fName, String lName) {

		super(fName, lName);

	}

	public static void main(String[] args) {

		ConstructorCallingTest c = new ConstructorCallingTest("yusuf", "khan");

	}

}