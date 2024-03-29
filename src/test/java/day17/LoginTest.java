package day17;

import org.openqa.selenium.By;

/*
1) Launch browser
2) open url
	https://opensource-demo.orangehrmlive.com/
3) Provide username  - Admin
4) Provide password  - admin123
5) Click on Login button 
6) Verify the title of dashboard page   
	Exp title : OrangeHRM
7) close browser*/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		
		//1) Launch browser
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		
		//2) open url on the browser
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		

		//3) Provide username  - Admin
		//WebElement.textUsername=driver.findElement(By.name("Username"));
		//textUsername.sendKeys("Admin");
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		//4) Provide password  - admin123
		driver.findElement(By.name("password")).sendKeys("Admin123");
		
		//5) Click on Login button
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		//6) Verify the title of dashboard page 
		String act_title=driver.getTitle();
		String exp_title="OrangeHRM";
		
		if(act_title.equals(exp_title))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("failed");
		}
		
		//7) close browser
		//driver.close();
		//driver.quit();
	
	



	}

}
