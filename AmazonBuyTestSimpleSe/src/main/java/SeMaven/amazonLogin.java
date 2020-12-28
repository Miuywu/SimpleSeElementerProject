package SeMaven;

import org.openqa.selenium.WebDriver;
import com.rationaleemotions.page.Button;
import com.rationaleemotions.page.GenericElement;
import com.rationaleemotions.page.PageObject;
import com.rationaleemotions.page.TextField;

public class amazonLogin {
	public static void login(WebDriver driver, String email, String password){
		//objects
		PageObject login = new PageObject(driver, "src/test/PageObjects/SignInPageMod.json");
		//email
		TextField emailField = login.getTextField("emailField");		
		emailField.type(email);
		Button continueButton = login.getButton("continueButton");
		continueButton.click();
		//password
		TextField passField = login.getTextField("passField");
		passField.type(password);
		Button signInButton = login.getButton("signInButton");
		signInButton.click();
		//driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
	}
}

