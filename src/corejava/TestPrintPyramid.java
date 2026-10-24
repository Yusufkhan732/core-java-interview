package corejava;

public class TestPrintPyramid {
	
	public static void main(String[] args) {
		
		int rows = 5;
		
		for (int i = 1; i <= rows; i++) {
			
			for (int j = 1; j <= rows-i; j++) {
				
				System.out.print(" ");
				
			}
				
				for (int k = 1; k <= i; k++) {
					
					System.out.print(k + " ");
					
				}
				
				System.out.println();
				
			}
		
			for (int i = rows - 1; i >= 1; i--) {
			
				for (int j = rows; j > i; j--) {
				System.out.print(" ");
			}
			
					for (int j = 1; j <= i; j++) {
						System.out.print(j + " ");
			}
			
			System.out.println();
		}
			
		}
	}