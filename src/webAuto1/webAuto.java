package webAuto1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webAuto {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		driver.get("https://web.qa.snapmint.com/c/televisions-on-emi");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		//Thread.sleep(12000);
		
		//driver.findElement(By.xpath("(//*[@class='mob-buy-btn text-uppercase'])[1]")).click();
		driver.findElement(By.xpath("(//div[text()='BUY NOW'])[1]")).click();
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//div[@class='buy-on-emi cursor-pointer]")).click();
		
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("iframe");
		
		//List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
		//System.out.println("Total number of iframes are " + iframeElements.size());
		//driver.switchTo().frame("tag-manager");
		//driver.switchTo().frame(2);
		
		//driver.switchTo().frame("AW-876772125/6AJcCKTx14ACEJ32iaID");
		//driver.switchTo().frame("_hjSafeContext_92253063");
	   // driver.switchTo().frame("_we_wk_data_store");
		//driver.switchTo().frame("webengage-engagement-callback-frame");
		//driver.switchTo().frame("tag-manager");
	    
		//driver.findElement(By.xpath("//*[@class='buy-on-emi cursor-pointer]/parent::div")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div/div/div/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div/div/div")).click();
		//driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/div/div/div/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div/div/div")).click();
		//*[@class='buy-on-emi cursor-pointer'][1]
				//driver.findElement(By.xpath("//*[@class='buy-on-emi cursor-pointer'][1]")).click();
				
				//driver.findElement(By.xpath("(//*[@class='buy-on-emi cursor-pointer'])[1]")).click();
		         driver.findElement(By.xpath("(//*[text()='Buy on 2 months EMI'])[1]")).click();		
		//*[@class='buy-on-emi cursor-pointer'])[1]
				Thread.sleep(2000);
				

	}

}
