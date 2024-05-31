package com.tmb.pages;

import org.openqa.selenium.By;

import com.tmb.enums.WaitStrategy;

public class OrangeHRMLoginPage extends BasePage{

	private final By txtbx_username=By.xpath("//*[@id=\'app\']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input");
	private final By txtbx_password=By.xpath("//*[@id=\'app\']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input");
	private final By button_login=By.xpath("//*[@id=\'app\']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
	
	public  OrangeHRMLoginPage enterUserName(String username) {
		sendKey(txtbx_username, username,WaitStrategy.PRESENCE,"username");
		return this;
	}
	
	public OrangeHRMLoginPage enterPassWord(String password) {
		sendKey(txtbx_password, password,WaitStrategy.PRESENCE,"password");
		return this;
	}
	
	public OrangeHRMHomePage clickLogin() throws InterruptedException {
		click(button_login,WaitStrategy.CLICKABLE,"Login");
		return new OrangeHRMHomePage();
	}
	
	public String getTitle() {
		return getPageTitle();
	}
}
