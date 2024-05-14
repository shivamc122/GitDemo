package webAuto1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RepeatUser {
	
	
	static String mobile="9850425686";
	static String merchant_id="1";
	static String order_id="TestUserddd22ggg26";
	static String order_value="10000";
	static String username="Shiva Chauhan";
	static String email_id="shivamc122@gmail.com";
	static String otp="1010";
	
	
			
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://snapmint:ciHns$@NKSa@qa2.snapmint.com/merchant-demo");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("new-mobile")).sendKeys(mobile);
		System.out.println("User Enter Mobile No");
		
		
		
		driver.findElement(By.xpath("//*[@name='merchant_id']")).clear();
		System.out.println("User remove Merchant details");
		
		driver.findElement(By.xpath("//*[@name='merchant_id']")).sendKeys(merchant_id);
		System.out.println("User Enter new Merchant id");
		
		driver.findElement(By.xpath("//*[@name='order_id']")).clear();
		System.out.println("User remove Merchant order id");
		
		driver.findElement(By.xpath("//*[@name='order_id']")).sendKeys(order_id);
		System.out.println("User Enter new Merchant order id");
		
		driver.findElement(By.xpath("//*[@name='order_value']")).clear();
		System.out.println("User remove Merchant order value");
		
		driver.findElement(By.xpath("//*[@name='order_value']")).sendKeys(order_value);
		System.out.println("User Enter new Merchant order value");
		
		driver.findElement(By.xpath("//*[@name='full_name']")).clear();
		System.out.println("User remove Full Name");
		
		driver.findElement(By.xpath("//*[@name='full_name']")).sendKeys(username);
		System.out.println("User Enter new Full Name");
		
		driver.findElement(By.xpath("//*[@name='email']")).clear();
		System.out.println("User remove email id");
		
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys(email_id);
		System.out.println("User Enter new email id");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1500)","");
		System.out.println("User scroll down on Page");
		
		driver.findElement(By.xpath("//*[@value='create checksum']")).click();
		System.out.println("User create Checksum");
		//Thread.sleep(2000);
		
		driver.findElement(By.id("submit_btn")).click();
		System.out.println("User Click on Submit Button");
		
		
		
		
		
		//driver.findElement(By.xpath("//*[@class='otp-inpt-control ']")).sendKeys("1010");
		driver.findElement(By.xpath("//*[@id='inputBox']")).sendKeys(otp);
		System.out.println("User Enters OTP ");
		//Thread.sleep(2000);
		
	    driver.findElement(By.xpath("//*[@class='buttonbox fw-600 pd-wd-stylr']")).click();
		System.out.println("User click on Button");
	    
		Thread.sleep(2000);
		
		String getpageURL = driver.getCurrentUrl();
		System.out.println("getpageURL");
		
		//WebElement d2 =driver.findElement(By.xpath("*[@class='']"]).click();
		
		
		WebElement d2 =driver.findElement(By.xpath("(//@class='bg-primary text-darkGreen  snap-primary-button w-[100%] px-[0px]')"));
	      d2.click();
	      Thread.sleep(2000);
	      System.out.println("User Click Confirm order button");
	      
	      
	      driver.findElement(By.xpath("//*[@class='mitc_btn blue_btn_box']")).click();
	      System.out.println("User Click Submit button");
	      
	     // WebElement popupclick = driver.findElement(By.xpath("//button[@class='bg-primary text-darkGreen  snap-primary-button w-[100%] px-[0px]']"));
	      //popupclick.click();
	      
	      
	      //driver.findElement(By.xpath("(//*[contains(@class,'buy-on-emi cursor-pointer')])[1]")).click();
	      
	      driver.findElement(By.xpath("//button[normalize-space()='Yes']")).click();
	      Thread.sleep(5000);
	      
	      driver.findElement(By.xpath("//button[text()='Pay ₹299 to Confirm Order']")).click();
	      
	      driver.findElement(By.xpath("//*[@class='mitc_btn blue_btn_box']")).click();
	      
	      //driver.findElement(By.xpath("//input[@name='vpa')").sendKeys("7777777777@paytm");
	      
	      driver.findElement(By.xpath("//input[@name='vpa']")).sendKeys("7777777777@paytm");

	}

}
