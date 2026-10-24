package corejava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	public static void main(String[] args) throws ParseException {

		Date d = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println(sdf.format(d));
	}
}