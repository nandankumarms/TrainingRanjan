package TestNGBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNgPracticeClass {

	@Test()
	public void register() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(1000);
		
		driver.quit();
	}
	
	@Test(enabled=true)
	public void login() {
		System.out.println("Login");
	}
		
	@Test()
	public void addToCart() {
		System.out.println("Add to cart");
	}
	
	
	
}
