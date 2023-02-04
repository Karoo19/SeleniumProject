package day24;

import java.awt.Checkbox;
import java.time.Duration;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBoxcheck {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
	
		//select specific one checkbooks
		//driver.findElement(By.xpath("//input[@id='Monday']")).click();


		//total number of checkbooks
		java.util.List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input'and@input='checkbox']"));
		System.out.println("Total number of checkboxex"+checkboxes.size());  //7
		
		//Select all the checkboxes
		for (int i=0; i<checkboxes.size();i++);
		{
			checkboxes.get(0).click();
		}
	        for(WebElement chkbox:checkboxes);
	        {
	       Checkbox.click();
	        }

	
		
	}

}
