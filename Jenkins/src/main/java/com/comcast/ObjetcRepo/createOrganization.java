package com.comcast.ObjetcRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.BaseUtility.BaseUtilityOrg;
import com.comcast.GenricUtilty.webDriuverUtility;

public class createOrganization extends BaseUtilityOrg  {
	WebDriver driver;
	webDriuverUtility web=new webDriuverUtility();
	

	 public createOrganization(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	 
	 @FindBy(xpath = "//img[@title=\"Create Organization...\"]")
		private WebElement addnew;
	 
	 @FindBy(name="accountname")
	 private WebElement ogname;
	 
	 @FindBy(xpath = "//input[@title=\"Save [Alt+S]\"]")
	 private WebElement save;
	 
	 
	 public WebDriver getDriver() {
		return driver;
	}

	

	public WebElement getAddnew() {
		return addnew;
	}

	public WebElement getOgname() {
		return ogname;
	}

	public WebElement getSave() {
		return save;
	}

	public void crtorg() {
	 HomePage hp=new HomePage(driver);
	 hp.getCrtOrg().click();
	getAddnew().click();
	getOgname().sendKeys("Hyper_Shift_Autos-Branch-00"+web.randomnum(100)+"");
	getSave().click();
	}
	 
	
	 
	
	

}
