package AutomationExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AutoExerSteps {

	WebDriver driver=null;


//	@Given("^User is on automation exercise Browser$")
//	public void user_is_on_automation_exercise_browser() {
//		driver= new ChromeDriver();
//		System.out.println("User is on automation exercise Browser");
//		driver.navigate().to("https://automationexercise.com/");
//		driver.manage().window().maximize();
	/* } */

	@When("^User click on Sign up$")
	public void user_click_on_sign_up() throws InterruptedException {
		System.out.println("User click on Sign up");
		driver.findElement(By.xpath("//*[text()=' Signup / Login']")).click();
		Thread.sleep(2000);

	}

	@Then("^Navigate to Sign Up Page$")
	public void navigate_to_sign_up_page() {
		System.out.println("Navigate to Sign Up Page");
		//		driver.getPageSource().contains("Accounts Overview");
		driver.getPageSource().contains("New User Signup!");


	}

	@When("^User Enters Name and Email Address$")
	public void user_enters_name_and_email_address() throws InterruptedException {
		System.out.println("User Enters Name and Email Address");
		driver.findElement(By.name("name")).sendKeys("Chandu");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("Chandu1234@yopmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Signup']")).click();

	}

	@When("^User Naviagtes to New User Signup!$")
	public void user_naviagtes_to_new_user_signup() {
		System.out.println("User Naviagtes to New User Signup!");
		driver.getPageSource().contains("Enter Account Information");
	}

	@And("^Select Title Raido,Select name,Enter Email, Enter Password, Selct Date of Birth and Sign of our news letter$")
	public void select_title_raido_select_name_enter_email_enter_password_selct_date_of_birth_and_sign_of_our_news_letter() throws InterruptedException {
		System.out.println("Select Title Raido");
		driver.findElement(By.id("id_gender2")).click();
		Thread.sleep(2000);
		//    System.out.println("Select name");
		//    System.out.println("Enter Email");
		System.out.println("Enter Password");
		driver.findElement(By.id("password")).sendKeys("1234");
		Thread.sleep(2000);
		System.out.println("Select Date of Birth: Day");
		WebElement DayDropDown=driver.findElement(By.id("days"));
		Select DayDropdownValue=new Select(DayDropDown);
		DayDropdownValue.selectByValue("10");

		Thread.sleep(2000);

		System.out.println("Select Date of Birth: Month");
		WebElement MonthDropDown=driver.findElement(By.id("months"));
		Select MonthsDropdownValue=new Select(MonthDropDown);
		MonthsDropdownValue.selectByVisibleText("February");

		Thread.sleep(2000);

		System.out.println("Select Date of Birth: Year");
		WebElement YearDropDown=driver.findElement(By.id("years"));
		Select YearDropdownValue=new Select(YearDropDown);
		YearDropdownValue.selectByValue("1998");
		Thread.sleep(2000);

//		System.out.println("Click on Sign up for newsletter");
//		driver.findElement(By.xpath("//*[@id='newsletter']")).click();

	}

	@And("^Enter Address Info First name, Last Name, Address, Country, State,City, Zipcode,Mobile Number$")
	public void enter_address_info_first_name_last_name_address_country_state_city_zipcode_mobile_number() throws InterruptedException {

		System.out.println("Enter First Name");
		driver.findElement(By.id("first_name")).sendKeys("Chandu");

		Thread.sleep(2000);

		System.out.println("Enter Last Name");
		driver.findElement(By.id("last_name")).sendKeys("Chandu");

		Thread.sleep(2000);

		System.out.println("Enter Address");
		driver.findElement(By.id("address1")).sendKeys("12xyz NY City");
		Thread.sleep(2000);


		System.out.println("Slect Country");
		WebElement CountryDropdown=driver.findElement(By.id("country"));
		Select selectCountryFromDropdown=new Select(CountryDropdown);
		selectCountryFromDropdown.selectByVisibleText("United States");
		Thread.sleep(2000);

		System.out.println("Enter State");
		driver.findElement(By.id("state")).sendKeys("NY");
		Thread.sleep(2000);

		System.out.println("Enter City");
		driver.findElement(By.id("city")).sendKeys("NYC");
		Thread.sleep(2000);

		System.out.println("Enter Zipcode");
		driver.findElement(By.id("zipcode")).sendKeys("10001");
		Thread.sleep(2000);

		System.out.println("Enter Mobile Number");
		driver.findElement(By.id("mobile_number")).sendKeys("1234567890");
	
	}

	@Then("^Click Create Account$")
	public void click_create_account() throws InterruptedException {
		System.out.println("Click Create Account");
		//driver.findElement(By.xpath("//button[text()='Create Account']")).click();
		driver.findElement(By.xpath("//button[@data-qa='create-account']")).click();
	}

	@And("New User Signup! page apprear")
	public void new_user_signup_page_apprear() throws InterruptedException {
		System.out.println("New User Signup! page apprear");
		driver.getPageSource().contains("Account Created!");
		driver.findElement(By.xpath("//a[text()='Continue']")).click();
		Thread.sleep(2000);
		driver.navigate().to("https://automationexercise.com/");
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}




}
