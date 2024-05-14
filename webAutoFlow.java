package webAuto1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webAutoFlow {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	
	driver.get("https://snapmint:ciHns$@NKSa@qa2.snapmint.com/merchant-demo");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("new-mobile")).sendKeys("8743340022");
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
	//Thread.sleep(2000);
	//driver.get("https://qa2.snapmint.com/plugin/snap_checkout/qa.html?cv2=true&id=121194&merchant_id=4&message=Success&mobile=7777221188&status=Success&token=W8X5x-hHLEoyY5AU2pLB");

	
	driver.findElement(By.xpath("//*[@id='inputBox']")).sendKeys("1010");
	System.out.println("User Enters OTP ");
	//Thread.sleep(2000);
	
   driver.findElement(By.xpath("//*[@class='buttonbox fw-600 pd-wd-stylr']")).click();
	System.out.println("User click on Button");
    
	Thread.sleep(2000);

//	 driver.get("https://qa2.snapmint.com/plugin/snap_checkout/qa.html?cv2=true&id=121350&merchant_id=4&message=Success&mobile=7777221197&status=Success&token=zMk1wQsKb1Rx-UhwTfpy");
//     Thread.sleep(2000);
//     System.out.println("User going direct on particular URL ");
//     
//     driver.findElement(By.xpath("//button[@class='blue-btn btn verify-otp active mt30\']")).click();
//     Thread.sleep(2000);
//     System.out.println("User CLIC PAY Button");
//     
//    
//     driver.findElement(By.xpath("//div[@class='mitc_btn blue_btn_box']")).click();
//     Thread.sleep(2000);
//     
//     System.out.println("User click Popup with Yes option");
//     
//     driver.findElement(By.xpath("//input[@name='vpa']")).sendKeys("7777777777@paytm");
//     System.out.println("User Enter UPI details");
//     
//     driver.findElement(By.xpath("//*[text()='Verify']")).click();
//     
//     driver.findElement(By.xpath("//button[@class='dt-pay-blue-botton pay-blue-botton']")).click();
//     Thread.sleep(2000);
//     
     
    driver.findElement(By.xpath("//*[@class='input-box uppercase-pan-fld']")).sendKeys("CKAPL9236Y");
    System.out.println("User Enters PAN card Details");
    //driver.findElement(By.id("pan")).sendKeys("CKAPL9235L");
   Thread.sleep(5000);
    
    
     driver.findElement(By.xpath("//input[@id='male']/parent::div/label")).click();
      Thread.sleep(2000);
      System.out.println("User Click on Male button");
    

    
    
      driver.findElement(By.xpath("//div[text()='Day']")).click();
      Thread.sleep(2000);
      System.out.println("User click on Day tab");
    
      driver.findElement(By.xpath("//*[@id='react-select-2--option-20']")).click();
      Thread.sleep(2000);
      System.out.println("User Select Day from Dropdown");
    
      WebElement month=driver.findElement(By.xpath("(//*[@class='Select-placeholder'])[1]"));
      month.click();
      System.out.println("User click on Mont"
      		+ "h tab");
    
      driver.findElement(By.xpath("//*[@id='react-select-3--option-8']")).click();
      Thread.sleep(2000);
      System.out.println("User Select Month from Dropdown");
    
       WebElement year = driver.findElement(By.xpath("(//*[@class='Select-placeholder'])[1]"));
       year.click();
       System.out.println("User click on Year tab");
     
    
       driver.findElement(By.xpath("//*[@id='react-select-4--option-31']")).click();
       Thread.sleep(2000);
       System.out.println("User Select Year from Dropdown");
   
  
    
      driver.findElement(By.xpath("//*[text()='Next']")).click();
      Thread.sleep(2000);
      System.out.println("User Click on Next Button");
      
      
    
  
	  driver.findElement(By.xpath("//*[@class='email-inpt-control']")).sendKeys("testwaeea122@gmail.com");
      System.out.println("User Enter Email id 2");
      
      Thread.sleep(1000);
      
      driver.findElement(By.xpath("//*[@class='email-buttonbox']")).click();
      Thread.sleep(1000);
      System.out.println("User Click on Next button");
      
      
      // driver.get("https://qa2.snapmint.com/plugin/snap_checkout/qa.html?cv2=true&id=121194&merchant_id=4&message=Success&mobile=7777221188&status=Success&token=W8X5x-hHLEoyY5AU2pLB");
      driver.get("https://qa2.snapmint.com/plugin/snap_checkout/qa.html?cv2=true&id=121350&merchant_id=4&message=Success&mobile=7777221197&status=Success&token=zMk1wQsKb1Rx-UhwTfpy");
      Thread.sleep(2000);
      
      driver.findElement(By.xpath("//button[@class='blue-btn btn verify-otp active mt30\']")).click();
      Thread.sleep(2000);
      
      driver.findElement(By.xpath("//label[@for='newloancheckbox']")).click();
      
      Thread.sleep(4000);
      
      
        //driver.findElement(By.xpath("//*[type()='radio']")).click();
        //Thread.sleep(2000);
       //System.out.println("User Click Buy Button");
//      
//      driver.findElement(By.xpath("(//*[contains(@class,'buy-on-emi cursor-pointer')])[1]")).click();
//      Thread.sleep(2000);
//      //System.out.println("User Click Buy Button2");
      
      //driver.findElement(By.xpath("//button[text()='Pay ₹300 to Confirm Order']")).click();
      WebElement d2 =driver.findElement(By.xpath("(//@class='blue-btn btn verify-otp active mt30')"));
      d2.click();
      Thread.sleep(2000);
      System.out.println("User Click Confirm order button");
      
      
      driver.findElement(By.xpath("//*[@class='mitc_btn blue_btn_box']")).click();
      System.out.println("User Click Submit button");
      
      driver.findElement(By.xpath("(//*[contains(@class,'buy-on-emi cursor-pointer')])[1]")).click();
      Thread.sleep(5000);
      
      driver.findElement(By.xpath("//button[text()='Pay ₹299 to Confirm Order']")).click();
      
      driver.findElement(By.xpath("//*[@class='mitc_btn blue_btn_box']")).click();
      
      //driver.findElement(By.xpath("//input[@name='vpa')").sendKeys("7777777777@paytm");
      
      driver.findElement(By.xpath("//input[@name='vpa']")).sendKeys("7777777777@paytm");
      
    
	//driver.quit();
}


}