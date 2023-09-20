package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod {
	
	public LoginPage(ChromeDriver driver) {
		
		this.driver=driver;
		
	}
		
public LoginPage enterUserName() {
	
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	return this;
}	
	
public LoginPage enterPassword() {
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	return this;
}
 
public HomePage clickLogin() {
	driver.findElement(By.className("decorativeSubmit")).click();
	return new HomePage(driver);
}
	
	
	

}
