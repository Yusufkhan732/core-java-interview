package string;

public class TestStingBuffer {

	public static void main(String[] args) {

		// By default Sting Buffer Capacity is 16;
		// 16 + 8(Pushpraj = 8 char) = 24;

		StringBuffer sb = new StringBuffer("Pushpraj");
		
		//Formula to calculate capacity = (old capacity * 2) + 2;

		System.out.println(sb.capacity()); //24 capacity

		sb.append("Singh Kachhaway");

		System.out.println(sb.capacity()); //24 capacity

	}
}