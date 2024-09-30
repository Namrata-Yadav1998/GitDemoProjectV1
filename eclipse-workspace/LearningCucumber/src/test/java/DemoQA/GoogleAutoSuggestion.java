package DemoQA;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleAutoSuggestion {
	WebDriver driver=null;

	@Given("^User is on google page$")
	public void user_is_on_google_page() {
		System.out.println("User is on google page");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");


	}

	@When("^user enters Bangalore auto suggestion populates and Select any element$")
	public void user_enters_bangalore_auto_suggestion_populates_and_select_any_element() throws InterruptedException {
		System.out.println("user enters Bangalore auto suggestion populates and Select any element");
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Bangalore");
		Thread.sleep(3000);
		List<WebElement> auto= driver.findElements(By.xpath("//div[@class='mkHrUc']//li"));

		int count= auto.size();
		System.out.println("Size and of Auto suggestion: "+count);
		auto.get(count-8).click();


	}

	@Then("^User Navigate to next screen$")
	public void user_navigate_to_next_screen() throws InterruptedException {
		System.out.println("User Navigate to next screen");
		driver.getPageSource().contains("Weather");
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}

}
