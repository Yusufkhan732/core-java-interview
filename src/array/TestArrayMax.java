package array;

public class TestArrayMax {
	
		public static void main(String[] args) {
			
			int[] arr= {10,15,48,75,100,46,88};
			
			int max= 0;
					
			for (int i = 0; i < arr.length; i++) {
				
				if (arr[i]>max) {
					
					max=arr[i];
					
				}
				
			}
			
			System.out.println("Maximum " + max);
			
		}
}