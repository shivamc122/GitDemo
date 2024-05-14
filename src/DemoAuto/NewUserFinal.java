package DemoAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewUserFinal {
	
	
	static  String email ="shivam.chauhan@Snapmint.com";
	static  String adminpassword ="shivam@2107";
	static  String mobile ="9855373322";
	static  String name ="Shivam";
	static  String lastname ="Chauhan";
    static  String orderid ="DDDDSSDDDFDDDD";
	static  String ordervalue ="15000";
	static  String merchant_id ="114";
	static  String store_id ="1";
	static  String PAN_number ="ESHPS3659K";
	static  String OTP ="1010";
	
	
	public static void main (String[]args)
	{
		WebDriver driver=new ChromeDriver();
		
		//Admin User script
		
		driver.get("https://qa2.snapmint.com/admin/login");
	    driver.manage().window().maximize();
	    System.out.println("Admin User is Redirect to Admin Login Page");
	    driver.findElement(By.xpath("//input[@id='admin_user_email']")).sendKeys(email);
	    System.out.println("Admin User enters email id ");
	    
	    driver.findElement(By.xpath("//input[@id='admin_user_password']")).sendKeys(adminpassword);
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
		
		driver.findElement(By.xpath("//*[@name='merchant_id']")).sendKeys(merchant_id);
		System.out.println("User Enter new Merchant id");
		
		driver.findElement(By.xpath("//*[@name='order_id']")).clear();
		System.out.println("User remove Merchant order id");
		
		driver.findElement(By.xpath("//*[@name='order_id']")).sendKeys(orderid);
		System.out.println("User Enter new Merchant order id");
		
		driver.findElement(By.xpath("//*[@name='order_value']")).clear();
		System.out.println("User remove Merchant order value");
		
		driver.findElement(By.xpath("//*[@name='order_value']")).sendKeys(ordervalue);
		System.out.println("User Enter new Merchant order value");
		
		driver.findElement(By.xpath("//*[@name='full_name']")).clear();
		System.out.println("User remove Full Name");
		
		driver.findElement(By.xpath("//*[@name='full_name']")).sendKeys(name);
	    System.out.println("User Enter new Full Name");
		
		driver.findElement(By.xpath("//*[@name='email']")).clear();
		System.out.println("User remove email id");
		
	    driver.findElement(By.xpath("//*[@name='email']")).sendKeys(email);
	    System.out.println("User Enter new email id");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1500)","");
		System.out.println("User scroll down on Page");
		
		driver.findElement(By.xpath("//*[@value='create checksum']")).click();
		System.out.println("User create Checksum");
		//Thread.sleep(2000);
		
		driver.findElement(By.id("submit_btn")).click();
		System.out.println("User Click on Submit Button");
		
		
		driver.findElement(By.name("otp")).sendKeys(OTP);
	    System.out.println("enter the otp");
	   
	    driver.findElement(By.xpath("//button[normalize-space()='Next']")).click();
	}
}
