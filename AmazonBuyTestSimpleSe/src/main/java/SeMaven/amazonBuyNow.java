package SeMaven;

import org.openqa.selenium.WebDriver;
import com.rationaleemotions.page.Button;
import com.rationaleemotions.page.PageObject;

public class amazonBuyNow {
	public static void clickBuyNow(WebDriver driver){
		PageObject Product = new PageObject(driver, "src/test/PageObjects/ProductPage.json");
		Button buynowbutton = Product.getButton("buyButton");
		buynowbutton.click();
	}
}
