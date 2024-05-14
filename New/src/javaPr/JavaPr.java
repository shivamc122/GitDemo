package javaPr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaPr {

	public static void main(String[] args) {
	
WebDriver driver=new ChromeDriver();

driver.get("https://web.qa.snapmint.com/c/televisions-on-emi");
driver.manage().window().maximize();


	}

}
