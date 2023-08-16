package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnToDubleClick {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.leafground.com/dashboard.xhtml");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    

	    WebElement message = driver.findElement(By.xpath("//label[text()='Message']"));
	    
	    Actions ac=new Actions(driver);
	    ac.doubleClick(message).perform();
	    
	}

}
