package DemoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class alertDemoQa {
	WebDriver driver=null;

	@Given("^User is on DemoQA Alert page$")
	public void user_is_on_demo_qa_alert_page() {
		System.out.println("User is on DemoQA Alert page");
		driver=new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1024, 786));
		driver.get("https://demoqa.com/alerts");
	}

	@When("^User click first Alert OK$")
	public void user_click_first_alert_ok() throws InterruptedException {
		System.out.println("User click first Alert OK");
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}
	@And("^User click Second Alert OK$")
	public void user_click_second_alert_ok() throws InterruptedException {
		System.out.println("User click Second Alert OK");
		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
	}
	@And("^User click third Alert OK$")
	public void user_click_third_alert_ok()  throws InterruptedException {
		System.out.println("User click third Alert OK");
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.getPageSource().contains("You selected Ok");
		Thread.sleep(2000);
	}

	@And("^User click Fourth Alert OK$")
	public void user_click_fourth_alert_ok() throws InterruptedException {
		System.out.println("User click Fourth Alert OK");
		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Namo");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.getPageSource().contains("You entered Namo");
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}

}
