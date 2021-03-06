package application;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class RoomSystem {
	
	static LinkedList<Booking> searchRooms(String name)
	{
		LinkedList<Booking>  foundBookings = new LinkedList<>();
		ArrayList<Room> rooms = Main.getRooms();
		for (int i = 0; i < rooms.size(); i++)
		{
			LinkedList<Booking> bookings = rooms.get(i).getBookings();
			for (int j = 0; j < bookings.size(); j++)
			{
				if (bookings.get(j).getBookedName() == name)
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
