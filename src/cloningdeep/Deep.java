package cloningdeep;

public class Deep implements Cloneable {

	public int balance;
	public Address address;

	@Override
	protected Object clone() throws CloneNotSupportedException {

		Deep d = (Deep) super.clone();

		d.address = (Address) address.clone();
		return d;
	}
}