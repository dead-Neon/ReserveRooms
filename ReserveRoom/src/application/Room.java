package application;

import java.util.ArrayList;
import java.util.Date;

public class Room {
	int size;
	boolean cleaned;

	
	Date date = new Date();
	
	
	ArrayList<Booking> bookings = new ArrayList<>();

	public Room(int singleBeds, int doubleBeds) {
		this.size = size;
		cleaned = true;
	}

	public void addBooking(Date enter, Date leave, String fname, String lname) {
		boolean available = true;
		ArrayList<Date> dates = new ArrayList<>();
		if (dates.get(0).compareTo(Main.getDate()) > 0) {
			for (int i = 0; i < bookings.size();i ++)
			{
				for (int j = 0; j < bookings.get(i).getDates().size(); j ++)
				{
					if (bookings.get(i).getDates().contains(dates.get(j)))
					{
						available = false;
					}
				}
			}
			if (available)
			{
				Booking booking = new Booking(dates, fname, lname);
				bookings.add(booking);
			}
			else
			{
				System.out.println("Room taken for these dates");
			}
		} 
		else {
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
	
	public void setCleaned(boolean cleaned)
	{
		this.cleaned = cleaned;
	}
	
	public void setSize(int size)
	{
		this.size = size;
	}
	
	public void viewBookings()
	{
		for (int i = 0; i < bookings.size(); i ++)
		{
			for (int j = 0; j < bookings.get(i).getDates().size(); j ++)
			{
				System.out.println("DATE TAKEN: " + bookings.get(i).getDates().get(j));
			}
		}	
	}

}
