package corejava;

public class TestWhileLoopSum {
	
public static void main(String args[]) {
		
		int i =1;
		
		int Sum = 0;
		
		 while (i<=10) {
			 
			 System.out.println(i);
			 
			 Sum = Sum+i;
			 
			 i++;
		 }
		 
		 System.out.println("Sum = " + Sum);
	}
}