package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsMethods {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

		// Launch the chrome browser
		WebDriver driver = new ChromeDriver();

		// navigate website
		driver.get("https://demowebshop.tricentis.com/");

		// To get the text of the element 1
		String text = driver.findElement(By.partialLinkText("Register")).getText();
		System.out.println("text: " + text);

		// To get the attribute value 2
		System.out.println("Attribute value: " + driver.findElement(By.id("small-searchterms")).getAttribute("type"));

		// To get css value 3
		System.out.println("Color: " + driver.findElement(By.partialLinkText("Shopping")).getCssValue("color"));

		//To click 14
		driver.findElement(By.partialLinkText("Log")).click();

		driver.findElement(By.id("Email")).sendKeys("nandanms@gmail.com");
		
		// isDisplayed 4
		System.out.println("is displayed:  " + driver.findElement(By.id("RememberMe")).isDisplayed());

		// isEnabled 5
		System.out.println("isEnabled: " + driver.findElement(By.id("RememberMe")).isEnabled());

		// isSelected 6
		System.out.println("is selected: " + driver.findElement(By.id("RememberMe")).isSelected());

		driver.findElement(By.id("RememberMe")).click();

		// isSelected 7
		System.out.println("is selected: " + driver.findElement(By.id("RememberMe")).isSelected());

		//To get the location the element 8
		System.out.println("Location of element: "+driver.findElement(By.id("RememberMe")).getLocation());
		
		//To get the size of the  9
		System.out.println("size of element: "+driver.findElement(By.id("RememberMe")).getSize());
		
		//To get the rectangle 10
		System.out.println("rect of the element : "+driver.findElement(By.id("RememberMe")).getRect());
		
		//To get the  11
		System.out.println("tag name= "+driver.findElement(By.id("RememberMe")).getTagName());
		
		Thread.sleep(2000);
		
		//To enter text 12
		driver.findElement(By.id("small-searchterms")).sendKeys("Laptop");
		
		//To click on submit button 13
		driver.findElement(By.id("small-searchterms")).submit();//type=submit
		
		
		
		Thread.sleep(2000);
		//driver.quit();
	}

}
