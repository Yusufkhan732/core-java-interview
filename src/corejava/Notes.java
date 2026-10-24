package corejava;

public class Notes {

	public static void main(String[] args) {

		int notes[] = { 500, 200, 10, 1 };

		int count = 0;

		int money = 5211;

		for (int note : notes) {
			
			count = money / note;

			money = money % note;

			System.out.println(note + " " + count);
		}
	}
}
