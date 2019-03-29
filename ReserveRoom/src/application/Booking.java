package application;

import java.util.Date;

public class Booking {
	
	String fname, lname;
	Date date;
	
	Booking(Date date, String fname, String lname)
	{
		this.date = date;
		this.fname = fname;
		this.lname = lname;
	}

}
