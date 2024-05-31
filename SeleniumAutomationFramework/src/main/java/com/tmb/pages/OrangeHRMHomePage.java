package com.tmb.pages;



import org.openqa.selenium.By;

import com.tmb.enums.WaitStrategy;

public class OrangeHRMHomePage extends BasePage{

	private final By linkwelcome = By.xpath("//p[@class='oxd-userdropdown-name']");
	private final By linklogout = By.xpath("//a[text()='Logout']");

	public OrangeHRMHomePage clickWelcome() {
		click(linkwelcome,WaitStrategy.CLICKABLE,"Welcome");
		return this;
	}

	public OrangeHRMLoginPage clickLogOut() {
		click(linklogout,WaitStrategy.CLICKABLE,"LogOut");
		return new OrangeHRMLoginPage();
	}
}
