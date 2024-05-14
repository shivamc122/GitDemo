package webAuto1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MerchantS {
	public static void main(String[]args) throws InterruptedException
	
	{
		//WebDriver driver=new ChromeDriver();	
		//ChromeOptions options = new ChromeOptions();

		//options.addArguments("--headless", "--window-size=1920,1200");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://snapmint:ciHns$@NKSa@qa2.snapmint.com/merchant-demo");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("new-mobile")).sendKeys("6777221111");
		
		
		
		driver.findElement(By.xpath("//*[@name='merchant_id']")).clear();
		driver.findElement(By.xpath("//*[@name='merchant_id']")).sendKeys("4");
		
		driver.findElement(By.xpath("//*[@name='order_id']")).clear();
		driver.findElement(By.xpath("//*[@name='order_id']")).sendKeys("Test12334242");
		
		driver.findElement(By.xpath("//*[@name='order_value']")).clear();
		driver.findElement(By.xpath("//*[@name='order_value']")).sendKeys("2000");
		
		driver.findElement(By.xpath("//*[@name='full_name']")).clear();
		driver.findElement(By.xpath("//*[@name='full_name']")).sendKeys("Shiva Chauhan");
		
		driver.findElement(By.xpath("//*[@name='email']")).clear();
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys("shiva1233@gmail.com");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1500)","");
		
		driver.findElement(By.xpath("//*[@value='create checksum']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("submit_btn")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@class='otp-inpt-control ']")).sendKeys("1010");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@class='buttonbox fw-600 pd-wd-stylr']")).click();
		Thread.sleep(3000);
		
		//user_info = pd.read_csv("D:\\TestId.csv");
		//print(user_info);
		
		 //driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/label[1]")).click();
	        
		
//	       // Define the CSV file path
//        String csvFilePath = "D:\\TestId.csv";
//
//        // Read the CSV file
//        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
//            String line;
//            int idx = 0;
//
//            // Read each line of the CSV file
//            while ((line = br.readLine()) != null) {
//                // Split the line into columns assuming comma as delimiter
//                String[] columns = line.split(",");
//
//                // Assuming the CSV structure: "PAN,Gender,DOB (DD/MM/YYYY),Email"
//                String pan = columns[0];
//                String gender = columns[1].substring(0, 1).toLowerCase();
//                String dob = columns[2];
//
//                // Parse the date of birth (DOB)
//                String[] dobParts = dob.split("/");
//                int day = Integer.parseInt(dobParts[0]);
//                int month = Integer.parseInt(dobParts[1]);
//                int year = Integer.parseInt(dobParts[2]);
//
//                // Calculate age
//                Date today = new Date(day);
//                SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
//                int currentYear = Integer.parseInt(sdf.format(today));
//                int age = currentYear - year;
//
//                // Check if the person is 18 years or older
//                boolean isAdult = age >= 18;
//
//                // Print the results
//                System.out.println("PAN: " + pan);
//                System.out.println("Gender: " + gender);
//                System.out.println("DOB: " + dob);
//                System.out.println("Age: " + age);
//                System.out.println("Is Adult: " + isAdult);
//
//                idx++;
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    

		
		
		driver.findElement(By.xpath("//*[@class='buttonbox fw-600 pd-wd-stylr']")).click();
		Thread.sleep(3000);
		
        driver.findElement(By.xpath("//*[@class='input-box uppercase-pan-fld']")).sendKeys("CKAPL1235L");
       Thread.sleep(5000);
        
        driver.findElement(By.xpath("//*[@type='radio']/preceding-sibling::label[text()='Male']")).click();
        
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/label[1]")).click();
        
