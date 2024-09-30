package DemoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class demoqaClass {

	WebDriver driver=null;
	@Given("^User is on demoqa web screen$")
	public void user_is_on_demoqa_web_screen() throws InterruptedException{
		System.out.println("User is on demoqa web screen");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/tool-tips");
		Thread.sleep(5000);

	}

	@When("^User will hover over on buttom$")
	public void user_will_hover_over_on_buttom() throws InterruptedException{
		System.out.println("User will hover over on buttom");
		WebElement HoverOverButton=driver.findElement(By.id("toolTipButton"));
		Actions SelectHOButton=new Actions(driver);
		SelectHOButton.moveToElement(HoverOverButton).perform();
		Thread.sleep(5000);
	}

	@Then("^User will hover over on textbox$")
	public void user_will_hover_over_on_textbox() throws InterruptedException{
		System.out.println("User will hover over on textbox");
		WebElement HoverOverTextBox=driver.findElement(By.id("toolTipTextField"));
		Actions SelectHOTextBox=new Actions(driver);
		SelectHOTextBox.moveToElement(HoverOverTextBox).perform();
		Thread.sleep(5000);

	}
	@And("^Enter Textboxes$")
	public void enter_textboxes() throws InterruptedException{
		System.out.println("Enter Textboxes");
		driver.findElement(By.id("toolTipTextField")).sendKeys("Entering some sentence in Hover Over Txtbox");
		Thread.sleep(5000);		
		driver.close();
		driver.quit();
	}

}
