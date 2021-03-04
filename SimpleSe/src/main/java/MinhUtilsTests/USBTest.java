package MinhUtilsTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.rationaleemotions.page.Button;
import com.rationaleemotions.page.GenericElement;
import com.rationaleemotions.page.PageObject;
import com.rationaleemotions.page.TextField;
public class USBTest{
	public static void main(String[] args) {
		String url = "https://www.amazon.com/Apple-Certified-iPhone-Charger-Lightning/dp/B0829ZBTNM/?_encoding=UTF8&pd_rd_w=TKKFW&pf_rd_p=6c7a51c8-1ba8-4aad-8414-c2a22fa8b313&pf_rd_r=YJFQQPDF872JW5MF64TM&pd_rd_r=f27b0438-b921-4d8e-945b-001e2da12d81&pd_rd_wg=mdUQ9&ref_=pd_gw_ci_mcx_mr_hp_d";
		String email = "example@email.com";
		String pass = "pass";
		WebDriver ChromeBrowser = MinhUtils.Driver.chrome(url);
		
		// Please replace the String with json file address
        PageObject USB = new PageObject(ChromeBrowser, "PageObjects/USB.json");

		GenericElement buyNowButtonGeneric = USB.getButton("buyNowButtonGeneric");
		//enter in actions that need to be tested. Example, uncomment the line below:
		//buyNowButtonGeneric.click();
		GenericElement apEmailGeneric = USB.getButton("apEmailGeneric");
		//enter in actions that need to be tested. Example, uncomment the line below:
		//apEmailGeneric.click();
		GenericElement continueGeneric = USB.getButton("continueGeneric");
		//enter in actions that need to be tested. Example, uncomment the line below:
		//continueGeneric.click();

	}
}
