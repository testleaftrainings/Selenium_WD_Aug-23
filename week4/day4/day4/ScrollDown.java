package week4.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollDown {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
		
		//find the element
		WebElement scroll = driver.findElement(By.xpath("//div[text()='Connect with Us']"));
		//create obj 
		Actions  builder =new Actions(driver);
		//scrollToElement
		builder.scrollToElement(scroll).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
