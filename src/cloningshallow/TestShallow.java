package cloningshallow;

public class TestShallow {

	public static void main(String[] args) throws CloneNotSupportedException {

		// shallow cloning mein shallow.address aur shallow2.address ek hi Address
		// object   Shallow Cloning: Outer object alag, andar ka referenced object same.
		// ko point karte hain.
		Shallow shallow = new Shallow();
		shallow.balance = 20;

		shallow.address = new Address();

		shallow.address.city = "indore";

		Shallow shallow2 = (Shallow) shallow.clone();

		shallow2.balance = 300;

		shallow2.address.city = "Bhopal";

		System.out.println(shallow.balance);
		System.out.println(shallow2.balance);
		System.out.println(shallow.address.city);
		System.out.println(shallow2.address.city);

	}

}
