package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login {

	public static void main(String[] args) {
     
		//Setup the path and launch the browser
		
		ChromeDriver driver =new ChromeDriver(); 
		
		//Load the url
		driver.get("http://leaftaps.com/opentaps/control/logout");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//FindElement and enter the username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		//FindElement and enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//FindElement and click login
		driver.findElement(By.className("decorativeSubmit")).click();
		//Get Title of the page
		String title = driver.getTitle();
		//print the title
		System.out.println(title);
		//click crmsfa
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Click Lead
		driver.findElement(By.linkText("Leads")).click();
		//click createlead
		driver.findElement(By.linkText("Create Lead")).click();
		//Enter Company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		//Enter first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Princila");
		//Enter Last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("edward");
		
		//click CreateLead
		
		driver.findElement(By.name("submitButton")).click();
		
		//Verify the text
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		//print the text
		System.out.println(text);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
