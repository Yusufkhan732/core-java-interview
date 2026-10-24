package array;

public class TsetNoteCount {

	public static void main(String[] args) {
		
		int Amount= 21941;
		
		int[] Notes = {500,200,100,50,20,10,5,2,1};
		
		int count = 0;
		
		for (int i = 0; i < Notes.length; i++) {
			
			count = Amount / Notes[i];
			
			if (count > 0 ) {
				
				System.out.println(Notes[i] + " = " + count);
				
			}
			
			Amount = Amount % Notes[i];
			
		}
		
	}
}