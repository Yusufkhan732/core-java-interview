package oop;

public class TestAutoMobile {

	public static void main(String[] args) {

		AutoMobile car = new AutoMobile();

		// Setting values
		car.setColour("Red");
		car.setMake("Tesla");
		car.setSpeed(0); // Initial speed

		// Displaying initial state
		System.out.println("Automobile Details:");
		System.out.println("Make: " + car.getMake());
		System.out.println("Color: " + car.getColour());
		System.out.println("Speed: " + car.getSpeed() + " km/h");

		// Accelerating
		System.out.println("\nTesting Acceleration...");
		car.accelerate(30);
		car.accelerate(50);
		car.accelerate(-10); // Invalid acceleration test

		// Changing gears
		System.out.println("\nChanging Gear...");
		car.changeGear(2);
		car.changeGear(4);
		car.changeGear(7); // Invalid gear test

		// Applying brake
		System.out.println("\nApplying Brake...");
		car.brake();
		System.out.println("Current Speed after Brake: " + car.getSpeed() + " km/h");

		// Final State
		System.out.println("\nFinal Automobile Status:");
		System.out.println("Make: " + car.getMake());
		System.out.println("Color: " + car.getColour());
		System.out.println("Speed: " + car.getSpeed() + " km/h");
	}
}