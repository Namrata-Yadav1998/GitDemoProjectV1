package DemoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Slider {
	WebDriver driver=null;
	
	@Given("^User is on slider page of Demoqa$")
	public void user_is_on_slider_page_of_demoqa() {
		driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		System.out.println("User is on slider page of Demoqa");
		driver.navigate().to("https://demoqa.com/slider");


	}

	@When("^User slides the slider$")
	public void user_slides_the_slider() throws InterruptedException{
		System.out.println("User slides the slider");
		WebElement slider=driver.findElement(By.xpath("//input[@type='range']"));
		Actions move=new Actions(driver);
		move.dragAndDropBy(slider, -200, 100).perform();
		Thread.sleep(5000);
		

	}

}
