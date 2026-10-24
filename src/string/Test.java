package string;

public class Test {

	public static void main(String[] args) {

		String name = "yusuf kahn eiou";

		char[] ch = name.toCharArray();

		for (char a = 'a'; a < 'z'; a++) {
			int count = 0;

			for (int i = 0; i < ch.length; i++) {
				if (ch[i] != 'a' && ch[i] != 'e' && ch[i] != 'i' && ch[i] != 'o' && ch[i] != 'u') {

					if (a == ch[i]) {
						count++;

					}
				}

			}
			if (count > 0) {
				System.out.println(a + ",count= " + count);

			}
		}

	}
}
