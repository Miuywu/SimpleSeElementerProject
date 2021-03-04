package MinhUtilsTests;

import MinhUtils.Generator;;

public class TestGenerate {
	public static void main(String[] args) {
		String url = "https://www.amazon.com/Apple-Certified-iPhone-Charger-Lightning/dp/B0829ZBTNM/?_encoding=UTF8&pd_rd_w=TKKFW&pf_rd_p=6c7a51c8-1ba8-4aad-8414-c2a22fa8b313&pf_rd_r=YJFQQPDF872JW5MF64TM&pd_rd_r=f27b0438-b921-4d8e-945b-001e2da12d81&pd_rd_wg=mdUQ9&ref_=pd_gw_ci_mcx_mr_hp_d";
		Generator.newTest("USBTestScript.java", "PageObjects/USB.json", url);
	}
}
