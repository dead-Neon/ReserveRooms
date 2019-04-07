package application;

import java.util.ArrayList;
import java.util.Date;

public class Booking {
	
	String fname, lname;
	ArrayList<Date> dates = new ArrayList<>();
	boolean checkIn, checkOut;
	
	public boolean isCheckIn() {
		return checkIn;
	}

	public void setCheckIn(boolean checkIn) {
		this.checkIn = checkIn;
	}

	public boolean isCheckOut() {
		return checkOut;
	}

	public void setCheckOut(boolean checkOut) {
		this.checkOut = checkOut;
	}

	public void setDates(ArrayList<Date> dates) {
		this.dates = dates;
	}

	Booking(ArrayList<Date> dates, String fname, String lname)
	{
		this.dates = dates;
		this.fname = fname;
		this.lname = lname;
	}
	
	public ArrayList<Date> getDates()
	{
		return dates;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}
	

}
