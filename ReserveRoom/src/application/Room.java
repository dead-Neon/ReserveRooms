package application;

import java.util.ArrayList;
import java.util.Date;

public class Room {
	int size;

	ArrayList<Booking> bookings = new ArrayList<>();

	Room(int size) {
		this.size = size;
	}

	public void addBooking(ArrayList<Date> dates, String fname, String lname) {

		if (dates.get(0).compareTo(Main.getDate()) > 0) {
			Booking booking = new Booking(dates, fname, lname);
			bookings.add(booking);
		} else {
			System.out.println("Date has already passed.");
		}
	}

	public void cancelBooking(Date date) {
		for (int i = 0; i < bookings.size(); i++) {
			if (bookings.get(i).getDates().contains(date)) {
				bookings.remove(i);
			}
		}
	}

	public ArrayList<Booking> getBookings() {
		return bookings;
	}

}
