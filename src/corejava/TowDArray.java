package corejava;

public class TowDArray {

	public static void main(String[] args) {
		int i = 5;

		i = --i + i-- + --i + i--;
//            4 + 4   +   2 + 2 = 12
		System.out.println(i);

	}
}