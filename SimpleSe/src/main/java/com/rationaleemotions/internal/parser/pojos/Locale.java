package com.rationaleemotions.internal.parser.pojos;

import static com.google.common.base.Preconditions.checkArgument;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.rationaleemotions.utils.StringUtils;

public class Locale {

  private static final String ATTRIBUTE_IS_MISSING = " attribute is missing.";

  @SerializedName("name")
  @Expose
  private String name;

  @SerializedName("locator")
  @Expose
  private String locator;
  
  @SerializedName("AllLocators")
  @Expose
  private List<String> AllLocators;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLocator() {
    return locator;
  }

  public void setLocator(String locator) {
    this.locator = locator;
  }

  public void validate() {
	System.out.println("VALIDATEMOD PRINT");
	if (AllLocators != null) {
		System.out.println("Locators available for: " + locator);
		for (int i = AllLocators.size() - 1; i > 0; i--) {
			locator = AllLocators.get(i);
			if (StringUtils.isNotBlank(locator) == true) {
				System.out.println(locator);
			}
		}
	}
    checkArgument(StringUtils.isNotBlank(name), "name" + ATTRIBUTE_IS_MISSING);
    //checkArgument(StringUtils.isNotBlank(locator), "locator" + ATTRIBUTE_IS_MISSING);
    //tries to find other locators before error msg
    if (StringUtils.isNotBlank(locator) != true) {
    	for (int i = AllLocators.size() - 1; i > 0; i--) {
    		locator = AllLocators.get(i);
    		if (StringUtils.isNotBlank(locator) == true) {break;}
    	}
    }
    checkArgument(StringUtils.isNotBlank(locator), "locator" + ATTRIBUTE_IS_MISSING);
  }

  @Override
  public String toString() {
    return "Locale{" +
        "name='" + name + '\'' +
        ", locator='" + locator + '\'' +
        '}';
  }
}
