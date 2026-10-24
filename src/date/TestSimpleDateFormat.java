package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSimpleDateFormat {

	public static void main(String[] args) {   //Date to sting program

		Date d = new Date();

		System.out.println(d);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		String str = sdf.format(d);

		System.out.println(str);

	}
}