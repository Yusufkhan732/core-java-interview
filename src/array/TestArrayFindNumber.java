package array;

public class TestArrayFindNumber {
	
public static void main(String[] args) {
		
		int[] arr = {100,10,11,15,28,88};
		
		int num = 22;
		
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] == num ) {
				
				count++;
				
			}
		}
		
		if (count==0) {
			
			System.out.println("Number does not exist");
			
		}else {
			
			System.out.println("Number exist");
			
		}
		
	}
}