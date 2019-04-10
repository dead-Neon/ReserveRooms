import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import application.Booking;
import application.Room;

class BookingTest {
	Room r1 = new Room(2, 1);
	Room r2 = new Room(2, 0);
	Room r3 = new Room(0, 1);
	Room r4 = new Room(0, 2);
	Date d1 = new Date(1-1-2020);
	Date d2 = new Date(2-1-2020);
	Date d3 = new Date(3-1-2020);
	Date d4 = new Date(4-1-2020);
	Date d5 = new Date(1-2-2020);
	Date d6 = new Date(2-2-2020);
	Date d7 = new Date(3-2-2020);
	Date d8 = new Date(4-2-2020);

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		ArrayList<Date> b1 = new ArrayList<>();
		
		r1.addBooking(d1, d4, "John", "Marston");
		ArrayList<Date> b2 = new ArrayList<>();
		r1.addBooking(d2, d3, "Tony", "Blair");
		ArrayList<Date> b3 = new ArrayList<>();
		r1.addBooking(d4, d5, "Jimmy", "Monsoom");
		ArrayList<Date> b4 = new ArrayList<>();
		r1.addBooking(d3, d4 ,"Carson", "Cresly");
		ArrayList<Date> b5 = new ArrayList<>();
		r1.addBooking(d8, d5,"Bart", "Simpson");
		ArrayList<Date> b6 = new ArrayList<>();
		r1.addBooking(d5,d7 ,"Miranda", "Cosgrove");
		
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
