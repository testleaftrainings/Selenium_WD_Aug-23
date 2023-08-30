package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnMouseHover {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       //find the element
		WebElement makeUp = driver.findElement(By.xpath("(//a[text()='makeup'])[2]"));
		//Create obj for actions
	    Actions builder =new Actions(driver);
	    //method
	    builder.moveToElement(makeUp).perform();
	
	
	}

}
