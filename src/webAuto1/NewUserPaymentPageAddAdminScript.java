package webAuto1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewUserPaymentPageAddAdminScript {
	
	public static void main (String []args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://snapmint:ciHns$@NKSa@qa2.snapmint.com/merchant-demo");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("new-mobile")).sendKeys("8743340066");
		System.out.println("User Enter Mobile No");
		
		
		
		driver.findElement(By.xpath("//*[@name='merchant_id']")).clear();
		System.out.println("User remove Merchant details");
		
		driver.findElement(By.xpath("//*[@name='merchant_id']")).sendKeys("4");
		System.out.println("User Enter new Merchant id");
		
		driver.findElement(By.xpath("//*[@name='order_id']")).clear();
		System.out.println("User remove Merchant order id");
		
		driver.findElement(By.xpath("//*[@name='order_id']")).sendKeys("Test123366rr");
		System.out.println("User Enter new Merchant order id");
		
		driver.findElement(By.xpath("//*[@name='order_value']")).clear();
		System.out.println("User remove Merchant order value");
		
		driver.findElement(By.xpath("//*[@name='order_value']")).sendKeys("1500");
		System.out.println("User Enter new Merchant order value");
		
		driver.findElement(By.xpath("//*[@name='full_name']")).clear();
		System.out.println("User remove Full Name");
		
		driver.findElement(By.xpath("//*[@name='full_name']")).sendKeys("Shivam Chauhan");
		System.out.println("User Enter new Full Name");
		
		driver.findElement(By.xpath("//*[@name='email']")).clear();
		System.out.println("User remove email id");
		
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys("shiva12ddd3dd3ss@gmail.com");
		System.out.println("User Enter new email id");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1500)","");
		System.out.println("User scroll down on Page");
		
		driver.findElement(By.xpath("//*[@value='create checksum']")).click();
		System.out.println("User create Checksum");
		//Thread.sleep(2000);
		
		driver.findElement(By.id("submit_btn")).click();
		System.out.println("User Click on Submit Button");
		
		driver.findElement(By.xpath("//*[@id='inputBox']")).click();
		//driver.findElement(By.xpath("//*[@inputmode='numeric']")).sendKeys("1010");
		System.out.println("User Enters OTP ");
		//Thread.sleep(2000);
		
	   driver.findElement(By.xpath("//*[@class='buttonbox fw-600 pd-wd-stylr']")).click();
		System.out.println("User click on Button");
		
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
		
	    
		
	}

}
