package testcase;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class LoginTest extends ProjectSpecificMethod {
		
	@Test
	public void runLoginTest() {
		System.out.println(driver);
    LoginPage lp =new LoginPage(driver);
    lp.enterUserName()
    .enterPassword()
    .clickLogin();
    
	}
}
