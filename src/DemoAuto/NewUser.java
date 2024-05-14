package DemoAuto;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
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
	static  String mobile ="98553737362";
	static  String email ="shivam.chauhan@Snapmint.com";
	static  String name ="Shivam";
	static  String lastname ="Chauhan";
	static  String adminpassword ="shivam@2107";
	static  String orderid ="DDDDSSDDDFDddDDD";
	static  String ordervalue ="15000";
	static  String merchant_id ="114";
	static  String store_id ="1";
	static  String PAN_number ="ESHPS3659K";
	static  String OTP ="1010";
	
	
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		  WebDriver driver = new ChromeDriver();
		 
//// To login in admin
//		     driver.get("https://qa2.snapmint.com/admin/dashboard");
//		     driver.manage().window().maximize();
//			 driver.findElement(By.name("admin_user[email]")).sendKeys(email);
//			 driver.findElement(By.name("admin_user[password]")).sendKeys(adminpassword);
//			 driver.findElement(By.xpath("//*[@name='commit']")).click();
//			
//// To check user is new or old from admin user			
//			 driver.get("https://qa2.snapmint.com/admin/users");
//			 //driver.manage().window().maximize();
//			 driver.findElement(By.id("q_mobile")).sendKeys(mobile );
//		WebElement mobileNumberInput = driver.findElement(By.id("q_mobile"));
//		           mobileNumberInput.sendKeys(mobile);
//		           mobileNumberInput.sendKeys(Keys.ENTER);
//		          
//// To create the user from the merchant demo frontend
//		     driver.get("https://snapmint:ciHns$%40NKSa@qa2.snapmint.com/merchant-demo");
//             driver.manage().window().maximize();
//		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		     clearAndSendKeys(driver, "mobile", mobile );
//		     clearAndSendKeys(driver, "merchant_id", merchant_id);
//		     clearAndSendKeys(driver, "store_id", store_id);
//		     clearAndSendKeys(driver, "order_id", orderid);
//		     clearAndSendKeys(driver, "order_value", ordervalue);
//		     clearAndSendKeys(driver, "full_name", "");
//		     clearAndSendKeys(driver, "email", email);
//		     driver.findElement(By.id("checksum_btn")).click();
//		     driver.findElement(By.id("submit_btn")).click();
//		     //driver.findElement(By.name("otp")).sendKeys(OTP);
//		     //driver.findElement(By.xpath("//*[@id='inputBox']")).sendKeys(OTP);
//				System.out.println("User Enters OTP ");
//				//Thread.sleep(2000);
//		     Thread.sleep(2000);
		  
		  
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
		  
		     driver.findElement(By.id("firstName")).sendKeys(name);
		     driver.findElement(By.id("lastName")).sendKeys(lastname);
		     driver.findElement(By.name("panNumber")).sendKeys(PAN_number);
		     
		     
		     
	     WebElement femaleRadioButton = driver.findElement(By.xpath("//input[@name='gender' and @value='f']"));
		            femaleRadioButton.click();	
		 WebElement day = driver.findElement(By.xpath("//div[@class='w-[100%] h-[48px] border-[1px] rounded-[4px] text-center border-[#DEE4E5] flex items-center']"));
			        day.click();
	     WebElement dayElement1 = driver.findElement(By.xpath("//div[@class='even:bg-[#F4F7FF] odd:bg-white pl-4']"));
			        dayElement1.click();
	     WebElement month = driver.findElement(By.xpath("//div[contains(text(),'Month')]"));
			        month.click();
	     WebElement monthElement1 = driver.findElement(By.xpath("//div[normalize-space()='May']"));
			        monthElement1.click();
	     WebElement year = driver.findElement(By.xpath("//div[contains(text(),'Year')]"));
			        year.click();
		 WebElement yearElement1 = driver.findElement(By.xpath("//div[normalize-space()='1999']"));
			        yearElement1.click();
			 driver.findElement(By.xpath("//button[normalize-space()='Next']")).click();
			 Thread.sleep(3000);
		 String CurrentpageURL = driver.getCurrentUrl();
		
// for create test framework and  add user in testframework from backend
		    driver.get("https://qa2.snapmint.com/admin/test_frameworks");
		    driver.findElement(By.xpath("//a[text()='New Test Framework']")).click();
		    driver.findElement(By.id("test_framework_user_name")).sendKeys("usertest");
		    driver.findElement(By.id("test_framework_mobile")).sendKeys(mobile );
		 WebElement textField = driver.findElement(By.id("test_framework_rules"));
			        textField.clear();
			        textField.sendKeys("{:kyc=>\"ask\", :is_enach_required=>0, :nla=>1, :nla_message_code=>6}");
		    driver.findElement(By.xpath("//input[@value='Create Test framework']")).click();
		   
