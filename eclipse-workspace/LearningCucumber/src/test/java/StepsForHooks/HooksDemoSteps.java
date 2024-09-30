//package StepsForHooks;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.After;
//import io.cucumber.java.AfterStep;
//import io.cucumber.java.Before;
//import io.cucumber.java.BeforeStep;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class HooksDemoSteps {
//	
//	WebDriver driver= null;
//	//@Before(order=1,value="@Smoke")
//	@Before(order=1)
//	public void browserSetup()
//	{
//		System.out.println(" I am inside Browser SetUp");
//		System.setProperty("Webdriver.chrome.driver","src/test/resources/drivers/chromedriver-win64/chromedriver.exe");
//	driver = new ChromeDriver();
//	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	driver.manage().window().maximize();
//	}
//
//	@After(order=1)
//	public void teardown()
//	{
//		System.out.println(" I am inside teardown");
//		driver.close();
//		driver.quit();
//	}
//	@After(order=2)
//	public void teardown2()
//	{
//		System.out.println("I am inside tear down 2\n");
//	}
//	
//	@BeforeStep
//	public static void beforeSteps()
//	{
//		System.out.println("I am inside Before steps-----");
//	}
//	
//	@Before(order=0)
//	public void setUp2()
//	{
//		System.out.println("I am insideSetup2 \n");
//	}
//	@AfterStep
//	public void afterSteps()
//	{
//		System.out.println("I am inside After Steps------");
//	}
//	
//	@Given("User is on Login Page")
//	public void user_is_on_login_page() {
//
//	}
//	@When("user enters valid username and Password")
//	public void user_enters_valid_username_and_password() {
//	    
//	}
//	@And("Click on Logins")
//	public void click_on_logins() {
//	
//	}
//	@Then("User is navigated to the home Page")
//	public void user_is_navigated_to_the_home_page() {
//	  
//	}
//
//}
