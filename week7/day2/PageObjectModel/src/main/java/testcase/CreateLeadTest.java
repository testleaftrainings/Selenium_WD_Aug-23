package testcase;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class CreateLeadTest extends ProjectSpecificMethod {
	@Test
	public void runCreateLead() {
		System.out.println(driver);
		LoginPage lp =new LoginPage(driver);
		lp.enterUserName()
		.enterPassword()
		.clickLogin()
		.clickCrmSfa()
		.clickLead()
		.clickCreateLead()
		.enterCompanyName()
		.enterFirstName()
		.enterLastName()
		.clickCreateLeadButton()
		.verifyFirstName();
		
	}

}
