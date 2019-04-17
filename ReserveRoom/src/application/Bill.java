package application;

public class Bill {
	double outstandingBalance, paidBalance;
	
	Bill(double roomCost, int days){
		outstandingBalance = roomCost*days;
	}
	
	public void addToBill(double cost){
		outstandingBalance = outstandingBalance + cost;
	}
	
	public void refundPaid() {
		//Access payment servers
		paidBalance = 0;
		outstandingBalance = 0;
	}
	
	public boolean verifyPayment()
	{
		//Access payment servers
		return true;
	}
	
	public double getOutstanding()
	{
		return outstandingBalance;
	}
	
	public double getPaidBalance()
	{
		return paidBalance;
	}
	
	public void makePayment(double payment) {
		if (payment > outstandingBalance)
		{
			payment = outstandingBalance;
		}
		//Access pay servers
		outstandingBalance = outstandingBalance - payment;
	}
	

}
