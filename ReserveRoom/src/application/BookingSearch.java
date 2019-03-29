package application;

import java.util.ArrayList;
import java.util.Date;

public class BookingSearch {
	
	static ArrayList<Booking> searchName(String fname)
	{
		ArrayList<Booking>  foundBookings = new ArrayList<>();
		ArrayList<Room> rooms = Main.getRooms();
		for (int i = 0; i < rooms.size(); i++)
		{
			ArrayList<Booking> bookings = rooms.get(i).getBookings();
			for (int j = 0; j < bookings.size(); j++)
			{
				if (bookings.get(j).getFname() == fname)
				{
					foundBookings.add(bookings.get(j));
				}
			}
		}
		return foundBookings;
	}
	
	static ArrayList<Room> searchRoomDate(ArrayList<Date> dates)
	{
		return null;
	}

}