//       WebElement day = driver.findElement(By.xpath("//div[contains(text(),'Day')]"));
//      //div[contains(@class,'Select-placeholder')]
//         //WebElement day = driver.findElement(By.xpath("//div[contains(@class,'Select-placeholder')]"));
//        day.clear();
//	Thread.sleep(1000);
//		//Select a=new Select(day);
//		//a.selectByIndex(22);
//		
//		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[4]/div/div/div[1]/div[2]/div[{day}]")).click();
//		day.click();
//        
        WebElement day = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/span[1]/div[1]/div[1]/div[1]/div[1]"));
	              day.click();
                   day.click();
                    Thread.sleep(4000);
                    
                   driver.findElement(By.xpath("//*[@id='react-select-2--option-20']")).click();
                    Thread.sleep(2000);
                    //react-select-3--option-8
                    
                   // WebElement month=driver.findElement(By.xpath("(//*[@class='Select-placeholder'])[1]"));
                   // month.click();
                    
                   // driver.findElement(By.xpath(""))
                    
                    
                   // driver.findElement(By.xpath("//*[@id='react-select-3--option-8']")).click();
                   // Thread.sleep(2000);
	              //Actions act = new Actions(driver);
	              //act.doubleClick(day);
	              // day.getAttribute("21");
	              
	              //WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(100));
	              //WebElement click1 =wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//body/div[@id='content']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/span[1]/div[1]/div[1]/div[1]/div[1]")));
	              //WebElement click1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("21")));
	              //click1.click();
	              
	              //Select aa=new Select(day);
	              //aa.selectByValue("21");
        
       // WebElement year = driver.findElement(By.xpath("(//*[@class='Select-placeholder'])[1]"));
                  //  year.click();
                  //  Thread.sleep(2000);
                    
                    // driver.findElement(By.xpath("//*[@id='react-select-4--option-31']")).click();
                    // Thread.sleep(2000);
                    
                    
                    // driver.findElement(By.xpath("//*[text()='Next']")).click();
                    // Thread.sleep(1000);
                    
                  
                    //WebElement click233= driver.findElement(By.xpath("//*[@class='email-inpt-control']"));
                    
                    //Thread.sleep(2000);
                    
                    //driver.close();
                    
                   // WebElement click232= driver.findElement(By.xpath("//*[@class='email-inpt-control']"));
                    
                    //click232.sendKeys("skkdhdjdj@gmail.com");
                    
                    //driver.findElement(By.xpath("//*[@placeholder='please enter email address']")).sendKeys("testwaeea122@gmail.com");
//                    driver.findElement(By.xpath("//*[@class='email-inpt-control']")).sendKeys("testwaeea122@gmail.com");
//                    Thread.sleep(1000);
//                    
//                    driver.findElement(By.xpath("//*[@class='email-buttonbox']")).click();
//                    Thread.sleep(1000);
                    
                    
                    //driver.get("https://qa2.snapmint.com/plugin/snap_checkout/qa.html?cv2=true&id=108772&merchant_id=4&message=Success&mobile=9822115544&status=Success&token=2CzGuRGNvs1aob3fYV5t");
                    //Thread.sleep(1000);
                    
                   driver.findElement(By.xpath("//*[type()='radio']")).click();
                    
                    //WebElement dev = driver.findElement(By.xpath("//button"));
                    	//	dev.click();
                    
                    
                    
                    //driver.findElement(By.xpath("(//*[@class='buy-on-emi cursor-pointer'])[1]")).click();
                    
                    driver.findElement(By.xpath("(//*[contains(@class,'buy-on-emi cursor-pointer')])[1]")).click();
                    Thread.sleep(5000);
                    
                    driver.findElement(By.xpath("//button[text()='Pay ₹299 to Confirm Order']")).click();
                    
                    driver.findElement(By.xpath("//*[@class='mitc_btn blue_btn_box']")).click();
                    
                    //driver.findElement(By.xpath("//input[@name='vpa')").sendKeys("7777777777@paytm");
                    
                    driver.findElement(By.xpath("//input[@name='vpa']")).sendKeys("7777777777@paytm");
                    		
                   
                    
                    //driver.findElement(By.xpath("//span[@class='pd-right verify']")).click();
                    driver.findElement(By.xpath("//*[text()='Verify']")).click();
                    
                    driver.findElement(By.xpath("//button[@class='dt-pay-blue-botton pay-blue-botton']")).click();
                    Thread.sleep(2000);
                    
                    
                    
                    
                    
//                    driver.findElement(By.xpath("//button[@class='dt-pay-blue-botton pay-blue-botton']")).click();
//                    Thread.sleep(2000);
                    		
                    //List<WebElement> options=driver.findElements(By.xpath("////body/div[@id='content']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/span[1]/div[1]/div[1]/div[1]/div[1]"));                
                    
//                    int count=options.size();
//                    
//                    for(int i=0;i<count;i++) {
//                    	
//                    	WebElement f=options.get(i);
//                    	String link=f.getAttribute("inner HTML");
//                    	
//                    	System.out.println(link);
//                    
//                    	if(link.equalsIgnoreCase("4"))
//                    	{
//                    		f.click();
//                    		break;
//                    	}
//            
//                    }
//                    
                    //Thread.sleep(2000);
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    //WebElement day2 = driver.findElement(By.xpath("//*[@class='//*[@class='Select-value']']"));
	                          //day2.click();
                                          
        //Thread.sleep(2000);
        //JavascriptExecutor js1=(JavascriptExecutor)driver;
		//js1.executeScript("window.scrollBy(0,2000)","");
        
        //driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/span[1]/div[1]/div[1]/div[1]/div[1]")).click();

		//driver.findElement(By.xpath("//body/div[@id='content']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/span[1]/div[1]/div[1]/div[1]/div[1]")).click();
	}

}
