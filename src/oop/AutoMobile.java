package oop;

public class AutoMobile {

	private String colour;

	private int speed;

	private String make;

	public static final int No_Of_Gears = 6;

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void brake() {
		if (speed > 100) {
			System.out.println("Brake applied:");
		}
	}
	
	public void changeGear(int gear) {
		if (gear > 0 && gear <= No_Of_Gears) {
			System.out.println("Gear changed to: " + gear);
		} else {
			System.out.println("Invalid gear! Please select between 1 and " + No_Of_Gears);
		}
	}
	
	public void accelerate(int accelerateBy) {
		if (accelerateBy > 0) {
			speed += accelerateBy;
			System.out.println("Accelerating... Current speed: " + speed + " km/h");
		} else {
			System.out.println("Invalid acceleration value!");
		}
	}
}