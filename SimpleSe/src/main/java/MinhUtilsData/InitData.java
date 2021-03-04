package MinhUtilsData;

import org.openqa.selenium.WebDriver;

import MinhUtils.Driver;

public class InitData {
	public String Url = "https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fsign%2Fs%3Fk%3Dsign%2Bin%26page%3D3%26ref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&";
	public String JsonFolder = "PageObjects";
	public String JsonFile = "NewTest.json";
	
	public InitData () {
	}
	
	public InitData (String CustomUrl, String CustomJsonFolder, String CustomJsonFile) {
		if (CustomUrl != "") {Url = CustomUrl;}
		if (CustomJsonFolder != "") {JsonFolder = CustomJsonFolder;}
		if (CustomJsonFile != "") {JsonFile = CustomJsonFile;}
	}
	public String getJson() {
		return JsonFolder + "/" + JsonFile;
	}

	public String getUrl() {
		return Url;
	}

	public void setUrl(String url) {
		Url = url;
	}

	public String getJsonFolder() {
		return JsonFolder;
	}

	public void setJsonFolder(String jsonFolder) {
		JsonFolder = jsonFolder;
	}

	public String getJsonFile() {
		return JsonFile;
	}

	public void setJsonFile(String jsonFile) {
		JsonFile = jsonFile;
	}
	public WebDriver Driver() {
		return Driver.chrome(this.getUrl());
	}
	
}
