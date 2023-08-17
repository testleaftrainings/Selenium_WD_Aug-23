package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/select.xhtml");
		// Step:1 Locate the dropdown web element
		WebElement drop1 = driver.findElement(By.className("ui-selectonemenu"));// ctrl+2+l
		// Step:2 Instantiate Select class
		Select tools = new Select(drop1);
		// Call select class method to pick the option from dropdown
		// tools.selectByIndex(2);
		tools.selectByVisibleText("Puppeteer");
		// tools.selectByValue("ui-selectonemenu-label");
		// Not inside select
		Thread.sleep(2000);
		// find and click on the element
		driver.findElement(By.id("j_idt87:country_label")).click();
		Thread.sleep(2000);
		// from the drop down choose anyone valve
		driver.findElement(By.id("j_idt87:country_2")).click();

	}

}
