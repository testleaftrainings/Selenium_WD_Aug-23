package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class MyHomePage extends ProjectSpecificMethod {

	public MyHomePage(ChromeDriver driver) {

		this.driver = driver;
	}
	public LeadPage clickLead() {
		driver.findElement(By.linkText("Leads")).click();
		return new LeadPage(driver);
	}
}
