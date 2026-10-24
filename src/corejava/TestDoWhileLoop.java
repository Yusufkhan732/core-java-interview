package corejava;

public class TestDoWhileLoop {
	
public static void main (String args[]){
		
		int i = 1;
		
		int Sum = 0;
		
		do {
			
			System.out.println(i);
			
			i++;
			
			Sum= Sum+i;
			
		}while(i<=10);
		
		System.out.println(Sum);
	}

}