package week4.day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//switch the driver control
		driver.switchTo().frame(0);
		//click the element
		driver.findElement(By.id("Click")).click();
		//verification
		String text = driver.findElement(By.xpath("//button[text()='Hurray! You Clicked Me.']")).getText();
        System.out.println(text);
        //switch back to the main window
       driver.switchTo().defaultContent();
        //nested frame
        driver.switchTo().frame(2);//parent frame
        //webelement
        //WebElement nestedFrame = driver.findElement(By.id("frame2"));
        driver.switchTo().frame("frame2");//child frame
        driver.findElement(By.xpath("//button[text()='Click Me']")).click();
        //switch into immediate parent
        driver.switchTo().parentFrame();
        
       
        
        
        
        
	}

}
