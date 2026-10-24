package date;

import java.util.Calendar;
import java.util.Date;

public class TestCalendar {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();

		for (int i = 1; i <= 12; i++) {

			cal.add(Calendar.DATE, 17);

			Date nextEvent = cal.getTime();

			System.out.println(nextEvent);

		}

	}
}