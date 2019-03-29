package application;

import java.util.ArrayList;
import java.util.Date;


public class Room {
	ArrayList<Booking> bookings = new ArrayList<>();
	
	public void addBooking(Date date)
	{
		if (date.compareTo(Main.getDate()) > 0)
		{
			Booking booking = new Booking(date, new String("fname"), new String ("lname") );
			bookings.add(booking);
		}
		else
		{
			System.out.println("Date  has already passed.");
		}
	}
	
	public void cancelBooking(Date date)
	{
		
	}

}
