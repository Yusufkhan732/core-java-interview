package interfac;

public class Businessman implements Richman, SocialWorker {

	@Override
	public void helpToOthers() {

		System.out.println("helpto other");

	}

	@Override
	public void earnMoney() {
		System.out.println("earn money");
	}

	@Override
	public void party() {
		System.out.println("Party");
	}

	@Override
	public void donation() {
		System.out.println("donation");
	}
}