package com.comcast.org;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.comcast.BaseUtility.BaseUtilityOrg;
import com.comcast.ObjetcRepo.HomePage;
import com.comcast.ObjetcRepo.createOrganization;

public class createOrgtest extends BaseUtilityOrg{
	

	@Test
	 public void createOrgi() throws Throwable {
		System.out.println("Organization created SuccessFully");
		Thread.sleep(700);
		
	}
}
