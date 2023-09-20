package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass{
	
	/*
	 * @Given("Open the chrome browser") public void openBrowser() { driver = new
	 * ChromeDriver(); driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); }
	 * 
	 * @Given("Load the application url") public void loadUrl() {
	 * driver.get("http://leaftaps.com/opentaps/control/login");
	 * 
	 * }
	 */

	@Given("Enter the username as {string}")
	public void enterUsername(String uname ) {
		driver.findElement(By.id("username")).sendKeys(uname);

	}

	@Given("Enter the password as {string}")
	public void enterPassword(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	}

	@When("click Login button")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@Then("Homepage should be displayed")
	public void verifyHomePage() {
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
	      
		if(displayed) {
			System.out.println("Home page is displayed");
		}
		else {
			System.out.println("Home page is Not displayed");
		}
		}
	
		@But("Error message displayed")
		public void verifyErrorMsg() {
			System.out.println("Error Message is Displayed");
		}
		@When("Click CRMSFA")
		public void clickCrmSfa() {
			driver.findElement(By.linkText("CRM/SFA")).click();
		}
		@When("Click Lead")
		public void clickLead() {
			driver.findElement(By.linkText("Leads")).click();
		}
		@Given("Click CreateLead")
		public void clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		}
		@Given("Enter  the companyName")
		public void enterComapnyName() {
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		}
		
		
	}
