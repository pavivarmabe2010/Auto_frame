package com.tmb.constants;

import com.tmb.enums.ConfigProperties;
import com.tmb.utils.PropertyUtils;

public final class FrameworkConstants {

	//never hardcode
	//keep the thing in right place 

	//Class or interface name -> RaviSeleniumTesting 
	//Final constants values -> RAVIVSELENIUMTESTING or  RAVI_SELENIUM_TESTING
	//method name -> raviSeleniumTesting 
	//package name -> raviseleniumtesting 

	private FrameworkConstants() {

	}

	private static final String RESOURCESPATH = System.getProperty("user.dir")+"/src/test/resources";
	private static final String CHROMEDRIVERPATH = RESOURCESPATH +"/executeables/chromedriver.exe";
	private static final String CONFIGFILEPATH = RESOURCESPATH +"/config/config.properties";
	private static final int EXPLICITWAIT = 10;
	public static final String EXTENTREPORTFOLDERPATH = System.getProperty("user.dir")+ "/extent-test-output";
	private static String extentReportFilePath = "";	
	private static final String EXCELPATH = RESOURCESPATH + "/excel/testdata.xlsx";
	public static final String RUNMANAGERSHEET = "RUNMANAGER";
	public static final String ITERATIONDATASHEET ="DATA";
	
	public static String getExtentreportfilepath() throws Exception {
		if(extentReportFilePath.isEmpty()) {
			extentReportFilePath = createReportPath();
		}		
		return extentReportFilePath;
	}


	private static String createReportPath() throws Exception {
		if(PropertyUtils.get(ConfigProperties.OVERRIDEREPORTS).equalsIgnoreCase("no"))
		{
			return EXTENTREPORTFOLDERPATH+"/"+System.currentTimeMillis()+"/index.html"; 
		}
		else {
			return EXTENTREPORTFOLDERPATH+ "/index.html";
		}
	}

	public static String getExcelpath() {
		return EXCELPATH;
	}

	public static String getExtentreportfolderpath() {
		return EXTENTREPORTFOLDERPATH;
	}

	public static String getRunmanagersheet() {
		return RUNMANAGERSHEET;
	}
	
	public static String getIterationdatasheet() {
		return ITERATIONDATASHEET;
	}
	
	/*
	 * public static String getExtentreportpath() throws Exception {
	 * if(PropertyUtils.get(ConfigProperties.OVERRIDEREPORTS).equalsIgnoreCase("yes"
	 * )) { return EXTENTREPORTPATH+"/"+System.currentTimeMillis()+"index.html"; }
	 * else { return EXTENTREPORTPATH+"/"+"index.html"; } }
	 */
	public static int getExplicitwait() {

		return EXPLICITWAIT;
	}


	public static String getChromedriverpath() {
		return CHROMEDRIVERPATH;
	}

	public static String getConfigFilepath() {
		return CONFIGFILEPATH;
	}

}
