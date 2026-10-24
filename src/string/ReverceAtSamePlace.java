package string;

public class ReverceAtSamePlace {

	public static void main(String[] args) {

		String s = "yusuf,knah";

		String[] arr = s.split(" ");

		for (int i = 0; i < arr.length; i++) {

		

			for (int j = arr[i].length()-1; j >= 0; j--) {

				System.out.print(arr[i].charAt(j));

			}

		}
	}

}