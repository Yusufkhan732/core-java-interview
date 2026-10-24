package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCustomCalendar {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		String str = "21/07/2024";

		Date date = sdf.parse(str);

		Calendar cal = Calendar.getInstance();
		
		cal.setTime(date);

		cal.add(Calendar.DATE, 9);

		Date nextEvent = cal.getTime();

		System.out.println(sdf.format(nextEvent));

	}
}