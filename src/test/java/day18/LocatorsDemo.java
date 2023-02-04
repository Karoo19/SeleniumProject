package day18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32\\chromedriver.exe");
		
				//WebDriverManager.chromedriver().setup();
				//WebDriver driver=new ChromeDriver();
				WebDriver driver=new ChromeDriver();
				
				//Open app
				driver.get("https://www.rediff.com/");
			    driver.manage().window().maximize();
			    
			    //Search box
			    driver.findElement(By.name("srchword")).sendKeys("women dress");
			    
			    //Search button
			    driver.findElement(By.xpath("//*[@id=\'queryTop\']/input")).click();
			    
			    //link text &partial link text
			    //driver.findElement(By.linkText("//*[@id=\"grid_display_21666642\"]/div[1]/div/h4/a/div")).click();
			    driver.findElement(By.partialLinkText("OPUS Bleu")).click();

	}

}
