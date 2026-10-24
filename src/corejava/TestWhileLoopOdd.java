package corejava;

public class TestWhileLoopOdd {
	
public static void main (String args[]){
		
		int i = 1;
		
		int Sum = 0;
		
		while (i<=10) {
			
			System.out.println(i);
			
			i= i+2;
			
			Sum = Sum+i;
		}
		
		System.out.println(Sum);
		
	}
}