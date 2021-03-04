package MinhUtilsTests;

import com.rationaleemotions.page.*;
import MinhUtilsData.InitData;

public class UtilsTest{
	public static void main(String[] args) {
		InitData Data = new InitData();
		//Init Data = new Init(String_CustomUrl, String_CustomJsonFolder, String_JsonFile);
        PageObject SignIn = new PageObject(Data.Driver(), Data.getJson());

		TextField apEmailText = SignIn.getTextField("apEmailText");
		//enter in actions that need to be tested. Example, uncomment the line below:
		apEmailText.type("email");
		GenericElement continueButton = SignIn.getButton("continueButton");
		//enter in actions that need to be tested. Example, uncomment the line below:
		continueButton.click();

	}
}
