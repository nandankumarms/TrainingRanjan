package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\\\Java installables\\\\chromedriver-win64 (1)\\\\chromedriver-win64/chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demowebshop.tricentis.com/");
	
	driver.findElement(By.xpath("jhbhbjhjhvjhvhb")).click();
	
	
	
	}

}
