package practice_exercise;

import java.util.Random;

public class RandomNumGenerator {
	
	public static void main(String[] args) {
		
		Random R = new Random();
		
		R.nextInt(100);
		
		for (int i = 1; i <= 3; i++) {
			
			System.out.println(R.nextInt(100) + 1);			
		}
	}
}