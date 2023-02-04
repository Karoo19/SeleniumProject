package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links:"+links.size());   //48
		
		int brokenlinks=0;
		for(WebElement linkEle:links)
			 {
			String hrefAttValue=linkEle.getAttribute("href");
			if (hrefAttValue==null || hrefAttValue.isEmpty())
			{
				System.out.println("href attribute value is empty.");
			}
			URL linkurl=new URL(hrefAttValue);      //convert string --> URL format
		}

	}

}
