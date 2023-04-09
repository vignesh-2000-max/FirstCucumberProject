package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDriver {
	
	private static SeleniumDriver seleniumDriver;
	private static WebDriver driver;
	
	private SeleniumDriver() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	}
	
	public static void setUpDriver() {
		if(seleniumDriver==null) {
			seleniumDriver=new SeleniumDriver();
			
		}
	}
	public static WebDriver getDriver() {
		
		return driver;
	}
	public static void openPage(String url) {
		
		driver.get(url);
	}
	
	public static void tearDown() {
		
		if(driver!=null) {
			driver.quit();
		}
		seleniumDriver =null;
	}
}
