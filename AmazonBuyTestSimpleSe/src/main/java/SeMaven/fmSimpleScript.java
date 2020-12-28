package SeMaven;

import java.io.FileNotFoundException; 
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.io.IOException;
import org.json.simple.parser.*;
import com.rationaleemotions.page.Button;
import com.rationaleemotions.page.PageObject;
import com.rationaleemotions.page.TextField;

public class fmSimpleScript {
	public static void main(String[] args) throws InterruptedException, FileNotFoundException, IOException, ParseException{
	System.setProperty("webdriver.chrome.driver", "C:\\MYN\\WORK\\Altimetrik\\selenium\\chromedriver_win32\\chromedriver.exe");

	//chrome initialize operations
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40,  TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	//load amazon page
	driver.get("https://www.amazon.com/gp/product/B01N1LL62W/ref=ppx_yo_dt_b_asin_title_o00_s00?ie=UTF8&psc=1");
	
	//SimpleSe pageobject
	PageObject Product = new PageObject(driver, "src/test/PageObjects/amazonProductPage.json");
	Button buynowbutton = Product.getButton("buyNowButton");
	buynowbutton.click();

	PageObject emailPage = new PageObject(driver, "src/test/PageObjects/amazonLogin.json");
	TextField emailField = emailPage.getTextField("email");
	emailField.type("miuyvu@gmail.com");

	PageObject continueButton = new PageObject(driver, "src/test/PageObjects/continueButton.json");
	//Button continuebutton = continueButton.getButton("cButton");
	//continuebutton.click();
	driver.findElement(By.xpath("//input[@id='continue']")).click();
	
	PageObject passPage = new PageObject(driver, "src/test/PageObjects/amazonSubmit.json");
	TextField passField = passPage.getTextField("pwd");
	passField.type("22byebye!!");
	//Button submitbutton = emailPage.getButton("submitButton");
	//submitbutton.click();
	driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
	}
}