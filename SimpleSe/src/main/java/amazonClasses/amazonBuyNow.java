package amazonClasses;

import org.openqa.selenium.WebDriver;

import com.rationaleemotions.page.Button;
import com.rationaleemotions.page.PageObjectMod;

public class amazonBuyNow {
	public static void clickBuyNow(WebDriver driver){
		PageObjectMod Product = new PageObjectMod(driver, "PageObjects/ProductPageMod.json");
		Button buynowbutton = Product.getButton("buy-now-button_Element");
		buynowbutton.click();
		Button ProtectionPlanDecline = Product.getButton("siNoCoverage-announce_Element");
		ProtectionPlanDecline.click();
	}
}
