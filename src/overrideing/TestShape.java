package overrideing;

public class TestShape {

	public static void main(String[] args) {

		Rectangle r = new Rectangle();

		r.setLength(10);
		r.setWidth(20);

		System.out.println(r.area());

		Shape r1 = new Rectangle();

		System.out.println(r1.area());

		Rectangle r2 = (Rectangle) r1;

		r2.setLength(12);
		r2.setWidth(21);

		System.out.println(r2.area());
	}
}
