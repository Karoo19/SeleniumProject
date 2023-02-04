package day23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitDemo {

	public static void main(String[] args) throws InterruptedException {
		
		//WebDriverManager.chromedriver().setup();
		
				WebDriver driver=new ChromeDriver();
				
				//declaring explicit wait
				WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
				
						
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
							
				WebElement useranme=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
				useranme.sendKeys("Admin");
				
				
				WebElement password=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
				password.sendKeys("admin123");
				
				Thread.sleep(5000);
				driver.close();

	}

}
