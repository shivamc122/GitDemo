package webAuto1;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class RepeatUserScript {
	public static void main (String[]args){ 
	
	WebDriver driver = new ChromeDriver();
	 driver.get("https://snapmint:ciHns$%40NKSa@qa2.snapmint.com/merchant-demo");
	 driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 driver.findElement(By.name("mobile")).sendKeys("9850425686");
	
       clearAndSendKeys(driver, "merchant_id", "1");
       
       clearAndSendKeys(driver, "store_id", "1");
       
       clearAndSendKeys(driver, "order_id", "ffffjhj");
       
       clearAndSendKeys(driver, "order_value", "10000");
       
       clearAndSendKeys(driver, "full_name", "");
       
       clearAndSendKeys(driver, "email", "");
       
       driver.findElement(By.id("checksum_btn")).click();
       
       driver.findElement(By.id("submit_btn")).click();
       
       driver.navigate().refresh();
       
       driver.findElement(By.name("otp")).sendKeys("1010");
       FluentWait<WebDriver> wait = new FluentWait<>(driver)
       	    .withTimeout(Duration.ofSeconds(10))  // Set the timeout duration
       	    .pollingEvery(Duration.ofMillis(500)) // Polling interval
       	   .ignoring(NoSuchElementException.class); // Ignore the exception if the element is not found
      
       	// Wait for the button to be clickable
       	WebElement selectPlanButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='bg-primary text-darkGreen  snap-primary-button w-[100%] px-[0px]']")));
         selectPlanButton.click();
         driver.findElement(By.xpath("//p[@class=' font-robotoSemiBold text-[12px] mt-[2px]']")).click();
         driver.findElement(By.id("upiId")).sendKeys("7777777777@paytm");
         driver.findElement(By.xpath("//button[contains(text(),'Pay ₹1500 Now')]")).click();
        System.out.println("click on pay");
//         WebElement element = driver.findElement(By.xpath("//img[@src='https://staticgw1.paytm.in/native/bank/SBI.png']"));
//
//         element.click();
//         System.out.println("click on sbi");
//         WebElement element1 = driver.findElement(By.xpath("//button[@class='bg-primary text-darkGreen  snap-primary-button py-[16px] h-[40PX] w-[164px] mx-auto text-[12px] mt-[12px]']"));
//         element1.click();
//
   
 
	       
}
	
	
private static void clearAndSendKeys(WebDriver driver, String name, String value)
{
WebElement textField = driver.findElement(By.name(name));
textField.clear();
textField.sendKeys(value);
}
}


