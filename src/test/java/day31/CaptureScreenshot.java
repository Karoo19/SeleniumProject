package day31;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenshot {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		/*//Capture full page screenshot
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("C:\\Automation\\WorkSpaceEclipse\\seleniumproject\\Screenshot\\fullpage.png");
		
		FileUtils.copyFile(src, trg);*/
		
		//Capture screenshot of specific area from webpage -- selenium4+
		
		WebElement featuredproducts=driver.findElement(By.xpath("(//div[@class='product-grid home-page-product-grid'])[1]"));
		
		File src=featuredproducts.getScreenshotAs(OutputType.FILE);
		File trg=new File("C:\\Automation\\WorkSpaceEclipse\\seleniumproject\\Screenshot\\featuredproducts.png");
		
		FileUtils.copyFile(src,  trg);

		
	}

}
