package MinhUtils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.openqa.selenium.WebDriver;
import com.fasterxml.jackson.databind.ObjectMapper;
import MinhUtils.Driver; 

public class Generator {
	private static String header = 
	"package MinhUtilsTests;\n\n" + 
	"import org.openqa.selenium.By;\n" + 
	"import org.openqa.selenium.WebDriver;\n" + 
	"import org.openqa.selenium.WebElement;\n" + 
	"import com.rationaleemotions.page.Button;\n" + 
	"import com.rationaleemotions.page.GenericElement;\n" + 
	"import com.rationaleemotions.page.PageObject;\n" + 
	"import com.rationaleemotions.page.TextField;\n";
	@SuppressWarnings("unused")
	private static String defaultBody = 
			"	public static void main(String[] args) {\n" + 
			"		String url = \"google.com\";\n" + 
			"		String email = \"example@email.com\";\n" +  
			"		WebDriver ChromeBrowser = Driver.chrome(url);\n" + 
			"\n" + 
			"		// Please replace the String with json file address\n" + 
			"		PageObjectMod Product = new PageObjectMod(ChromeBrowser, \"json_file_address\");\n" + 
			"\n" + 
			"       Button buynowbutton = Product.getButton(\"buy-now-button_Element\");\n" + 
			"		//enter in actions that need to be tested. Example, uncomment the line below:\n" + 
			"		//buynowbutton.click();\n" + 
			"		\n" + 
			"		TextField emailBox = Product.getTextField(\"email_Element\");\n" + 
			"		//enter in actions that need to be tested. Example, uncomment the line below:\n" + 
			"		//emailBox.type(email);\n" + 
			"\n" + 
			"	}\n" + 
			"}\n";
	
	public static void newTest(String filename, String json, String url) {
		String classname = "public class " + filename + "{\n";
	    try {
	      File myObj = new File("src\\main\\java\\MinhUtilsTests\\" + filename);
	      if (myObj.createNewFile()) {
	    	  System.out.println("test file created: " + myObj.getName());
	    	  contentWrite(filename, classname, json, url);
	      } else {
	    	  System.out.println("File already exists.");
	      }
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	}
	public static void contentWrite(String filename, String classname, String json, String url) {
		try {
			FileWriter myWriter = new FileWriter("src\\main\\java\\MinhUtilsTests\\" + filename);
			//System.out.print(header);
			myWriter.write(header + "public class " + filename.substring(0, filename.length() - 5) + "{\n" + "	public static void main(String[] args) {\n");
			myWriter.write(dynamicBody(json, url));
			myWriter.write("\n" + "	}\n" + "}\n");
			myWriter.close();
			System.out.println("Successfully wrote test template.");
		} 
		catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
	public static String dynamicBody(String filename, String url) throws IOException {
		String jsonStr = jsonReader(filename);
		String body = "";
		String elemTemplate = 
				"		GenericElement buynowbutton = Product.getButton(\"buy-now-button_Element\");\n" + 
				"		//enter in actions that need to be tested. Example, uncomment the line below:\n" + 
				"		//buynowbutton.click();\n";
		try {
		     JSONObject jsonObject = new JSONObject(jsonStr);
		     JSONArray elems = jsonObject.getJSONArray("elements");
		     String pagename = (String) jsonObject.get("name");
		     body = body + "		String url = \"" + url + "\";\n" +
		     		"		String email = \"example@email.com\";\n" + 
		     		"		String pass = \"pass\";\r\n" + 
		     		"		WebDriver ChromeBrowser = MinhUtils.Driver.chrome(url);\n" + 
		     		"		\n" + 
		     		"		// Please replace the String with json file address\n";
		     body = body + "        PageObject " + pagename + " = new PageObject(ChromeBrowser, \"" + filename + "\");\n\n"; 
		     
		     for(int i = 0; i < elems.toList().size() ; i++)
		     {
		    	 JSONObject objects = elems.getJSONObject(i);
		    	 //System.out.println(objects);
		    	 String name = objects.get("name") + "";
		    	 body = body + 
		    			 "		GenericElement " + name.replaceAll("-" , "").replaceAll("_", "") + " = "+ pagename + ".getButton(\"" + name +"\");\n" + 
		    			 "		//enter in actions that need to be tested. Example, uncomment the line below:\n" +
		    			 "		//"+ name.replaceAll("-" , "").replaceAll("_", "")+ ".click();\n" ;
		     }
	    	 return body;
		}catch (JSONException err){
			System.out.println(err);
		}
		return "error";
	}
	public static String jsonReader(String jsonFile) throws IOException {
		String path = "";
		try (Stream<String> lines = Files.lines(Paths.get(path + jsonFile))) {
        	//prints json string
            String content = lines.collect(Collectors.joining(System.lineSeparator()));
            //System.out.println(content);
            return (content);
		}
	}
}
