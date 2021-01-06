package amazonTest;

import org.openqa.selenium.WebDriver;

import amazonClasses.Driver;
import amazonClasses.amazonBuyNow;
import amazonClasses.amazonLogin;

public class amazonBuyTest {
	public static void main(String[] args) {
		String url = "https://www.amazon.com/AutoFocus-Microphone-NexiGo-Streaming-Compatible/dp/B08931JJLV/ref=sr_1_1_sspa?dchild=1&keywords=webcam&qid=1609899322&sr=8-1-spons&psc=1&smid=A1HNC035CZ2MR5&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUEzRUc5OThJVzZNVlhRJmVuY3J5cHRlZElkPUEwMzg3Mzg4MTRVQlpWWko4QzczWCZlbmNyeXB0ZWRBZElkPUEwNzQwMDA4MjRCVkhXTjBMTjRDQiZ3aWRnZXROYW1lPXNwX2F0ZiZhY3Rpb249Y2xpY2tSZWRpcmVjdCZkb05vdExvZ0NsaWNrPXRydWU=";
		String email = "example@email.com";
		String pass = "pass";
		
		WebDriver ChromeBrowser = Driver.chrome(url);
		amazonBuyNow.clickBuyNow(ChromeBrowser);
		amazonLogin.login(ChromeBrowser, email, pass);
	}
}
