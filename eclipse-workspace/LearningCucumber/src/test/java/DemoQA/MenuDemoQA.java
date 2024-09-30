package DemoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class MenuDemoQA {
	WebDriver driver=null;

	@Given("^User is on Menu Browser of demoqa$")
	public void user_is_on_menu_browser_of_demoqa() throws InterruptedException{
		System.out.println("User is on Menu Browser of demoqa");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/menu#");
		Thread.sleep(2000);
	}

	@When("^Hover over on Menu Item and select sub subLimit$")
	public void hover_over_on_menu_item_and_select_sub_sub_limit() throws InterruptedException{
		System.out.println("Hover over on Menu Item and select sub subLimit");
		WebElement Menu=driver.findElement(By.xpath("//a[text()='Main Item 2']"));
		Actions Menu1=new Actions(driver);
		Menu1.moveToElement(Menu).perform();
		Thread.sleep(2000);
		WebElement Menu2=driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']"));
		Actions Menu3=new Actions(driver);
		Menu3.moveToElement(Menu2).perform();
		Thread.sleep(2000);
		WebElement Menu4=driver.findElement(By.xpath("//a[text()='Sub Sub Item 2']"));
		Actions Menu5=new Actions(driver);
		Menu5.moveToElement(Menu4).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Sub Sub Item 2']"));
		Thread.sleep(2000);
		driver.close();
		driver.quit();

	}


}
