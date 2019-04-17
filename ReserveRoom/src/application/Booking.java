package application;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Booking {
	String bookedName;
	Date arrive;
	int days;
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

	Booking(Date arrive, int days, String bookedName)
	{
		this.days = days;
		this.arrive = arrive;
		this.bookedName = bookedName;
		dates = new ArrayList<>();
		cal.setTime(arrive);
		for (int i = 0; i < days; i ++)
		{
			dates.add(cal.getTime());
			cal.add(Calendar.DATE, 1 );
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

