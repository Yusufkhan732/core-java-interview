package Practice;

import java.util.Scanner;

public class chllange {

	public static void main(String[] args) {

//		System.out.println("*");
//		System.out.println("* *");
//		System.out.println("* * *");
//		System.out.println("* * * *");
//		System.out.println("* * * * *");
//		System.out.println("* * * * * * ");
//		System.out.println("*\n* *\n* * *\n* * * *\n* * * * *");
//		System.out.println("* * * * *\n* * * *\n* * *\n * *\n*"); // reverse
//		System.out.println("       *\n     * *\n   * * * \n * * * *\n* * * * *");
//		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to Swapping station\n\n");
		System.out.println("Enter value of A:");
		int a = scanner.nextInt();
		System.out.println("Enter value of B:");
		int b = scanner.nextInt();

		int c = a;

		a = b;
		b = c;
		System.out.println("Swapping Done....");
		System.out.println("Value of A:" + a);
		System.out.println("value of B:" + b);
	}
}
