package application;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookingTest {
	Booking b1;
	Date arrive;
	Calendar cal;
	
	@BeforeEach
	void setUp() throws Exception {
		cal = Calendar.getInstance();
		cal.set(2019, 2, 10);
		arrive = cal.getTime();
		b1 = new Booking(arrive, 5, "John Doe");
	}

	@Test
	void testBookedDates() {
		LinkedList<Date> dates = new LinkedList<>();
		cal.setTime(arrive);
		dates.add(arrive);
		cal.add(Calendar.DATE, 1 );
		dates.add(cal.getTime());
		cal.add(Calendar.DATE, 1 );
		dates.add(cal.getTime());
		cal.add(Calendar.DATE, 1 );
		dates.add(cal.getTime());
		cal.add(Calendar.DATE, 1 );
		dates.add(cal.getTime());
		
		assertEquals(dates, b1.getDates());
	}
	
	@Test
	void testCheckIn() {
		b1.setCheckedIn(true);
		assertEquals(true, b1.isCheckedIn());
	}

	@Test
	void testCheckOut() {
		b1.setCheckedOut(true);
		assertEquals(true, b1.isCheckedOut());
	}
}
