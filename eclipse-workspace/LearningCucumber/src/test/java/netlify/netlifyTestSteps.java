package netlify;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class netlifyTestSteps {

	 
	 WebDriver driver = null;
	
	@Given("^Open netify browser$")
	public void open_netify_browser() {
//		String ProjectPath =System.getProperty("user.dir");
//		System.out.println("Project path is: " +ProjectPath);
		
		//System.setProperty("Webdriver.chrome.driver ",ProjectPath+"/src/test/resources/drivers/chromedriver-win64/chromedriver.exe");

		
	driver = new ChromeDriver();
//	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//	driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);   
	
	}

	@And("^User is on This is your sample Form Page$") 
	public void user_is_on_this_is_your_sample_form_page() throws InterruptedException {
		System.out.println("User is on This is your sample Form Page");
		driver.get("https://trytestingthis.netlify.app/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

	}

	@When("^Enter First Name and Last Name$")
	public void enter_first_name_and_last_name() throws InterruptedException {
		
		System.out.println("Enter First Name and Last Name");
		driver.findElement(By.id("fname")).sendKeys("Namrata");
		driver.findElement(By.id("lname")).sendKeys("Yadav");
		Thread.sleep(2000);
	}
	
	@And("^Select Gender$")
	public void select_gender() throws InterruptedException {
		System.out.println("Select Gender");
	driver.findElement(By.id("female")).click();
	Thread.sleep(2000);
	}

	@And("^Choose and Option$")
	public void choose_and_option() throws InterruptedException {
		System.out.println("Choose and Option");
		WebElement ChooseOption= driver.findElement(By.id("option"));
		Select AnyOption=new Select(ChooseOption);
		AnyOption.selectByVisibleText("Option 1");
		Thread.sleep(2000);

	}

//	@And("^select multiple options$")
//	public void select_multiple_options() {
//		System.out.println("select multiple options");
//	}

	@And("^Choose applicable options$")
	public void choose_applicable_options() throws InterruptedException {
		System.out.println("Choose applicable options");
		driver.findElement(By.name("option2")).click();
		driver.findElement(By.name("option3")).click();
		Thread.sleep(2000);
	}

	@And("^Start typing and it till automatically guess answer$")
	public void start_typing_and_it_till_automatically_guess_answer() throws InterruptedException {
		System.out.println("Start typing and it till automatically guess answer");
//		
//		driver.findElement(By.xpath("//input[@list='datalists']")).sendKeys("c");
//		driver.findElement(By.xpath("//input[@list='datalists']")).click();
		WebElement AutomaticallyGuess= driver.findElement(By.xpath("//input[@list='datalists']"));
		AutomaticallyGuess.sendKeys("c");
		AutomaticallyGuess.submit();
	 	Thread.sleep(2000);
//		Select GuessFromDropDown= new Select(AutomaticallyGuess);
//		
//		GuessFromDropDown.selectByVisibleText("Chocolate");
		
		Thread.sleep(2000);

	}
	
	@And("^Select a Date from Date Picker$")
	public void select_a_date_from_date_picker()  throws InterruptedException {
		System.out.println("Select a Date from Date Picker");   
        WebElement date= driver.findElement(By.id("day"));
        date.sendKeys("1222024");
    	Thread.sleep(2000);
    
    	}
	
	@When("^Enter Long Message$")
	public void enter_long_message()  throws InterruptedException {
		System.out.println("Enter Long Message");   
		driver.findElement(By.xpath("//textarea[@name='message']")).clear();
		Thread.sleep(2000);
     driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys("My Name is Namrata");
     
 	Thread.sleep(2000);

	}

	@Then("^Click on Submit$")
	public void click_on_submit()  throws InterruptedException {
		System.out.println("Click on Submit");
	
		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
		driver.close();
		driver.quit();
	}



}
