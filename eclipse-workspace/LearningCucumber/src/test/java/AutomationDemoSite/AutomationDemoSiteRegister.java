package AutomationDemoSite;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AutomationDemoSiteRegister {
	WebDriver driver=null;

	@Given("^User is on Regration Page$")
	public void user_is_on_regration_page() {
		System.out.println("User is on Regration Page");
		String ProjectPath =System.getProperty("user.dir");
		System.out.println("Project path is: " +ProjectPath);
		System.setProperty("Webdriver.chrome.driver ",ProjectPath+"/src/test/resources/drivers/chromedriver-win64/chromedriver.exe");

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.automationtesting.in/Register.html");

	}

	@When("^User enters Full Name$")
	public void user_enters_full_name() throws InterruptedException {
		System.out.println("User enters Full Name");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Namo");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Chan");
		Thread.sleep(1000);

	}

	@And("^Enter Address on Regration Page$")
	public void enter_address_on_regration_page() throws InterruptedException {
		System.out.println("Enter Address on Regration Page");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("XYZ HYD 800001");
		Thread.sleep(2000);

	}

	@And("^Enter Email on Regration Page$")
	public void enter_email_on_regration_page() throws InterruptedException {
		System.out.println("Enter Email on Regration Page");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abc123@yopmail.com");
		Thread.sleep(2000);

	}

	@And("^Enter Phone on Regration Page$")
	public void enter_phone_on_regration_page() throws InterruptedException {
		System.out.println("Enter Phone on Regration Page");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("1234567890");
		Thread.sleep(2000);

	}

	@And("^Select Gender on Regration Page$")
	public void select_gender_on_regration_page() throws InterruptedException {
		System.out.println("Select Gender on Regration Page");
		driver.findElement(By.xpath("//input[@value='FeMale']")).click();
		Thread.sleep(2000);


	}

	@And("^Select Hobbies on Regration Page$")
	public void select_hobbies_on_regration_page() throws InterruptedException {
		System.out.println("Select Hobbies on Regration Page");
		driver.findElement(By.id("checkbox2")).click();
		Thread.sleep(2000);
//		JavascriptExecutor js=(JavascriptExecutor) driver;
//		js.executeScript("Window.scrollTo(0, document.body.scrollHeight)");


	}

	@And("^Select Languages on Regration Page$")
	public void select_languages_on_regration_page() throws InterruptedException {
		System.out.println("Select Languages on Regration Page");
		WebElement Languages=driver.findElement(By.id("msdd"));
		Languages.click();
		Thread.sleep(3000);
		List<WebElement> auto1= driver.findElements(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']/li"));

		int count1= auto1.size();
		System.out.println("Size and of Auto suggestion: "+count1);
		auto1.get(count1-8).click();
	}

	@And("^Select Skills on Regration Page$")
	public void select_skills_on_regration_page() throws InterruptedException {
		System.out.println("Select Skills on Regration Page");

		WebElement Skills= driver.findElement(By.xpath("//select[@ng-model='Skill']"));
		Select SkillSelect=new Select(Skills);
		SkillSelect.selectByVisibleText("Android");
		Thread.sleep(2000);	

	}

	@And("^Select Country on Regration Page$")
	public void select_country_on_regration_page() throws InterruptedException {
		System.out.println("Select Country on Regration Page");
		driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("a");
		List<WebElement> auto2= driver.findElements(By.xpath("//ul[@id='select2-country-results']/li"));

		int count2= auto2.size();
		System.out.println("Size and of Auto suggestion: "+count2);
		auto2.get(count2-3).click();
		Thread.sleep(2000);	

	}

	@And("^Select Date of Birth on Regration Page$")
	public void select_date_of_birth_on_regration_page() throws InterruptedException {
		System.out.println("Select Date of Birth on Regration Page");

		WebElement Year= driver.findElement(By.id("yearbox"));
		Select YearSelect=new Select(Year);
		YearSelect.selectByVisibleText("1995");
		Thread.sleep(2000);	

		WebElement Month= driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select MonthSelect=new Select(Year);
		MonthSelect.selectByVisibleText("April");
		Thread.sleep(2000);	

		WebElement Day= driver.findElement(By.id("daybox"));
		Select DaySelect=new Select(Day);
		DaySelect.selectByVisibleText("19");
		Thread.sleep(2000);	
	}

	@And("^Enter Password on Regration Page$")
	public void enter_password_on_regration_page() throws InterruptedException {
		System.out.println("Enter Password on Regration Page");
		driver.findElement(By.id("firstpassword")).sendKeys("ChaNam@123");
		Thread.sleep(2000);	

	}

	@And("^Enter Confirm Password on Regration Page$")
	public void enter_confirm_password_on_regration_page() throws InterruptedException {
		System.out.println("Enter Confirm Password on Regration Page");
		driver.findElement(By.id("secondpassword")).sendKeys("ChaNam@123");
		Thread.sleep(2000);	

	}

	@Then("^Enter Submit on Regration Page$")
	public void enter_submit_on_regration_page() throws InterruptedException {
		System.out.println("Enter Submit on Regration Page");
		driver.findElement(By.id("submitbtn")).click();
		Thread.sleep(2000);	
		driver.close();
		driver.quit();

	}


}
