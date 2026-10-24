package practice_exercise;

public class IntegerArray {

	public static void main(String[] args) {
		
		int [] A = {10,15,48,75,46,88,100};
		
		int [] B = {10,15,48,75,88,100};
		
		 boolean found;
		 
		 for (int i = 0; i < A.length; i++) {
	            found = false; // Reset flag for each element in A
	            
	            for (int j = 0; j < B.length; j++) {
	                if (A[i] == B[j]) {
	                    found = true; // Element found in B
	                    break; // No need to check further
	                }
	            }
	            
	            if (!found) {
	                System.out.println("Missing element: " + A[i]);
	            }
	}
}
}