package overloading;

public class TestPerson {

	public static void main(String[] args) {

		Person p = new Person();

		p.Login("yusufkhan@gmail.com");

		p.Login("yusufkhan@gmail.com", " pass22");

		p.Login("yusufkhan@gmail.com", " pass22", " yusuf");
	}
}
