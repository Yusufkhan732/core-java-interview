package practice_exercise;

public class AvgEvenOdd {
	
	public static void main(String[] args) {
		
		int sum = 0;
		
		int even = 0;
		
		int odd = 0;
		
		int count = 0;
		
		for (int i = 1; i <= 100; i++) {
			
			if (i % 2 == 0) {
				
				even += i;
				
				count++;
			}else {
				
				odd += i;
				
				count++;
			}
		}
		
		System.out.println(even);
		
		System.out.println(odd);
		
		sum = (even + odd)/2;
		
		System.out.println(sum);
	}
}