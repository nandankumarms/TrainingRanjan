package TestNGBasics;

import org.testng.annotations.Test;

public class AddToCart {

	@Test(groups = "FT")
	public void addToCart() {
		System.out.println("Add to cart");
	}
}
