package AutomationExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AutomationExerciseLogin {
   
	WebDriver driver=null;
	
//	@Given("^User is on automation exercise Browser$")
//	public void user_is_on_automation_exercise_browser() {
//		driver= new ChromeDriver();
//		System.out.println("User is on automation exercise Browser");
//		driver.navigate().to("https://automationexercise.com/");
//		driver.manage().window().maximize();
//	}
	
	@When("^User click on LoginButton$")
	public void user_click_on_login_button() {
		System.out.println("User click on LoginButton");
		driver.findElement(By.xpath("//*[text()=' Signup / Login']")).click();
	
	}

	@Then("^Navigate to Login to your account$")
	public void navigate_to_login_to_your_account() {
    System.out.println("Navigate to Login to your account");
    driver.getPageSource().contains("Login to your account");
    
	}
	
	
	@When("^User Enters Email Address and Password$")
	public void user_enters_email_address_and_password_pass() throws InterruptedException {
		
		System.out.println("User Enters Email Address and Password");
		driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("namo123@yopmail.com");
		driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("1234");
		Thread.sleep(2000);
	}

	@And("^Click on Login Page$")
	public void click_on_login_page()  throws InterruptedException {
    System.out.println("Click on Login Page");
    driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();
	Thread.sleep(2000);
	}

	@Then("Navigate to Automation Exercise Home Page")
	public void navigate_to_automation_exercise_home_page() {
		
		System.out.println("Navigate to Features Items");
		 driver.getPageSource().contains("Features Items");

	}
	@When("Click on Add to cart")
	public void click_on_add_to_cart()throws InterruptedException {
		
    System.out.println("Click on Add to cart");
    driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div[1]/div[5]/div/div[1]/div[1]/a")).click();
	Thread.sleep(2000);
	}

	@When("Click on View Cart") 
	public void click_on_view_cart()  throws InterruptedException {
     driver.findElement(By.xpath("//u[text()='View Cart']")).click();
     
	}

	@Then("Click on Proceed to checkOut")
	public void click_on_proceed_to_check_out() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Proceed To Checkout']")).click();
		driver.close();
		driver.quit();
	}
}
