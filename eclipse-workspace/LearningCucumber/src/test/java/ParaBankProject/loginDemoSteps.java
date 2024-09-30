//package ParaBankProject;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class loginDemoSteps {
//	
//	 WebDriver driver=null;
//	 
//	@Given("Browser is open1")
//	public void browser_is_open1() {
//System.out.println("Inside Step - Browser is open1");
//		
//		String ProjectPath =System.getProperty("user.dir");
//		System.out.println("Project path is: " +ProjectPath);
//		
//		System.setProperty("Webdriver.chrome.driver ",ProjectPath+"/src/test/resources/drivers/chromedriver-win64/chromedriver.exe");
//
//		
//	driver = new ChromeDriver();
//	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//	driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);   
//	}
//
//	@And("User is on login Page1")
//	public void user_is_on_login_page1() {
//		System.out.println("Inside Step - User is on login Page1");
//		driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
//	    }
//
//	@When("^User enter (.*) and (.*)$")
//	public void user_enter_username_and_password1(String username, String password1)throws InterruptedException {
//		System.out.println("Inside Step - User enter username and password1");	
//		driver.findElement(By.name("username")).sendKeys(username);
//		driver.findElement(By.name("password")).sendKeys(password1);
//	Thread.sleep(2000);
//	    	}
//
//	@And("User Clicks on Login")
//	public void user_clicks_on_login() throws InterruptedException {
//		System.out.println("Inside Step - User Clicks on Login");	
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//		Thread.sleep(2000); 	
//	}	
//	@Then("User is navigated to the home page1")
//	public void user_is_navigated_to_the_home_page1() {
//		driver.getPageSource().contains("Accounts Overview");
////		driver.close();
////		driver.quit();
//	}
//		
////		@And("^User will Click on Open New Account$")
////		public void user_will_click_on_open_new_account()throws InterruptedException {
////			System.out.println("User will Click on Open New Account");	
////			driver.findElement(By.xpath("//a[text()='Open New Account']")).click();
////			Thread.sleep(2000); 	
////		}
//
////		@When("^User will Select Account Type and Trasfer fund amount$")
////		public void user_will_select_account_type_and_trasfer_fund_amount() {
////			System.out.println("User will Click on Open New Account");	
////			driver.findElement(By.xpath("//select[@id='type']")).click();
////			driver.findElement(By.xpath("//option[text()='SAVINGS']")).click();
////			driver.findElement(By.xpath("//select[@id='fromAccountId']")).click();
////			driver.findElement(By.xpath("//option[@value='14232']")).click();
////		
////		}
//
////		@And("^User will click on Open New Account$")
////		public void user_will_click_on_open_new_account1() {
////			System.out.println("User will click on Open New Account");	
////			driver.findElement(By.xpath("//input[@value='Open New Account']")).click();  
////		}
//
////		@Then("^User Open an Account$")
////		public void user_open_an_account() {
////			System.out.println("User Open an Account");	
////			driver.getPageSource().contains("Account Opened!");
////			driver.close();
////			driver.quit();
////		}
//
//		@And("^User will Click on Transfer Funds$")
//		public void user_will_click_on_transfer_funds() throws InterruptedException {
//		System.out.println("User will Click on Transfer Funds");	
//		driver.findElement(By.xpath("//a[text()='Transfer Funds']")).click();
//		Thread.sleep(2000); 
//		}
//
//		@When("^User will Enter the Amount$")  
//		public void user_will_enter_the_amount() throws InterruptedException {
//		System.out.println("User will Enter the Amount");
//		driver.findElement(By.xpath("//input[@id='amount']")).sendKeys("1000");
//		Thread.sleep(2000); 
//		}
//
//		@And("^Click on Transfer Funds$")
//		public void click_on_transfer_funds() {
//        driver.findElement(By.xpath("//input[@value='Transfer']")).click();
//		}
//
//		@Then("^Transfer has been Completed$")
//		public void transfer_has_been_completed() throws InterruptedException {
//			driver.getPageSource().contains("Transfer Complete!");
//			Thread.sleep(2000); 
//			driver.close();
//			driver.quit();
//		}
//
//	}
//
//
//
//		
//	
//
