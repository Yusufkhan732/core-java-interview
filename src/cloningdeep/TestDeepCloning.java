package cloningdeep;

public class TestDeepCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
//Deep Cloning: Outer object alag + andar ke referenced objects bhi alag.
		Deep d = new Deep();

		d.balance = 10;

		d.address = new Address();
		d.address.city = "delhi";

		Deep dc = (Deep) d.clone();

		dc.balance = 200;

		dc.address.city = "bhopal";

		System.out.println(d.balance);
		System.out.println(dc.balance);

		System.out.println(d.address.city);
		System.out.println(dc.address.city);

	}

}
