package MinhUtilsTests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AndroidAccIdTest {
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
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		WebElement lib = driver.findElementByAccessibilityId("Library");
		lib.click();
		WebElement subs = driver.findElementByAccessibilityId("Subscriptions");
		subs.click();
		WebElement not = driver.findElementByAccessibilityId("Notifications");
		not.click();
		WebElement expl = driver.findElementByAccessibilityId("Explore");
		expl.click();
		WebElement home = driver.findElementByAccessibilityId("Home");
		home.click();
		WebElement srch = driver.findElementByAccessibilityId("Search");
		srch.click();
		WebElement sTxt = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.EditText");
		sTxt.sendKeys("adb123");
		driver.close();
	}
}
