package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Droppable {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml;jsessionid=node01h6qn4y6u7aeb175m2quvpqolw456494.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       //find the source element
		WebElement source = driver.findElement(By.id("form:drag_content"));
		//find the target element
		WebElement target = driver.findElement(By.id("form:drop_content"));
		//Create obj for actions
	    Actions builder =new Actions(driver);
	    //method
	    builder.dragAndDrop(source, target).perform();
	   
	   //verification
	    System.out.println(source.getText());
	     String cssValue = source.getCssValue("color");
	     System.out.println(cssValue);

}
}
