package corejava;

public class Busnisseman implements Richman, Socialworker {

	@Override
	public void earnMoney() {
		System.out.println("Earn money");

	}

	@Override
	public void donation() {
		System.out.println("donation");

	}

	@Override
	public void party() {
		System.out.println("party");
	}

	@Override
	public void helpToOther() {
		System.out.println("help to other");

	}

}
