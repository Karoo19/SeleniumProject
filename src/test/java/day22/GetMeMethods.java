package day22;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMeMethods {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		//WebDriver.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		//Open app
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.manage().window().maximize();
	    
	   /* System.out.println("title of the page:"+driver.getTitle());
	    System.out.println("Current URL:"+driver.getCurrentUrl());
	    
	    System.out.println("Page source..............");
	    System.out.println(driver.getPageSource());
	    
	    System.out.println(ps);
	    System.out.println(ps.contains("html"));*/
	    
	    //System.out.println(driver.getWindowHandle());    //CDwindow-1C56E160585517B4C2FE0B1A916B33E3
	                                                     //CDwindow-BE24CA05AB8309AF129620C067DB4D94
	                                                     //CDwindow-A89E18BE420CFB515BAF4C4192E44E42
	    Thread.sleep(3000);
	    driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	    
	    Set<String> windowids=driver.getWindowHandles();      //CDwindow-AEC9A43796C1B9EDF4A1AAB13614891A
	                                                          //CDwindow-38E047037F8AEED9F6AFC926EED7F1DB
	    
	    for(String winid:windowids)
	    {
	    	System.out.println(winid);
	    }

	}

}
