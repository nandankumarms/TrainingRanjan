package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BooksPage {

	public BooksPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "products-orderby")
	private WebElement sortByDropDown;
	
	public void selctSortByOptionByIndex(int index) {
		Select select=new Select(sortByDropDown);
		select.selectByIndex(index);
	}

	public WebElement getSortByDropDown() {
		return sortByDropDown;
	}
}
