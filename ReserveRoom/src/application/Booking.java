package application;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Booking {
	final SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
	DateFormat dateFormat = DateFormat.getDateTimeInstance( DateFormat.DEFAULT,DateFormat.DEFAULT, locale);
	String fname, lname;
	ArrayList<Date> dates = new ArrayList<>();
	boolean checkIn, checkOut;
	
	
	
	public static String getNextDate(String  curDate) {
		  final SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		  Date date = null;
		try {
			date = format.parse(curDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		  final Calendar calendar = Calendar.getInstance();
		  calendar.setTime(date);
		  calendar.add(Calendar.DAY_OF_YEAR, 1);
		  return format.format(calendar.getTime()); 
		}
	
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

	Booking(Date startDate, Date leaveDate, String fname, String lname)
	{
		ArrayList<Date> dates = new ArrayList<>();
		dates.add(startDate);
		dates.add(leaveDate);
		while (startDate != leaveDate)
		{
			startDate = getNextDate(startDate);
		}
		
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
