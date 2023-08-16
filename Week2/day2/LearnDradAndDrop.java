package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDradAndDrop {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.leafground.com/drag.xhtml");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    WebElement drag = driver.findElement(By.xpath("//span[text()='Drag me around']"));
	    Actions ac=new Actions(driver);
	    ac.dragAndDropBy(drag, 240, 0).perform();
	    
	    WebElement source = driver.findElement(By.xpath("//p[text()='Drag to target']"));
	    WebElement target = driver.findElement(By.xpath("//p[text()='Drop here']"));
		ac.dragAndDrop(source, target).perform();
		

	}

}
