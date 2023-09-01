package TestNGBasics;

import org.testng.annotations.Test;

public class Login {
	
	@Test(groups = "IT")
	public void login() {
		System.out.println("Login");
	}

}
