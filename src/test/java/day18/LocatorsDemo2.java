package day18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo2 {

	public static void main(String[] args) {
		
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		
		//Open app
		driver.get("https://www.nadiaperfume.com/");
	    driver.manage().window().maximize();
	    
	    //Finding numbers of sliders
	    List<WebElement> sliders = driver.findElements(By.className("In-inner"));
	    System.out.println("Number of sliders:"+sliders.size());
	    
	    //Find total numbers of Image in mY Home page
	    List<WebElement> images = driver.findElements(By.tagName("img"));
	    System.out.println("Total number of images:"+images.size());
	    
	    //Find total number of Links
	    List<WebElement> links = driver.findElements(By.tagName("a"));
	    System.out.println("Total number of links:"+links.size());
	    
	    driver.quit();

	}

}
