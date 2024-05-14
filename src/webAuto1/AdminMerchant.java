package webAuto1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminMerchant {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.get("https://qa2.snapmint.com/admin/login");
	    driver.manage().window().maximize();
	    System.out.println("Admin User is Redirect to Admin Login Page");
	    driver.findElement(By.xpath("//input[@id='admin_user_email']")).sendKeys("shivam.chauhan@snapmint.com");
	    System.out.println("Admin User enters email id ");
	    
	    driver.findElement(By.xpath("//input[@id='admin_user_password']")).sendKeys("shivam@2107");
	    System.out.println("Admin User enters Password id "); 
	    
	    driver.findElement(By.xpath("//input[@id='admin_user_remember_me']")).click();
	    System.out.println("Admin User click on Admin remember me button "); 
	    
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    System.out.println("Admin User click on Login Button "); 
}
}