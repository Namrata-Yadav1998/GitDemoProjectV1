package DemoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class radioButton {
	
	WebDriver driver=null;
	
	@Given("User is on Demo Qa Radio button screen")
	public void user_is_on_demo_qa_radio_button_screen() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("User is on Demo Qa Radio button screen");
		driver.navigate().to("https://demoqa.com/radio-button");

	}

	@When("User able to check selected radio button")
	public void user_able_to_check_selected_radio_button() {
		System.out.println("User able to check selected radio button");
		if(driver.findElement(By.id("noRadio")).isEnabled())
		{
			driver.findElement(By.id("noRadio")).click();
			System.out.println("Radio button is enabled");
		}
		else
		{
	
			System.out.println("Radio button is disabled");
		}
		driver.close();
		driver.quit();

	}

}
