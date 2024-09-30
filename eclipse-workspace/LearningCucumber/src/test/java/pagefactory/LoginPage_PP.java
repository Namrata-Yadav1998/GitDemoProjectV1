package pagefactory;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage_PP {

	@FindBy(name="username")
	@CacheLookup
	WebElement txt_username;
	
	@FindBy(name="password")
	WebElement txt_password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement btn_login;
	
	WebDriver driver;
	public LoginPage_PP(WebDriver driver) {
		this.driver=driver;
	
		AjaxElementLocatorFactory factory=new AjaxElementLocatorFactory(driver, 30);
		PageFactory.initElements(factory, this);
	}
	
	
	public void enterUsername(String username) {
		txt_username.sendKeys(username);	
	}
	public void enterPassword(String password1) {
		txt_password.sendKeys(password1);	
	}
	public void clickOnLogin() {
		btn_login.click();	
	}
}
