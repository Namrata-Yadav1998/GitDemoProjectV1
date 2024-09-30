//package demoblaze;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import demoblazePages.demoblazeclass;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//
//public class demoblaze2 {
//	WebDriver driver=null;
//	demoblazeclass dblogin;
//
//	@Given("^Open demoblaze Browser$")
//	public void open_demoblaze_browser() {
//		driver=new ChromeDriver();	
//		driver.manage().window().maximize();
//		System.out.println("Open demoblaze Browser");
//	//	driver.navigate.to("https://www.demoblaze.com/index.html");
//		driver.navigate().to("https://www.demoblaze.com/index.html");
//
//	}
//
//	@And("^Click on signup$")
//	public void click_sign_up() throws InterruptedException {
//		System.out.println("Click on sign up");
//		dblogin= new demoblazeclass(driver);
//		dblogin.home_SignUp();
////		driver.findElement(By.id("signin2")).click();
////		Thread.sleep(2000);
//
//	}
//
//	@When("^User enters(.*)and(.*)$")
//	public void user_enters_username_and_password(String dbusername, String dbpassword) throws InterruptedException {
//		System.out.println("Enter Username and passsword");
//		driver.findElement(By.xpath("//*[@id='sign-username']")).sendKeys(dbusername);
//		Thread.sleep(2000);
//		System.out.println("Enter password");
//		driver.findElement(By.xpath("//*[@id='sign-password']")).sendKeys(dbpassword);
//	//	dblogin= new demoblazeclass(driver);
//		
////		dblogin.enterUsernamedb(dbusername);
////		Thread.sleep(2000);
////		dblogin.enterPassworddb(dbpassword);
////		Thread.sleep(2000);
//	}
//	
//
//	@Then("^Click on SignUp1$")
//	public void click_on_sign_up1() throws InterruptedException {
//		System.out.println("Click on Sign Up1");
//		driver.findElement(By.xpath("//button[text()='Sign up']")).click();
//		Thread.sleep(2000);
//		System.out.println("click on Alert Pop up");
//		driver.switchTo().alert().accept();
//	}
//
//}
