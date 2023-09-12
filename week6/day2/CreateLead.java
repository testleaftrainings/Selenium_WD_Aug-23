package week6.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethod {
	@Test(dataProvider = "fetchData")
	public void runCreateLead(String cname,String fname,String lname,String pnum) {
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(pnum);
		driver.findElement(By.name("submitButton")).click();

	}
     @DataProvider(name="fetchData")
	public String[][] getData() {
      String[][] data =new String[2][4];
      //1 st set data
      data[0][0]="Testleaf";
      data[0][1]="Princila";
      data[0][2]="Edward";
      data[0][3]="7865467867";
      
      //2 nd set of data
      data[1][0]="Qeagle";
      data[1][1]="Partha Saradi";
      data[1][2]="vengadaraman";
      data[1][3]="7865467865";
      return data;
	}
}





