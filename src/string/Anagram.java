package string;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {

		String a = "Yusuf";
		String b = "YuSuF";

		String aa = a.toLowerCase();
		String bb = b.toLowerCase();

		char[] c = aa.toCharArray();
		char[] d = bb.toCharArray();

		Arrays.sort(c);
		Arrays.sort(d);

		if (Arrays.equals(c, d)) {
			System.out.println(aa + " and " + bb + " are anagrame ");
		} else {
			System.out.println("not");
		}
	}

}
