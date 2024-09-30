package DemoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AutoComplete {
	
	WebDriver driver=null;
	
	@Given("^User is on auto complete Webpage$")
	public void user_is_on_auto_complete_webpage() throws InterruptedException{
		System.out.println("User is on auto complete Webpage");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/auto-complete");
		

	}

	@When("^User enters any data$")
	public void user_enters_any_data() throws InterruptedException{
		System.out.println("User enters any data");
		driver.findElement(By.id("autoCompleteMultipleInput")).sendKeys("R");
		Thread.sleep(2000);
	//	WebElement ListElemens= driver.findElement(By.xpath("//*[@id='autoCompleteMultipleContainer']/div/div[1]"));
//        System.out.println("Total suggestions are: "+ListElemens );

            driver.findElement(By.xpath("//*[@id='react-select-2-option-0']")).click();
				Thread.sleep(2000);

	}

	@Then("^Able to slect Data$")
	public void able_to_slect_data() throws InterruptedException{
		
		System.out.println("User enters any data");
		driver.findElement(By.id("autoCompleteSingleInput")).sendKeys("W");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id='react-select-3-option-1']")).click();
	  Thread.sleep(2000);
	  driver.close();
	  driver.quit();

	}

}
