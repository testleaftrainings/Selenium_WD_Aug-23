package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearntOhover {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.myntra.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    WebElement men = driver.findElement(By.xpath("(//a[text()='Men'])[2]"));
	   //  WebElement tshirt = driver.findElement(By.xpath("//a[text()='T-Shirts']"));

		
		  //Advanced User Interactions
	    Actions act=new Actions(driver); 
	    //hover on an element
		//  act.moveToElement(men).perform();
        act.scrollByAmount(0, 300).perform(); //scroll from top to bottom
        act.scrollByAmount(0, -300).perform();//scroll from bottom to top

	    //x->horizontal scrolling
        //y->vertical scrolling 
        
	    //MoveOutOfTargetException
		
		
		
		
		
	}

}
