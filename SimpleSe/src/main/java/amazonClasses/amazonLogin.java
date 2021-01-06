package amazonClasses;

import org.openqa.selenium.WebDriver;
import com.rationaleemotions.page.Button;
import com.rationaleemotions.page.PageObjectMod;
import com.rationaleemotions.page.TextField;

public class amazonLogin {
	public static void login(WebDriver driver, String email, String password){
		//objects
		PageObjectMod login = new PageObjectMod(driver, "PageObjects/SignInPageMod.json");
		//email
		if (email == "example@email.com") {email = "edit String email in amazonBuyTest.java";}
		TextField emailField = login.getTextField("ap_email_Element");		
		emailField.type(email);
		Button continueButton = login.getButton("continue_Element");
		continueButton.click();
		//password
		TextField passField = login.getTextField("ap_password_Element");
		passField.type(password);
		Button signInButton = login.getButton("signInSubmit_Element");
		signInButton.click();
	}
}
