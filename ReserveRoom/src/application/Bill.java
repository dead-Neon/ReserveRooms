package application;

public class Bill {
	double outstandingBalance, paidBalance;
	
	Bill(int roomCost, int days){
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
	
	public double getBill()
	{
		return outstandingBalance;
	}
	
	public void makePayment(double payment) {
		//Access pay servers
		outstandingBalance = outstandingBalance - payment;
	}
	

}
