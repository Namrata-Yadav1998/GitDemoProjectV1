package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PP {
	
	@FindBy(xpath="//a[text()='Log Out']")
	WebElement btn_logout;
	
	WebDriver driver;
	public HomePage_PP(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		public void checkLogoutIsDisplayed() {
	btn_logout.isDisplayed();
}
}
