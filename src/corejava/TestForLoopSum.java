package corejava;

public class TestForLoopSum {
		
		public static void main(String args[]) {
			
			int Sum = 0;
			
			for(int i=1; i<=10; i++) {
				
				System.out.println(i);
				
				Sum = Sum+i;
				
			}
			
			System.out.println("Sum = " + Sum);
		}
}