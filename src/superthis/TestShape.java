package superthis;

public class TestShape {
	
	public static void main(String[] args) {

		Rectangle r = new Rectangle(10, 20, "red", 50); // calling the 4 parameter constructor
		
		System.out.println("length: " + r.getLength());
		System.out.println("width: " + r.getWidth());
		System.out.println("color: " + r.getColor());
		System.out.println("borderwidth: " + r.getBorderWidth());

	}
}