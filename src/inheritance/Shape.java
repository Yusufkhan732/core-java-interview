package inheritance;

public class Shape {

	private String color;

	private String name;

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void area() {
		System.out.println("Shape area method");
	}
}