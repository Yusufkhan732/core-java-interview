package overloading;

public class Person {

	public void Login(String login) {

		System.out.println(login);

	}

	public void Login(String login, String password) {

		System.out.println(login + password);

	}

	public void Login(String login, String password, String name) {

		System.out.println(login + password + name);

	}
}
