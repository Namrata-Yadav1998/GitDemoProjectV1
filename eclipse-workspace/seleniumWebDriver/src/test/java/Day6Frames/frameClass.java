package Day6Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameClass {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Namo");
		driver.switchTo().defaultContent();
		WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Chand");
		driver.switchTo().defaultContent();
		WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("frame3");
		driver.switchTo().frame(0);
		WebElement checkbox1=driver.findElement(By.xpath("//div[@id='i9']//div[@class='vd3tt']"));
		boolean notsel=checkbox1.isSelected();
        System.out.println("selected or not :"+checkbox1.isSelected());	
        checkbox1.click();
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,250)");
		WebElement checkbox2=driver.findElement(By.xpath("//label[@for='i21']"));
		boolean notsel2=checkbox2.isSelected();
        System.out.println("selected or not :"+checkbox2.isSelected());	
        checkbox2.click();
        driver.switchTo().defaultContent();
		WebElement frame5=driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		driver.switchTo().frame(frame5);
		driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("frame5");
		driver.findElement(By.xpath("//a[normalize-space()='https://a9t9.com']")).click();
		WebElement newweb=driver.findElement(By.xpath("//img[@alt='Ui.Vision by a9t9 software - Image-Driven Automation']"));
		System.out.println("visible or not :"+newweb.isDisplayed());
   

       // driver.quit();
		
		
	

	}

}
