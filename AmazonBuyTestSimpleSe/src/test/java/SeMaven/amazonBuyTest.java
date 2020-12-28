package SeMaven;

import org.openqa.selenium.WebDriver;

public class amazonBuyTest {
	public static void main(String[] args) {
		String url = "https://www.amazon.com/gp/product/B01N1LL62W/ref=ppx_yo_dt_b_asin_title_o00_s00?ie=UTF8&psc=1";
		String email = "miuyvu@gmail.com";
		String pass = "pass";
		
		WebDriver ChromeBrowser = Driver.chrome(url);
		amazonBuyNow.clickBuyNow(ChromeBrowser);
		amazonLogin.login(ChromeBrowser, email, pass);
	}
}
