package application;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class Room {
	String bedType;
	int roomNumber, size;
	

	LinkedList<Booking> bookings = new LinkedList<>();

	Room(String bedType, int size, int roomNumber) {
		this.roomNumber = roomNumber;
		this.size = size;
		this.bedType = bedType;
	}

	public void addBooking(Date arrive, Date leave, String fname, String lname) {

	}

	public void cancelBooking(Date date) {
		for (int i = 0; i < bookings.size(); i++) {
			if (bookings.get(i).getDates().contains(date)) {
				bookings.remove(i);
			}
		}
	}

	public LinkedList<Booking> getBookings() {
		return bookings;
	}
	

	


}
