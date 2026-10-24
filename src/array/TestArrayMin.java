package array;

public class TestArrayMin {
	
	public static void main(String[] args) {
		
			int[] arr= {15,48,75,10,46,88,100};
		
			int min= arr[0];
				
			for (int i = 0; i < arr.length; i++) {
			
				if (arr[i]<min) {
				
					min=arr[i];
				
				}
			
			}
		
			System.out.println("Minimum " + min);
		
	}
}