package week4.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetDropdownvalues  {

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
		//Print all value from dropdown
		List<WebElement> options = tools.getOptions();
		for (int i = 0; i <options.size(); i++) {
			System.out.println(options.get(i).getText());
		}

	}

}
