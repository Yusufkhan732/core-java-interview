package corejava;

public class TestIncDecOperator {

		public static void main(String[] args) {

			int i = 1;
			
			int e = 1;
			
			int d = 1;

			int a = i++ + i + ++i + --i + ++i + --i;
			    //  1   + 2 +   3 +   2 +   3 +   2 = 13
			
			int b = e++ + e++ + e++ + e++ + e++ + ++e + --e;
			    //  1   + 2   + 3   + 4   + 5   +   6 +   5 =   26

			int c = --d + --d + --d + --d + --d + ++d + --d;
			    //    0 +  -1 +  -2 +  -3 +  -4 +  -3 +  -4 = -17

			System.out.println("a: " + a);
			
			System.out.println("b: " + b);
			
			System.out.println("c: " + c);
	}
}