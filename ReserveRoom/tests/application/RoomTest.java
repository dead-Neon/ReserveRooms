package application;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Calendar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RoomTest {

	Room r1;
	Booking b1;
	Calendar cal;

	@BeforeEach
	void setUp() throws Exception {
		r1 = new Room("Queen", 2, 10);
		cal = Calendar.getInstance();
	}

	@Test
	void testAddBooking() {
		b1 = new Booking(cal.getTime(), 2, "James" + "Parker");
		r1.addBooking(b1);
		assertTrue(r1.getBookings().contains(b1));
	}
	
	@Test
	void testCancelBooking() {
		b1 = new Booking(cal.getTime(), 2, "James" + "Parker");
		r1.addBooking(b1);
		r1.cancelBooking(cal.getTime());
		assertFalse(r1.getBookings().contains(b1));
	}
	
	

}
