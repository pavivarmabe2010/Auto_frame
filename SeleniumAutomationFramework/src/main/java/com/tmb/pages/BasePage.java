package com.tmb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.tmb.constants.FrameworkConstants;
import com.tmb.driver.DriverManager;
import com.tmb.enums.WaitStrategy;
import com.tmb.factories.ExplicitWaitFactory;
import com.tmb.reports.ExtentLogger;

public class BasePage {

	protected void click(By by,WaitStrategy waitStrategy,String elementname) {
		
		WebElement element = ExplicitWaitFactory.performExplicitWait(waitStrategy, by);
		element.click();
		try {
			ExtentLogger.pass(elementname + " is Clicked",true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	protected void sendKey(By by,String value,WaitStrategy waitStrategy,String elementname) {
		
		WebElement element = ExplicitWaitFactory.performExplicitWait(waitStrategy, by);
		element.sendKeys(value);
		try {
			ExtentLogger.pass(value +" : " + " is entered successfully in " + elementname, true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	protected String getPageTitle() {
		return DriverManager.getDriver().getTitle();
	}
	
	private void explicitlyWaitForElementTobeClickable(By by) {
		new WebDriverWait(DriverManager.getDriver(), FrameworkConstants.getExplicitwait())
			.until(ExpectedConditions.elementToBeClickable(by));
	}
	
	private void explicitlyWaitForElementTobePresent(By by) {
		new WebDriverWait(DriverManager.getDriver(), FrameworkConstants.getExplicitwait())
			.until(ExpectedConditions.presenceOfElementLocated(by));
	}
	
}

