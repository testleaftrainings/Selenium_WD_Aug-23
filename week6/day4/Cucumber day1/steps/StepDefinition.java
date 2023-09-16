package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	public ChromeDriver driver;
	@Given("Open the chrome browser")
	public void openBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
	}
	@And("Load the application url")
	public void loadUrl() {
		driver.get("http://leaftaps.com/opentaps/control/login");
		
	}
	@And("Enter the username as demosalesmanager")
	public void enterUsername() {
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
	}
	@And("Enter the password as crmsfa")
	public void enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
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

}
