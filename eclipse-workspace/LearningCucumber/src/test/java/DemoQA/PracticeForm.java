package DemoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PracticeForm {

	WebDriver driver=null;
	@Given("^User is on Practice Form Browser$")
	public void user_is_on_practice_form_browser() throws InterruptedException{
		System.out.println("User is on Practice Form Browser");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/automation-practice-form");

	}

	@When("^User enters Name$")
	public void user_enters_name() {
		System.out.println("User enters Name");
		driver.findElement(By.id("firstName")).sendKeys("Namo");
		driver.findElement(By.id("lastName")).sendKeys("Namo");

	}

	@And("^Enters Email$")
	public void enters_email() throws InterruptedException {
		System.out.println("Enters Email");
		driver.findElement(By.id("userEmail")).sendKeys("namo123@yopmail.com");
		Thread.sleep(2000);
	}

	@And("^Enters Gender$")
	public void enters_gender() {
		System.out.println("Enters Gender");
		driver.findElement(By.xpath("//div[text()='Gender']")).click();
	driver.findElement(By.id("gender-radio-2")).click();
	 	}

	@And("^Enters Mobile$") 
	public void enters_mobile()  throws InterruptedException {
		System.out.println("Enters Mobile Number");
		driver.findElement(By.id("userNumber")).sendKeys("1234567890");
	}

	@And("^Enters Date of Birth$")
	public void enters_date_of_birth() throws InterruptedException {
		System.out.println("Enters Date of Birth");
		driver.findElement(By.id("dateOfBirthInput")).click();
		Thread.sleep(2000);
		WebElement month=driver.findElement(By.xpath("//Select[@class='react-datepicker__month-select']"));
		Select PickMonth=new Select(month);
		PickMonth.selectByVisibleText("June");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-label='Choose Wednesday, June 5th, 2024']")).click();


	}

	@And("^Enters Subjects$")
	public void enters_subjects() throws InterruptedException {
		System.out.println("Enters Subjects");
		driver.findElement(By.id("subjectsContainer")).sendKeys("Enter subject Line Item");
	}

	@And("^Select Hobbies$")
	public void select_hobbies() throws InterruptedException {
		System.out.println("Select Hobbies");
		driver.findElement(By.id("hobbies-checkbox-3")).click();
	}

	@And("^Select Pictures$")
	public void select_pictures() throws InterruptedException{
		System.out.println("Select Pictures");
		driver.findElement(By.id("uploadPicture")).sendKeys("C:/Users/yadav/OneDrive/Pictures/Kusum Devi.03.jpg");
		Thread.sleep(2000);
	}

	@And("^Selct Address$")
	public void selct_address()  throws InterruptedException {
		System.out.println("Selct Address");
		driver.findElement(By.id("currentAddress")).sendKeys("Flat no. 28, NCR, UP");
		Thread.sleep(2000);

	}

	@And("^Select State$")
	public void select_state() throws InterruptedException { 
		System.out.println("Select State");
		WebElement State=driver.findElement(By.xpath("//div[text()='Select State']"));
		Select OptionState=new Select(State);
		OptionState.selectByVisibleText("NCR");
		Thread.sleep(2000);
	}

	@And("^Select City$")
	public void select_city() {
		System.out.println("Select City");
		WebElement City=driver.findElement(By.id("city"));
		Select OptionCity=new Select(City);
		OptionCity.selectByVisibleText("Noida");
	}

	@Then("^Submit the Form$")
	public void submit_the_form() {

		System.out.println("Submit the Form");
		driver.findElement(By.id("submit")).click();
		driver.close();
		driver.quit();
	}

}
