package corejava;

public class TestData {
	
	public static void main(String[] args) {
		
		byte b = 127;

		short s = b;

		int i = s;

		long l = i;

		float f = l;

		double d = f;
		
		System.out.println(d);

		double v1 = 100.100;

		float v2 = (float) v1;

		long v3 = (long) v2;

		int v4 = (int) v3;

		short v5 = (short) v4;

		byte v6 = (byte) v5;
		
		System.out.println(v6);
	}
}