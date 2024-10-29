package com.comcast.BaseUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.comcast.GenricUtilty.fileUtility;
import com.comcast.GenricUtilty.webDriuverUtility;
import com.comcast.ObjetcRepo.HomePage;
import com.comcast.ObjetcRepo.createOrganization;
import com.comcast.ObjetcRepo.loginPage;

public class BaseUtilityOrg {
	
	WebDriver driver =null;
	fileUtility fu=new fileUtility();
	
	
	@BeforeSuite
	public void configBS() {
		System.out.println("Get Connection");
	}
	
	@BeforeClass
	public void configBC() throws Throwable {
		String br=fu.getdatafromfile("br");
		if(br.equals("chrome"))
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
		}
		
		if(br.equals("firefox"))
		{
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		}
		
		if(br.equals("edge"))
		{
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		}
		
	}
	@BeforeMethod
	public void configBM() throws Throwable {
		loginPage lp=new loginPage(driver);
		String url = fu.getdatafromfile("link");
		String UN = fu.getdatafromfile("un");
		String PW = fu.getdatafromfile("pw");
		lp.login(url, UN, PW);
		createOrganization crt=new createOrganization(driver);
		crt.crtorg();
	
	}
	
	@AfterMethod
	public void configAM() {
		HomePage hp=new HomePage(driver);
		hp.getLogIcon().click();
		hp.getLogoutBtn().click();
	}
	
	@AfterClass
	public void configAc() {
		driver.quit();
	}
	
	@AfterSuite
	public void configAs() {
		System.out.println("Close Connection");
	}

}
