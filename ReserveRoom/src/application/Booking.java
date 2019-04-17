package application;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Booking {
	String bookedName;
	Date arrive, leave;
	ArrayList<Date> dates = new ArrayList<>();
	Calendar cal = Calendar.getInstance();
	boolean checkedIn, checkedOut;
	
	public boolean isCheckedIn() {
		
		return checkedIn;
	}

	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}

	public boolean isCheckedOut() {
		return checkedOut;
	}

	public void setCheckedOut(boolean checkedOut) {
		this.checkedOut = checkedOut;
	}

	public void setDates(ArrayList<Date> dates) {
		this.dates = dates;
	}

	Booking(Date startDate, Date leaveDate, String fname, String lname)
	{
		ArrayList<Date> dates = new ArrayList<>();
		cal.setTime(startDate);
		Date newDate = startDate;
		while (newDate != leaveDate)
		{
			dates.add(newDate);
			cal.add(Calendar.DATE, 1 );
			newDate = cal.getTime();
		}
	}
	
	public ArrayList<Date> getDates()
	{
		return dates;
	}

	public String getBookedName() {
		return bookedName;
	}
}

