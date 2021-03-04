package MinhUtils;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.rationaleemotions.utils.StringUtils;

public class LocatorBackup {
	public void validationPrint(String DefaultLocator, List<String> AllLocators) {
		System.out.println("\n                     BACKUP LOCATORS AVAILABLE FOR: " + DefaultLocator);
		String loc = DefaultLocator;
		for (int i = AllLocators.size() - 1; i > 0; i--) {
			loc = AllLocators.get(i);
			if (StringUtils.isNotBlank(loc) == true) {
				System.out.println(loc);
			}
		}
		System.out.println();
	}

	public static String LocatorCheck(String location, WebDriver driver) {
		// skip 'identifier=' find element on web page return full string or extracted
		// locator info for name and id
		String[] type = new String[]{"tagId=", "name=", "xpath=", "css=", "class=", "tagName="};
		for (int a = 0; a < type.length; a++) {
			if (location.startsWith(type[a]) && (driver.findElements(By.id(location.substring(type[a].length()))).size() > 0)) {
				System.out.println(type[a].substring(0, type[a].length() - 1) + " found!");
				if (type[a] == "tagId=" || type[a] == "name=")
					return location.substring(type[a].length());
				return location;
			}
		}
		return "false";
	}

	public static String locatorValidation(String locator, List<String> AllLocators, WebDriver driver) {
		if (LocatorCheck(locator, driver) == "false") {
			System.out.println("Locator type unrecognized or locator does not exist. Using Backups from AllLocators.");
		}
		else {
			return "true";
		}
		for (int i = AllLocators.size() - 1; i > 0; i--) {
			if (LocatorCheck(AllLocators.get(i), driver) != "false") {
				return AllLocators.get(i);
			}
		}
		System.out.println("Backups failed.");
		return "false";
	}
}
