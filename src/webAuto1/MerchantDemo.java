package webAuto1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MerchantDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://qa2.snapmint.com/merchant-demo");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.switchTo().alert().sendKeys("snapmint");
		Alert promt=driver.switchTo().alert();
		String s1=promt.getText();
		System.out.println(s1);
		promt.sendKeys("snapmint");
		Thread.sleep(2000);
		promt.accept();
		

	}

}
