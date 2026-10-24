package string;


public class LongestParagraph {

	public static void main(String[] args) {

		String paragraph = "java is a Powerful Language Programming";

		String[] words = paragraph.split(" ");

		String longest = "";

		for (String word : words) {

			if (word.length() > longest.length()) {

				longest = word;

			}
		}
		System.out.println("longest " + longest);
	}

}
