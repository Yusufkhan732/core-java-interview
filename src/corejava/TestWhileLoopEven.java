package corejava;

public class TestWhileLoopEven {
	
	public static void main (String args[]){
		
		int i = 2;
		
		int Sum = 0;
		
		while (i<=10) {
			
			System.out.println(i);
			
			i= i+2;
			
			Sum = Sum+i;
		}
		
		System.out.println(Sum);
	}
}