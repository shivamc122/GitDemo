package webAuto1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

public class NewUser {
	
	static String mobile="7866443322";
	
	public static void main(String[]args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	//Admin User script
	
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
    
    driver.findElement(By.xpath("//a[text()='Master Data']")).click();
    System.out.println("User click on Master Data"); 
    
    
    JavascriptExecutor js1=(JavascriptExecutor)driver;
	js1.executeScript("window.scrollBy(0,5000)","");
    System.out.println("Admin User scroll down on Page");
    
   // Thread.sleep(5000);
    
    driver.findElement(By.xpath("//a[text()='Users']")).click();
    System.out.println("User click Users"); 
    
    //Select mobile=new Select();
      //mobile.selectByI(null);
    
    WebElement MobileNumber = driver.findElement(By.id("q_mobile"));
    try {
		MobileNumber.sendKeys(mobile);
	} catch (Exception e) {
		
		e.printStackTrace();
	}
    System.out.println("User enters Mobile"); 
    
    
    MobileNumber.sendKeys(Keys.ENTER);
    
    System.out.println("User enters Mobile on Text box"); 
    
   // assert.
    
    //FrontEnd>>Merchant Demo
    
    driver.get("https://snapmint:ciHns$@NKSa@qa2.snapmint.com/merchant-demo");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("new-mobile")).sendKeys(mobile);
	System.out.println("User Enter Mobile No");
	
	
	
	driver.findElement(By.xpath("//*[@name='merchant_id']")).clear();
	System.out.println("User remove Merchant details");
	
	driver.findElement(By.xpath("//*[@name='merchant_id']")).sendKeys("1");
	System.out.println("User Enter new Merchant id");
	
	driver.findElement(By.xpath("//*[@name='order_id']")).clear();
	System.out.println("User remove Merchant order id");
	
	driver.findElement(By.xpath("//*[@name='order_id']")).sendKeys("Test1233dd66rrddd");
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
	
	
	driver.findElement(By.name("otp")).sendKeys("1010");
    System.out.println("enter the otp");
   
    driver.findElement(By.xpath("//button[normalize-space()='Next']")).click();
   
   // clearAndSendKeys(driver, "firstName", "Sristis");
    //clearAndSendKeys(driver, "lastName", "Verma");
    driver.findElement(By.name("panNumber")).sendKeys("FKGPY4565P");
    System.out.println("enter pan number");
   
    WebElement femaleRadioButton = driver.findElement(By.xpath("//input[@name='gender' and @value='f']"));
    femaleRadioButton.click();
    System.out.println("select gender");
    WebElement day = driver.findElement(By.xpath("//div[@class='w-[100%] h-[48px] border-[1px] rounded-[4px] text-center border-[#DEE4E5] flex items-center']"));
    day.click();
    WebElement dayElement1 = driver.findElement(By.xpath("//div[@class='even:bg-[#F4F7FF] odd:bg-white pl-4']"));
    dayElement1.click();
    System.out.println("select day");
    WebElement month = driver.findElement(By.xpath("//div[contains(text(),'Month')]"));
    month.click();
    WebElement monthElement1 = driver.findElement(By.xpath("//div[normalize-space()='May']"));
    monthElement1.click();
    System.out.println("select month");
    WebElement year = driver.findElement(By.xpath("//div[contains(text(),'Year')]"));
    year.click();
    WebElement yearElement1 = driver.findElement(By.xpath("//div[normalize-space()='1999']"));
    yearElement1.click();
    System.out.println("select year");
   
    driver.findElement(By.xpath("//button[normalize-space()='Next']")).click();
    System.out.println("click on next button");
	// Thread.sleep(6000);
   // driver.navigate().refresh();
    
    
    //Admin Script to Increase Eligibility
    
    
    driver.get("https://qa2.snapmint.com/admin/users");
    driver.manage().window().maximize();
    System.out.println("Admin User is Redirect to Admin Users Page");
//    driver.findElement(By.xpath("//input[@id='admin_user_email']")).sendKeys("shivam.chauhan@snapmint.com");
//    System.out.println("Admin User enters email id ");
//    
//    driver.findElement(By.xpath("//input[@id='admin_user_password']")).sendKeys("shivam@2107");
//    System.out.println("Admin User enters Password id "); 
    
//    driver.findElement(By.xpath("//input[@id='admin_user_remember_me']")).click();
//    System.out.println("Admin User click on Admin remember me button "); 
//    
//    driver.findElement(By.xpath("//input[@type='submit']")).click();
//    System.out.println("Admin User click on Login Button "); 
//    
//    driver.findElement(By.xpath("//a[text()='Master Data']")).click();
//    System.out.println("User click on Master Data"); 
//    
//    
//    JavascriptExecutor js2=(JavascriptExecutor)driver;
//	js2.executeScript("window.scrollBy(0,5000)","");
//    System.out.println("Admin User scroll down on Page");
    
   // Thread.sleep(5000);
    
//    driver.findElement(By.xpath("//a[text()='Users']")).click();
//    System.out.println("User click Users"); 
    
    //Select mobile=new Select();
      //mobile.selectByI(null);
    driver.get("https://qa2.snapmint.com/admin/users");
    WebElement MobileNumber1 = driver.findElement(By.id("q_mobile"));
    MobileNumber1.sendKeys(mobile);
    System.out.println("User enters Mobile"); 
    
    
    MobileNumber.sendKeys(Keys.ENTER);
    
    System.out.println("User enters Mobile on Text box"); 
    
    
    WebElement link=driver.findElement(By.xpath("//a[@class='resource_id_link']"));
    link.click();
    
    driver.findElement(By.xpath("//a[contains(text(),'Boost Eligible Now')]")).click();

      FluentWait<WebDriver> wait = new FluentWait<>(driver)
         .withTimeout(Duration.ofSeconds(30))
         .pollingEvery(Duration.ofSeconds(1));
       WebElement boostlimitInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='remark']")));

     boostlimitInput.sendKeys("20000");
     boostlimitInput.submit();


 driver.findElement(By.xpath("//a[normalize-space()='Change Approved Limit']")).click();

 WebElement approvedlimitInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form[@id='boost_limit_form']//input[@id='remark']")));

 approvedlimitInput.sendKeys("20000");
 approvedlimitInput.submit();
    
    
    
    
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	
//	driver.findElement(By.xpath("//*[@id='inputBox']")).click();
//	//driver.findElement(By.xpath("//*[@inputmode='numeric']")).sendKeys("1010");
//	System.out.println("User Enters OTP ");
//	//Thread.sleep(2000);
//	
//    driver.findElement(By.xpath("//*[@class='buttonbox fw-600 pd-wd-stylr']")).click();
//	System.out.println("User click on Button");
//	
	String currentURL = driver.getCurrentUrl();
	System.out.println(currentURL);
	
    
	
}

	private static void clearAndSendKeys(WebDriver driver, String string, String string2) {
		// TODO Auto-generated method stub
		
	}

}


