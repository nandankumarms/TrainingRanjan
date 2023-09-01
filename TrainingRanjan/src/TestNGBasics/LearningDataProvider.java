package TestNGBasics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearningDataProvider {
	
	@DataProvider(name = "loginData", parallel = true)
	public String[][] loginData() throws EncryptedDocumentException, IOException{
        FileInputStream fis=new FileInputStream("./TestData/ReadData.xlsx");
		
		Workbook workbook=WorkbookFactory.create(fis);
		
		Sheet sheet=workbook.getSheet("Login");
		
		int rowCount=sheet.getPhysicalNumberOfRows();
	    int cellCount=sheet.getRow(0).getPhysicalNumberOfCells();
		
	    String[][] data=new String[rowCount-1][cellCount];
	    
	    for(int j=1;j<rowCount;j++) {
	    for(int i=0;i<cellCount;i++) {
	    	
	    	data[j-1][i]=sheet.getRow(j).getCell(i).toString();
	    	
	    }
	    
	   
 }
	    return data;
	
	}

	@Test(dataProvider = "loginData")
	public void login(String email, String password) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demowebshop.tricentis.com/login");
		
		driver.findElement(By.id("Email")).sendKeys(email);
		
		driver.findElement(By.id("Password")).sendKeys(password);
		
		Thread.sleep(1000);
		driver.quit();
	}


}
