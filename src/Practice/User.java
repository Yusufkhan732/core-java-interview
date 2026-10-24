package Practice;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {

		// Scanner scanner = new Scanner(System.in);
//		System.out.print("please inter your name:");
//
//		String name = scanner.nextLine();
//		System.out.println("Good Morning :" + name);
//
//		System.out.println(name +", also tell me your age ");
//		int age = scanner.nextInt();
//		System.out.println("your age is:" + age);

//		System.out.println("Please inter your name:");
//
//		String name = scanner.nextLine();
//		System.out.println("Welcome:" + name +" Kg Coding");
//		System.out.println(name + ",Also tell me your age");
//		int age = scanner.nextInt();
//		System.out.println("your age is:" + age);

		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to your calculation");
		System.out.println("Please inter first number");
		int firstnum = input.nextInt();
		System.out.println("Now , Please inter second number");
		int second = input.nextInt();
		int sum = firstnum + second;
		System.out.println("Sum of numbers:" + sum);

	}

}
