package AutomationExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactUSAE {
	WebDriver driver=null;
	

	@Given("^User is on automation exercise Browser$")
	public void user_is_on_automation_exercise_browser() throws InterruptedException {
    System.out.println("User is on automation exercise Browser");
    driver= new ChromeDriver();
    driver.navigate().to("https://automationexercise.com/");
    driver.manage().window().maximize();
    Thread.sleep(2000);	
	}

	@When("^User is Click on Contact Us$")
	public void user_is_click_on_contact_us() {
		System.out.println("User is Click on Contact Us");
		driver.findElement(By.xpath("//*[text()=' Contact us']")).click();

	}

	@Then("^User navigate to Contact Us Screen$")
	public void user_navigate_to_contact_us_screen() throws InterruptedException {
    System.out.println("User navigate to Contact Us Screen");
    driver.getPageSource().contains("Get In Touch");
    Thread.sleep(2000);	
	}

	@When("^Enter Name Email Subject$")
	public void enter_name_email_subject() throws InterruptedException {
    System.out.println("Enter Name");
    driver.findElement(By.xpath("//input[@name='name']")).sendKeys("namo");
    System.out.println("Enter Email");
    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("namo123@yopmail.com");
    System.out.println("Enter Subject");
    driver.findElement(By.xpath("//input[@name='subject']")).sendKeys("Contact Us");
    System.out.println("Enter messages");
    driver.findElement(By.id("message")).sendKeys("Contact Us to give your feedback");
    Thread.sleep(2000);	
    
	}
	
	

	@And("^Choose File$")
	public void choose_file() throws InterruptedException {

		System.out.println("Choose File");
		WebElement UploadFile=driver.findElement(By.xpath("//input[@name='upload_file']"));
		UploadFile.sendKeys("C:/Users/yadav/OneDrive/Pictures/Kusum Devi.03.jpg");
		 Thread.sleep(2000);	
	}
	
	@Then("^Click Submit$")
	public void click_submit() {
		System.out.println("Click on Submit Button");
      driver.findElement(By.xpath("//input[@name='submit']")).click();
	}

	@And("^Click OK Alert Pop up$")
	public void click_ok_alert_pop_up() {
		System.out.println("click on Alert Pop up");
		driver.switchTo().alert().accept();

	}

	@And("^Success! Your details have been submitted successfully.$")
	public void success_your_details_have_been_submitted_successfully() {
System.out.println("Success! Your details have been submitted successfully.");
driver.getPageSource().contains("Success! Your details have been submitted successfully.");
	}

	@And("^Click on Home$")
	public void click_on_home() {
		System.out.println("Click on Home");
		driver.findElement(By.xpath("//a[@class='btn btn-success']")).click();
		driver.close();
		driver.quit();
	}



	
}
