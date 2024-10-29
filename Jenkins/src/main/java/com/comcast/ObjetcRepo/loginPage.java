package com.comcast.ObjetcRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.GenricUtilty.fileUtility;

public class loginPage {
	WebDriver driver;
	public loginPage(WebDriver driver) {
		this.driver=driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name="user_name")
	private WebElement username;
	
	@FindBy(name="user_password")
	private WebElement password;
	
	@FindBy(id="submitButton")
	private WebElement submit;
	
	public WebElement getUsername() {
		return username;
	}



	public WebElement getPassword() {
		return password;
	}



	public WebElement getSubmit() {
		return submit;
	}



	
	

	
	public void login(String URL, String UN,String PW) throws Throwable {
	driver.get(URL);
	username.sendKeys(UN);
	password.sendKeys(PW);
	password.submit();	
}
	
	

}
