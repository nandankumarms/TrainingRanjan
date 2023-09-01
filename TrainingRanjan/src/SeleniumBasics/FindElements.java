package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElements(By.xpath("//ul[@class='poll-options']/li/input"));
		
		List<WebElement> elements = driver.findElements(By.xpath("//ul[@class='poll-options']/li/input"));
		System.out.println(elements.size());
		
		for(int i=0;i<elements.size();i++) {
			elements.get(i).click()	;
			Thread.sleep(2000);
		}
	}
}
