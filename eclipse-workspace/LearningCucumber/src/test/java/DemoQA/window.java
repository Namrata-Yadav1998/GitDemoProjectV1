package DemoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class window {
	WebDriver driver=null;

	@Given("^User has open Demo QA Browser Windows Page$")
	public void user_has_open_demo_qa_browser_windows_page() {
		System.out.println("User has open Demo QA Browser Windows Page");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/browser-windows");

	}

	@When("^User Click on New Tab$")
	public void user_click_on_new_tab() throws InterruptedException{
         System.out.println("User Click on New Tab");
         driver.findElement(By.id("tabButton")).click();
	}

	@Then("^User Navigate to new Tab$")
	public void user_navigate_to_new_tab() throws InterruptedException{
		
		driver.switchTo().newWindow(WindowType.TAB);
		System.out.println("User Navigate to new Tab");
        driver.getPageSource().contains("This is a sample page");
        Thread.sleep(2000);
	}

}
