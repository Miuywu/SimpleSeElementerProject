package MinhUtilsTests;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.remote.MobileCapabilityType;

public class AndroidXpathTest {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		//capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");		
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability(CapabilityType.VERSION, "11.0");
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Android");
		//capabilities.setCapability("appPackage", "com.google.youtube");
		capabilities.setCapability("appActivity", "com.google.android.youtube/com.google.android.apps.youtube.app.WatchWhileActivity");
		//AndroidDriver driver;
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		WebElement lib = driver.findElementByXPath("//android.widget.Button[@content-desc=\"Library\"]");
		lib.click();
		WebElement subs = driver.findElementByXPath("//android.widget.Button[@content-desc=\"Subscriptions\"]");
		subs.click();
		WebElement not = driver.findElementByXPath("//android.widget.Button[@content-desc=\"Notifications\"]");
		not.click();
		WebElement expl = driver.findElementByXPath("//android.widget.Button[@content-desc=\"Explore\"]");
		expl.click();
		WebElement home = driver.findElementByXPath("//android.widget.Button[@content-desc=\"Home\"]");
		home.click();
		WebElement srch = driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"Search\"]");
		srch.click();
		WebElement sTxt = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.EditText");
		sTxt.sendKeys("adb123");
		driver.close();	
	}
}
