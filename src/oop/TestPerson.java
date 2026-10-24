package oop;

public class TestPerson {
	
	public static void main(String[] args) {
		
		Person p = new Person();
		
		p.setName("Pushpraj");
		
		p.setDob(24);
		
		p.setAddress("Indore");
		
		System.out.println(p.getName());
		
		System.out.println(p.getDob());
		
		System.out.println(p.getAddress());
		
	}
}