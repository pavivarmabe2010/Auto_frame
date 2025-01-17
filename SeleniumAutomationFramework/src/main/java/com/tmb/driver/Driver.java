package com.tmb.driver;

import java.io.IOException;
import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.tmb.constants.FrameworkConstants;
import com.tmb.enums.ConfigProperties;
import com.tmb.utils.PropertyUtils;

public final class Driver {
	private Driver() {
		
	}

	public static void initDriver() throws Exception {
		
		if(Objects.isNull(DriverManager.getDriver())) {
			
			System.setProperty("webdriver.chrome.driver",FrameworkConstants.getChromedriverpath());
			
			DriverManager.setDriver(new ChromeDriver());
			DriverManager.getDriver().get(PropertyUtils.get(ConfigProperties.URL));
		}
	}

	public static void quiteDriver() {
		if(Objects.nonNull(DriverManager.getDriver())) {
			DriverManager.getDriver().quit();
			DriverManager.unload();
		}
	}
}
