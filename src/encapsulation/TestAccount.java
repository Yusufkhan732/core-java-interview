package encapsulation;

public class TestAccount {

	public static void main(String[] args) {

		Account a = new Account();

		a.deposit(3000);
		a.Withdrwal(2000);
		a.payBill("222", 300);

	}

}