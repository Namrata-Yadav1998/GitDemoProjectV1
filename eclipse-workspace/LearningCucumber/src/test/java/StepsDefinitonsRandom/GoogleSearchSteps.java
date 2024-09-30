package StepsDefinitonsRandom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
 WebDriver driver=null;
	
	@SuppressWarnings("deprecation")
	@Given("Browser is open")
	public void browser_is_open() {
		System.out.println("Inside Step - Browser is open");
		
		String ProjectPath =System.getProperty("user.dir");
		System.out.println("Project path is: " +ProjectPath);
		
		System.setProperty("Webdriver.chrome.driver ",ProjectPath+"/src/test/resources/drivers/chromedriver-win64/chromedriver.exe");

		
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	//driver.manage().window().maximize();
	}

	@And("User is on google search box")
	public void user_is_on_google_search_box() {
		System.out.println("Inside Step - User is on google search box");
		driver.navigate().to("https://www.google.com/");
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() throws InterruptedException{
		System.out.println("Inside Step - user enters a text in search box");	
	driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
	Thread.sleep(2000);
	}

	@And("hit enter")
	public void hit_enter() throws InterruptedException{
		System.out.println("Inside Step - hit enter");		
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	Thread.sleep(2000);		
	}

	@Then("user is navigated to search result")
	public void user_is_navigated_to_search_result() {
		System.out.println("Inside Step - user is navigated to search result");	
	driver.getPageSource().contains("Online Courses");
	driver.close();
	driver.quit();
	}

}
