package webAuto1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

public class AdminFEdemo {
	
	static String mobile="7800112243";

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		 driver.get("https://qa2.snapmint.com/admin/dashboard");
		 driver.findElement(By.name("admin_user[email]")).sendKeys("sonali.b@snapmint.com");
		 driver.findElement(By.name("admin_user[password]")).sendKeys("12345678");
		 driver.findElement(By.xpath("//*[@name='commit']")).click();
		 
		 
		 
		 //driver.findElement(By.xpath("//a[normalize-space()='Master Data']")).click();
//		 driver.findElement(By.xpath("//a[text()='Master Data']")).click();
		
		 driver.get("https://qa2.snapmint.com/admin/users");
		  driver.manage().window().maximize();
		  driver.findElement(By.id("q_mobile")).sendKeys(mobile );
		  WebElement mobileNumberInput = driver.findElement(By.id("q_mobile"));
	        mobileNumberInput.sendKeys(mobile);
	
	        mobileNumberInput.sendKeys(Keys.ENTER);
	       
	       
	      /// for frontend create user
	 
     
	  driver.get("https://snapmint:ciHns$%40NKSa@qa2.snapmint.com/merchant-demo");
       
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        clearAndSendKeys(driver, "mobile", mobile );
        System.out.println("enter the mobile number");
       
        clearAndSendKeys(driver, "merchant_id", "1");
        System.out.println("enter the merchant id ");
       
       
        clearAndSendKeys(driver, "store_id", "1");
        System.out.println("enter the store id ");
       
        clearAndSendKeys(driver, "order_id", "ssggsssk");
        System.out.println("enter the order  id ");
       
        clearAndSendKeys(driver, "order_value", "5000");
        System.out.println("enter the order value ");
       
        clearAndSendKeys(driver, "full_name", "");
        System.out.println("enter the full name ");
       
        clearAndSendKeys(driver, "email", "shivangi@gmail.com");
        System.out.println("enter the email id ");
       
        driver.findElement(By.id("checksum_btn")).click();
        System.out.println("click on checksum");
       
        driver.findElement(By.id("submit_btn")).click();
        System.out.println("click on submit button");
        driver.findElement(By.name("otp")).sendKeys("1010");
        System.out.println("enter the otp");
       
        clearAndSendKeys(driver, "firstName", "Jeeva");
        clearAndSendKeys(driver, "lastName", "Savkare");
        driver.findElement(By.name("panNumber")).sendKeys("GPHPH4565P");
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
        
        
        Thread.sleep(3000);
        
        
        String CurrentpageURL = driver.getCurrentUrl();
        System.out.println(CurrentpageURL);
     
        //admin for add in framework
       
        driver.get("https://qa2.snapmint.com/admin/test_frameworks");
		 driver.findElement(By.xpath("//a[text()='New Test Framework']")).click();
		 driver.findElement(By.id("test_framework_user_name")).sendKeys("automationtest");
		 driver.findElement(By.id("test_framework_mobile")).sendKeys(mobile );
		
		
		WebElement textField = driver.findElement(By.id("test_framework_rules"));
		textField.clear();
		textField.sendKeys("{:kyc=>\"ask\", :is_enach_required=>0, :nla=>1, :nla_message_code=>6, :approved_limit=>20000, :eligible_limit=>20000, :available_limit=>20000, :voucher_limit=>20000}");
		
	    driver.findElement(By.xpath("//input[@value='Create Test framework']")).click();
       
    
      
       
        // admin  for perfious screen
    
    
         driver.get("https://qa2.snapmint.com/admin/users");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("q_mobile")).sendKeys(mobile );
		  
		 WebElement mobileNumberInput1 = driver.findElement(By.id("q_mobile"));
	     mobileNumberInput1.sendKeys(mobile );
	
	     mobileNumberInput1.sendKeys(Keys.ENTER);
	     driver.findElement(By.xpath("//a[@class='resource_id_link']")).click();
	       
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
		 
		 
		 
		 driver.get(CurrentpageURL);
		 //driver.navigate().refresh();
		 
		 
		WebElement digilocker =driver.findElement(By.xpath("//button[@class='bg-primary text-darkGreen  snap-primary-button text-xl mt-6 w-full']"));
		   
		digilocker.click();
				
		WebElement digilockername = driver.findElement(By.xpath("(//*[@type='text'])[1]"));
			
		digilockername.sendKeys("Jeeva Savkare");
			
		WebElement digilockeraddress = driver.findElement(By.xpath("(//*[@type='text'])[2]"));
			
		digilockeraddress.sendKeys("Mumbai");
			
			
			WebElement digilockernumber = driver.findElement(By.xpath("(//*[@type='text'])[3]"));
			digilockernumber.sendKeys("2109");
			
		   WebElement digilockerDOB = driver.findElement(By.xpath("//*[@type='dob'])"));
		  
			digilockerDOB.sendKeys("01-05-1999");
			
			//WebElement digilockerDOB = driver.findElement(By.xpath("//input[@name='dob']"));
		    //digilockerDOB.sendKeys("1999-05-01");
			 //digilockerDOB.sendKeys("01-05-1999");
			
			WebElement merchantmin=	driver.findElement(By.name("status"));
		    Select status=new Select(merchantmin);
		    status.selectByVisibleText("success");
		    driver.findElement(By.id("submit_btn")).click();
			
			
			
			//driver.findElement(By.name("dob")).click();
			
			//WebElement digilockerDOB=driver.findElement(By.xpath("//*[@value='52259_1713433460'"));
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
//	driver.navigate().back();
//	driver.findElement(By.xpath("//button[normalize-space()='Next']")).click();
	
	
	
		
		
		 /// admin for add user in tet framwork
		
       
       
       
  
       
		
		
//        System.out.println("click on next button");
//   	 Thread.sleep(6000);
//   	 driver.navigate().refresh();
       
       
       
       
       
//       
//    driver.findElement(By.name("email")).sendKeys("snapmint@gmail.com");
//  driver.findElement(By.xpath("//button[contains(@class, 'bg-secondaryText') and contains(@class, 'snap-primary-button') and contains(text(), 'Next')]")).click();
//  Thread.sleep(4000);
//
       
//        driver.findElement(By.id("//button[normalize-space()='Pay in 3 Months EMIs']")).click();
//        System.out.println("click on months EMI");
	
//        FluentWait<WebDriver> wait = new FluentWait<>(driver)
//    	    .withTimeout(Duration.ofSeconds(10))  // Set the timeout duration
//    	    .pollingEvery(Duration.ofMillis(500)) // Polling interval
//    	    .ignoring(NoSuchElementException.class);
//	FluentWait<WebDriver> wait1 = wait;
		      
//
//	 driver.findElement(By.cssSelector("button.snap-primary-button")).click();
//
//        	
//
//    driver.findElement(By.xpath("//button[text()='Add']")).click();
//
}
    private static void clearAndSendKeys(WebDriver driver, String name, String value)
    {
        WebElement textField = driver.findElement(By.name(name));
        textField.clear();
        textField.sendKeys(value);
    }



	}


