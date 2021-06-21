package Util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserFactory {
static WebDriver driver;  // global, so all methods can use 

public static WebDriver init() {  // create a methods and set property
	System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
	
	driver = new ChromeDriver(); // Create ChromeDriver object 
	
	//driver.get("https://techfios.com/billing/?ng=login/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	// return driver to transfer
	return driver;
	
}



}