//		   
		   
//for skip the perfious screen from  backend
		    driver.get("https://qa2.snapmint.com/admin/users");
			driver.manage().window().maximize();
			driver.findElement(By.id("q_mobile")).sendKeys(mobile );
		 WebElement mobileNumberInput1 = driver.findElement(By.id("q_mobile"));
		            mobileNumberInput1.sendKeys(mobile );
		            mobileNumberInput1.sendKeys(Keys.ENTER);
		    driver.findElement(By.xpath("//a[@class='resource_id_link']")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Boost Eligible Now')]")).click();
	     WebElement boostlimitInput =driver.findElement(By.xpath("//input[@id='remark']"));	
			        boostlimitInput.sendKeys("20000");
			        boostlimitInput.submit();
			driver.findElement(By.xpath("//a[normalize-space()='Change Approved Limit']")).click();
		 WebElement approvedlimitInput = driver.findElement(By.xpath("//form[@id='boost_limit_form']//input[@id='remark']"));
					approvedlimitInput.sendKeys("20000");
					approvedlimitInput.submit();
					
//For comeing back to frontend page
			driver.get(CurrentpageURL);	
//			driver.findElement(By.xpath("//button[contains(@class, 'snap-primary-button') and contains(., 'Pay in')]\r\n"+ "")).click();
			
//For manual digilocker KYC from backend
		 WebElement digilocker =driver.findElement(By.xpath("//button[@class='bg-primary text-darkGreen  snap-primary-button text-xl mt-6 w-full']"));
			        digilocker.click();	
		 WebElement digilockername = driver.findElement(By.xpath("(//*[@type='text'])[1]"));
		            digilockername.sendKeys("name");
		 WebElement digilockeraddress = driver.findElement(By.xpath("(//*[@type='text'])[2]"));
		            digilockeraddress.sendKeys("Mumbai");
		 WebElement digilockernumber = driver.findElement(By.xpath("(//*[@type='text'])[3]"));
		            digilockernumber.sendKeys("2109");
		 WebElement digilockerDOB = driver.findElement(By.xpath("//input[@name='dob']"));
	                digilockerDOB.sendKeys("01-05-1999");
		 WebElement merchantmin=	driver.findElement(By.name("status"));
		
//create class for select the success drop-down 		
	     Select status=new Select(merchantmin);
	     status.selectByVisibleText("success");
	        driver.findElement(By.id("submit_btn")).click();
	        FluentWait<WebDriver> wait = new FluentWait<>(driver)
			         .withTimeout(Duration.ofSeconds(30))
			         .pollingEvery(Duration.ofSeconds(1));
	   WebElement add=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Add']")));
	              add.click();
			driver.findElement(By.xpath("//span[@class='hv-close-button'] ")).click();
			
			
//Construct the file path to from the desktop			
		String desktopPath = System.getProperty("user.home") + File.separator + "Desktop";
		String filePath = desktopPath + File.separator + "C:\\image\\Capture";
		Robot rb= new Robot();
		rb.delay(2000);
//put path to file in clipboard		
		StringSelection ss=new StringSelection("C:\\image\\Capture");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
//ctrl+v
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
//Enter		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		   driver.findElement(By.id("alternateNumber")).sendKeys("9876545678");
	   	   driver.findElement(By.xpath("//button[@class='bg-primary text-darkGreen  snap-primary-button mt-[16px] text-xl py-6 w-full']")).click();
		 
		
		  
//for payment with UPI id 	
//	   	driver.findElement(By.xpath("//*[@class='bg-primary text-darkGreen  snap-primary-button w-[100%] px-[0px]']")).click();
//		   driver.findElement(By.id("upiId")).sendKeys("7777777777@paytm");
//		    WebElement button1 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'Pay ₹')]")));
//         button1.click();
//         ((Robot) button1).delay(2000);
//
//           WebElement button11 = driver.findElement(By.cssSelector("div.container-class > button"));
//           WebElement button2 = driver.findElement(By.cssSelector(".bg-primary.text-darkGreen.snap-primary-button")); (edited) 


}


	private static void clearAndSendKeys(WebDriver driver, String string, String mobile2) {
		// TODO Auto-generated method stub
		
	}
}
