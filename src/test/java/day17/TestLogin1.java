package day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin1 {

	public static void main(String[] args) {


		//System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		
		//1) Launch browser
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		
		//2) open url on the browser
		driver.get("https://opensource-demo.orangehrmlive.com/");

		//3) Provide username  - Admin
		//WebElement.textUsername=driver.findElement(By.name("Username"));
		//textUsername.sendKeys("Admin");
		driver.findElement(By.name("username")).sendKeys("Admin");



	}

}
