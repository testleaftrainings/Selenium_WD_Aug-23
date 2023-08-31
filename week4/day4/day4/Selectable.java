package week4.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 

		//handle the frame
		driver.switchTo().frame(0);
		//find element
		WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement item2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
		WebElement item3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
		WebElement item5 = driver.findElement(By.xpath("//li[text()='Item 5']"));
		WebElement item6 = driver.findElement(By.xpath("//li[text()='Item 6']"));
		//
		Actions builder =new Actions(driver);
		//builder.click(item1).click(item3).click(item6).perform();
		
		//keys action
		builder.keyDown(Keys.CONTROL)
		.click(item1)
		.click(item3)
		.click(item5)
		.keyUp(Keys.CONTROL)
        .perform();		
		builder.clickAndHold(item1).moveToElement(item6).release().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
