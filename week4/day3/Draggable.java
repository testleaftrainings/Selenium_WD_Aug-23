package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draggable {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml;jsessionid=node01h6qn4y6u7aeb175m2quvpqolw456494.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       //find the element
		WebElement drag = driver.findElement(By.id("form:conpnl_content"));
		
		Point location = drag.getLocation();
		System.out.println(drag.getLocation());
		//Create obj for actions
	    Actions builder =new Actions(driver);
	    //Actions method
	    builder.dragAndDropBy(drag, 100, 50).perform();
	   
	    //Verify the location
	    System.out.println(drag.getLocation());
	
	}

}
