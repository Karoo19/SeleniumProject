package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalCommand {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32\\chromedriver.exe");
		
				//WebDriver.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				
				
				//Open app
				driver.get("https://demo.nopcommerce.com/register");
			    driver.manage().window().maximize();
			    
			    //isDisplayed   isEnabled
			   // WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
			   // System.out.println("display status of logo:"+logo.isDisplayed());
			    
			    //boolean status=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
			   // System.out.println(status);
			    
			   // WebElement searchbox=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
			    
			    //System.out.println("Display status:"+searchbox.isDisplayed());
			    //System.out.println("Enable status:"+ searchbox.isEnabled());
			    
			    //isSelected()
			    WebElement male_rd=driver.findElement(By.xpath("//input[@id='gender-male']"));
			    WebElement female_rd=driver.findElement(By.xpath("//input[@id='gender-female']"));

			    //Before Selected
			    System.out.println("BeforeSelected......");
			    System.out.println(male_rd.isSelected());   //false
			    System.out.println(female_rd.isSelected());  //true
			    
			    //After Selected of male radio button
			    System.out.println("After selection of male radio button..........");
			    male_rd.click();
			    System.out.println(male_rd.isSelected());     //true
			    System.out.println(female_rd.isSelected());   //false
			    
			    
			  //After Selected of female radio button
			    System.out.println("After selection of male radio button..........");
			    male_rd.click();
			    System.out.println(female_rd.isSelected());   //false
			    System.out.println(female_rd.isSelected());   //true


	}

}