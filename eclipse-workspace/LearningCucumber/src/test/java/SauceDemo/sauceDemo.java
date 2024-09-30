package SauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class sauceDemo {
	
	WebDriver driver=null;
	@Given("^open saucedemo Web browser$")
	public void open_saucedemo_web_browser() {
		driver=new ChromeDriver();
		System.out.println("open saucedemo Web browser");
		driver.navigate().to("https://www.saucedemo.com/");

	}

	@When("^User Enters Username and Password$")
	public void user_enters_username_and_password() throws InterruptedException{
		System.out.println("User Enters Username and Password");
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);

	}

	@And("^Click on Login$")
	public void click_on_login() {
		System.out.println("Click on Login");
		driver.findElement(By.name("login-button")).click();

	}

	@And("^User is on Swag Labs Screen$")
	public void user_is_on_swag_labs_screen() {
		System.out.println("User is on Swag Labs Screen");
		driver.getPageSource().contains("Products");
		

	}

	@And("^Enter Two Item in Add to cart$")
	public void enter_two_item_in_add_to_cart() throws InterruptedException {
		System.out.println("Enter Two Item in Add to cart");
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
		Thread.sleep(2000);

	}

	@And("^Click on Add to Cart$")
	public void click_on_add_to_cart() {
		System.out.println("Click on Add to Cart");
		driver.findElement(By.id("shopping_cart_container")).click();

	}

	@And("^Navigate to Your cart screen$")
	public void navigate_to_your_cart_screen() {
		System.out.println("Navigate to Your cart screen");
		driver.getPageSource().contains("Your Cart");

	}

	@And("^Click on Checkout$")
	public void click_on_checkout() {
		System.out.println("Click on Checkout");
		driver.findElement(By.id("checkout")).click();

	}

	@And("^Enter First Name andd Last Name and Zipcode$")
	public void enter_first_name_andd_last_name_and_zipcode() throws InterruptedException{
		System.out.println("Enter First Name andd Last Name and Zipcode");
		driver.findElement(By.id("first-name")).sendKeys("Nam");
		Thread.sleep(2000);
		driver.findElement(By.id("last-name")).sendKeys("Yad");
		Thread.sleep(2000);
		driver.findElement(By.id("postal-code")).sendKeys("10007");
		Thread.sleep(2000);
		
		
		

	}

	@And("^Click on Continue$")
	public void click_on_continue() {
		System.out.println("Click on Continue");
		driver.findElement(By.id("continue")).click();

	}

	@And("^Navigate to Checkout: Overview$")
	public void navigate_to_checkout_overview() throws InterruptedException{
		System.out.println("Navigate to Checkout: Overview");
		driver.getPageSource().contains("Checkout: Overview");
		Thread.sleep(2000);

	}

	@And("^Click on Finish$")
	public void click_on_finish() {
		System.out.println("Click on Finish");
		driver.findElement(By.id("finish")).click();

	}

	@Then("^Navigate to Thank you for your order! Screen$")
	public void navigate_to_thank_you_for_your_order_screen() {
		System.out.println("Navigate to Thank you for your order! Screen");
		driver.getPageSource().contains("Thank you for your order!");

	}

}
