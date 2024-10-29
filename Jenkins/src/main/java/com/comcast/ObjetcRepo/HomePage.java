package com.comcast.ObjetcRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
	@FindBy(xpath = "//a[.='Organizations']")
	private WebElement crtOrg;
	
	@FindBy(xpath = "//a[.='Contacts']")
	private WebElement crtcntct;
	
	public WebElement getCrtcntct() {
		return crtcntct;
	}
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement logIcon;
	
	@FindBy(xpath = "//a[.='Sign Out']")
	private WebElement logoutBtn;

	public WebElement getLogIcon() {
		return logIcon;
	}

	public WebElement getLogoutBtn() {
		return logoutBtn;
	}
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getCrtOrg() {
		return crtOrg;
	}
	
	public void signout() {
		logIcon.click();
		logoutBtn.click();
	}

}
