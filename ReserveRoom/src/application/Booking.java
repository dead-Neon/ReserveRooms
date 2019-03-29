package application;

import java.util.ArrayList;
import java.util.Date;

public class Booking {
	
	String fname, lname;
	ArrayList<Date> dates = new ArrayList<>();
	
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
