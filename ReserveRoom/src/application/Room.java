package application;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class Room {
	int singleBed, doubleBed;
	boolean cleaned;

	LinkedList<Booking> bookings = new LinkedList<>();

	Room(int singleBed, int doubleBed) {
		this.singleBed = singleBed;
		this.doubleBed = doubleBed;
		cleaned = true;
	}

	public void addBooking(ArrayList<Date> dates, String fname, String lname) {
		boolean available = true;
		
		if (dates.get(0).compareTo(Main.getDate()) > 0) {
			for (int i = 0; i < bookings.size();i ++)
			{
				for (int j = 0; j < bookings.get(i).getDates().size(); j ++)
				{
					if (bookings.get(i).getDates().contains(dates.get(j)))
					{
						available = false;
						break;
					}
				}
				if (available)
				{
					break;
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

	public LinkedList<Booking> getBookings() {
		return bookings;
	}
	
	public void setCleaned(boolean cleaned)
	{
		this.cleaned = cleaned;
	}
	
	public void viewBookings()
	{
		for (int i = 0; i < bookings.size(); i ++)
		{
			for (int j = 0; j < bookings.get(i).getDates().size(); j ++)
			{
				System.out.println("Name: " +  bookings.get(i).getFname() + " " + bookings.get(i).getLname() + " DATE TAKEN: " + bookings.get(i).getDates().get(j));
			}
		}	
	}
}
