package application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BillTest {
	
	Bill b1;
	Bill b2;
	Bill b3;
	

	@BeforeEach
	void setUp() throws Exception {
		b1 = new Bill(50, 2);
		b2 = new Bill(50, 4);
		b3 = new Bill(25, 4);
	}

	@Test
	void testGetBalance() {
		assertEquals(b2.getOutstanding(), 200);
	}
	
	@Test
	void testOverPay() {
		b3.makePayment(200); 
		assertEquals(b3.getOutstanding(), 0);
	}
	
	@Test
	void testRefund() {
		b3.makePayment(200); 
		b3.refundPaid();
		assertEquals(b3.getPaidBalance(), 0);
	}
	
	@Test
	void testIncreaseBill() {
		b3.addToBill(200); 
		assertEquals(b3.getOutstanding(), 300);
	}
	

}
