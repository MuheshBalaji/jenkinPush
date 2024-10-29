package com.comcast.ObjetcRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.BaseUtility.BaseUtilityContact;
import com.comcast.GenricUtilty.webDriuverUtility;

public class createContact extends BaseUtilityContact{
	WebDriver driver;
	webDriuverUtility web = new webDriuverUtility();

	public createContact(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@title=\"Create Contact...\"]")
	private WebElement addnew;

	@FindBy(name = "firstname")
	private WebElement fname;

	@FindBy(name = "lastname")
	private WebElement lname;

	@FindBy(xpath = "//input[@title=\"Save [Alt+S]\"]")
	private WebElement save;

	public WebDriver getDriver() {
		return driver;
	}

	public webDriuverUtility getWeb() {
		return web;
	}

	public WebElement getAddnew() {
		return addnew;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getSave() {
		return save;
	}

	public void crtcntct() {
		HomePage hp = new HomePage(driver);
		hp.getCrtcntct().click();
		addnew.click();
		fname.sendKeys("Muhesh"+web.randomnum(100)+"");
		lname.sendKeys("Balaji"+web.randomnum(100)+"");
		save.click();

	}

}
