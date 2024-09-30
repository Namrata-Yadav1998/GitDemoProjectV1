package MakeMyTrip;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MakeMyTrip {
	WebDriver driver=null;
	
	@Given("^User is on Make my trip Web$")
	public void user_is_on_make_my_trip_web() {
		driver=new ChromeDriver();
		System.out.println("User is on Make my trip Web");
		driver.navigate().to("https://www.makemytrip.com/flights/");
	    
	}

	@When("^User click on cross$")
	public void user_click_on_cross() throws InterruptedException{
 System.out.println("User click on cross");
 driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
 Thread.sleep(2000);
	}

	@And("^Click on Round trip$")
	public void click_on_round_trip() {
		System.out.println("Click on Round trip");
		driver.findElement(By.xpath("//li[@data-cy='roundTrip']")).click();
	    
	}

	@And("^Select From City$")
	public void select_from_city() throws InterruptedException{
		System.out.println("Select From City");
		WebElement FromCity= driver.findElement(By.id("fromCity"));
		FromCity.sendKeys("Patna");
		Thread.sleep(2000);
		List<WebElement> FromCityName=   driver.findElements(By.xpath("//div[@class='react-autosuggest__suggestions-container react-autosuggest__suggestions-container--open']"));

		int count= FromCityName.size();
		System.out.println("Size and of Auto suggestion: "+count);
		FromCityName.get(count-8).click();
	}

	@And("^Select To City$")
	public void select_to_city() throws InterruptedException {
		System.out.println("Select To City");
		WebElement ToCity= driver.findElement(By.id("toCity"));
		ToCity.sendKeys("Chennai");
		Thread.sleep(2000);
		List<WebElement> FromCityName=   driver.findElements(By.xpath("//div[@class='react-autosuggest__container react-autosuggest__container--open']"));

		int count= FromCityName.size();
		System.out.println("Size and of Auto suggestion: "+count);
		FromCityName.get(count-8).click();
	   
	}

	@And("^Select Departure date$")
	public void select_departure_date() {
	  System.out.println("Select Departure date");  
	  driver.findElement(By.id("departure")).click();
       driver.findElement(By.xpath("//input[@value='Tuesday, 12 Nov 2024']")).click();
	}

	@And("^Select Return Date$")
	public void select_return_date() {
		System.out.println("Select Return Date");
		driver.findElement(By.id("return")).click();
		driver.findElement(By.xpath("Wednesday, 13 Nov 2024")).click();
	    
	}

	@And("^Click on Search$")
	public void click_on_search() throws InterruptedException {
		System.out.println("Click on Search");
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		Thread.sleep(5000);
	   
	}

	@Then("^User will navigate to next screen$")
	public void user_will_navigate_to_next_screen() {
		System.out.println("User will navigate to next screen");

	    
	}


}
