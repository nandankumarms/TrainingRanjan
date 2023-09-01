package TestNGBasics;

import org.testng.annotations.Test;

public class PlaceOrder {

	@Test(groups = "IT")
	public void plcaceOrder() {
		System.out.println("Order");
	}
}
