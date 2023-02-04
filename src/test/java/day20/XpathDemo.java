package day20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {


		//System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		//WebDriver.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		//Open app
		driver.get("https://demo.opencart.com/");
	    driver.manage().window().maximize();
	    
       String productname=driver.findElement(By.xpath("//a[text()='MacBook']")).getText();
	    
	   //String productname= driver.findElement(By.xpath(html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/img[1]).getText();
       System.out.println(productname);
       
       driver.quit();

	}

}
