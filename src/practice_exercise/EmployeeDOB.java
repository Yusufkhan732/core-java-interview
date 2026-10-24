package practice_exercise;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class EmployeeDOB {

	public static void main(String[] args) {
		
		String dob = "2001-12-08";
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
        LocalDate birthDate = LocalDate.parse(dob, formatter);
        
        LocalDate today = LocalDate.now();
		
        int age = Period.between(birthDate, today).getYears();
        
        System.out.println("Employee's Age: " + age + " years");
	}
}