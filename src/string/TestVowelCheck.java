package string;

public class TestVowelCheck {

	public static void main(String[] args) {

		char[] Vowels = { 'a', 'e', 'i', 'o', 'u' };

		String name = "Pushpraj Singh Kachhaway";

		int count = 0;

		for (int i = 0; i < Vowels.length; i++) {

			for (int j = 0; j < name.length(); j++) {

				if (Vowels[i] == name.charAt(j)) {

					count++;

				}

			}

			if (count > 0) {

				System.out.println(Vowels[i] + " count " + count);

			}
			
			count = 0;

		}

	}

}