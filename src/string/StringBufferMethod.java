package string;

public class StringBufferMethod {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Yusuf");

		//sb.append(" Khan");
//		sb.insert(5, "123");
//		sb.delete(5, 8);
//		sb.reverse();
//		sb.setCharAt(0, 'A');
		sb.capacity();
		
		System.out.println(sb.replace(0, 5, "Akbar"));
	}

}
