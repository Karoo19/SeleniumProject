package day27;

import java.time.Duration;

//import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticTableDemo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		// 1)Find total number of rows
		
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size(); //7 preferred
		//int rows=driver.findElements(By.tagName("tr")).size();   //8 preferred only if you have one signle table
		
		System.out.println("number of rows:"+ rows);		
				
		//2)Find total number of columns
		int cols=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		
		//int rows=driver.findElements(By.tagName("tr")).size();   //8 preferred only if you have one signle table
		
		System.out.println("Number of columns:"+cols);
		
		//3)Read specific row & columns
		//String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr[7]//td[1]")).getText();
		//System.out.println(value);    //should be Master JS but here value!!!!
		
		//4)Read data from all rows and columns
		for(int r=2;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
			{
				String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.println(value);
			}
			System.out.println();
		}
		
		//5)Print book names whose author is Amit
		for(int r=2;r<=rows;r++)
		{
			String author=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			System.out.println(author);
		}
		
		
		
		//6)Find some of prices for all books
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
