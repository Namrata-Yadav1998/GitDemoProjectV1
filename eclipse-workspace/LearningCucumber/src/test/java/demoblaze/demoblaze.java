//package demoblaze;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//
//public class demoblaze {
//	WebDriver driver=null;
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
//	@When("^Click on signup$")
//	public void click_sign_up() throws InterruptedException {
//		System.out.println("Click on sign up");
//		driver.findElement(By.id("signin2")).click();
//		Thread.sleep(2000);
//
//	}
//
//	@And("^Enter Username and password$")
//	public void enter_username_and_password() throws InterruptedException {
//		System.out.println("Enter Username");
//		driver.findElement(By.xpath("//*[@id='sign-username']")).sendKeys("Namo");
//		Thread.sleep(2000);
//		System.out.println("Enter password");
//		driver.findElement(By.xpath("//*[@id='sign-password']")).sendKeys("1234");
//		
//
//	}
//
//	@Then("^Click on SignUp$")
//	public void click_on_sign_up() throws InterruptedException {
//		System.out.println("Click on Sign Up");
//		driver.findElement(By.xpath("//button[text()='Sign up']")).click();
//		Thread.sleep(2000);
//		System.out.println("click on Alert Pop up");
//		driver.switchTo().alert().accept();
//	}
//
//}
