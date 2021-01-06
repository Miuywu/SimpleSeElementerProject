package amazonClasses;

import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;

public class Driver {
	public static WebDriver chrome(String url){
		System.setProperty("webdriver.chrome.driver", "C:\\MYN\\WORK\\Altimetrik\\selenium\\chromedriver_win32\\chromedriver.exe");
		//chrome initialize operations
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20,  TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//load amazon page
		driver.get(url);
		return driver;
	}
}