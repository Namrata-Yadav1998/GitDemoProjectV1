//package demoblazePages;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
//public class demoblazeclass {
//	
//	protected WebDriver driver;
//
//	private	By db_username=By.xpath("//*[@id='sign-username']");
//	private	By db_password=By.xpath("//*[@id='sign-password']");
//	private	By db_SignUp=By.xpath("//button[text()='Sign up']");
//	private	By hm_SignUp=By.id("signin2");
//		
//		public demoblazeclass(WebDriver driver)
//		{
//			this.driver= driver;
//		}
//		public void enterUsernamedb(String dbusername)
//		{
//	
//			driver.findElement(db_username).sendKeys(dbusername);
//		}
//		public void enterPassworddb(String dbpassword) 
//		{
//
//			driver.findElement(db_password).sendKeys(dbpassword);	
//		}
//
//		public void enterSignUpdb() 
//		{
//
//			driver.findElement(db_SignUp).click();	
//		}
//		public void home_SignUp() 
//		{
//
//			driver.findElement(hm_SignUp).click();	
//		}
//		//public void loginValidUser(String username, String password1) {
//		//	driver.findElement(txt_username).sendKeys(username);	
//		//	driver.findElement(txt_password).sendKeys(password1);
//		//	driver.findElement(btn_login).click();	
//		//}
//
//	}
//
//
