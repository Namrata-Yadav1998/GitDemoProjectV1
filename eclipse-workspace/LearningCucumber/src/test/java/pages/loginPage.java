package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	protected WebDriver driver;

private	By txt_username=By.name("username");
private	By txt_password=By.name("password");
private	By btn_login=By.xpath("//input[@type='submit']");
private	By btn_logout=By.xpath("//a[text()='Log Out']");
	
	public loginPage(WebDriver driver)
	{
		this.driver= driver;
	}
	public void enterUsername(String username)
	{
		driver.findElement(txt_username).sendKeys(username);
	}
	public void enterPassword(String password1) 
	{

		driver.findElement(txt_password).sendKeys(password1);	
	}

	public void enterLogin() 
	{

		driver.findElement(btn_login).click();	
	}
	public void checkLogout() 
	{

		driver.findElement(btn_logout).isDisplayed();	
	}
	//public void loginValidUser(String username, String password1) {
	//	driver.findElement(txt_username).sendKeys(username);	
	//	driver.findElement(txt_password).sendKeys(password1);
	//	driver.findElement(btn_login).click();	
	//}

}
