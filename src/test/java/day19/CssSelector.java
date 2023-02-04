package day19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32\\chromedriver.exe");
		
				//WebDriver.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				
				
				//Open app
				driver.get("https://demo.nopcommerce.com/");
			    driver.manage().window().maximize();
			    
		       // tag & id
			   //driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("MacBook");
			   //driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Apple MacBook Pro 13-inch");
			    
			    //tag & class
			   // driver.findElement(By.cssSelector("input.search-box-text ui-autocomplete-input")).sendKeys("Apple MacBook Pro 13-inch");
			   // driver.findElement(By.cssSelector(".search-box-text")).sendKeys("Apple MacBook Pro 13-inch");
			    
			    //tag & attribute
			   // driver.findElement(By.cssSelector("input[name='q']")).sendKeys("Apple MacBook Pro 13-inch");
			   // driver.findElement(By.cssSelector("[name='q']")).sendKeys("Apple MacBook Pro 13-inch");
			    
			    //tag class & attribute
			    driver.findElement(By.cssSelector("input.search-box-text[name=\'q\']")).sendKeys("Apple MacBook Pro 13-inch");

	}

}
