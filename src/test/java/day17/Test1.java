package day17;

import java.time.Duration;

import org.openqa.selenium.By;

import Selenuimday1101.ChromeDriver;
import Selenuimday1101.WebDriver;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

public class Test1 {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32\\chromedriver.exe");
		//WebDriver.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeouts(Duration.ofSeconds(10));
		driver.manage().timeouts().deleteAllCookies(Duration.ofSeconds(10));
		
		driver.get("https://www.rediff.com/");
		
		driver.findElement(By.linkText("Rediffmail")).click();
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Money")).click();
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Business Email")).click();
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Videos")).click();
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Shopping")).click();
		driver.navigate().back();
		driver.findElement(By.className("signin")).click();
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Create Account")).click();
		
	}

}
