package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnTORightClick {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.leafground.com/menu.xhtml");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	WebElement customer = driver.findElement(By.xpath("//span[text()='Customers']"));
	
	Actions ac=new Actions(driver);
	//to do rightClick
	ac.contextClick(customer).perform();
	
	
	
	
	
	}

}
