package week4.day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//click show button
		driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
		//handle the alert
		Alert alert = driver.switchTo().alert();//ctrl+2
		//print the message from alert box
		//String text = alert.getText();
		System.out.println(alert.getText());
		
		//Action going to perform
		alert.accept();
		//verification
		String text = driver.findElement(By.id("simple_result")).getText();
        System.out.println(text);
        //confirmation
        driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
        //handle the alert
        Alert alert2 = driver.switchTo().alert();
        //print the message from alert box
        System.out.println(alert2.getText());
        ////Action going to perform
        alert2.dismiss();
        //verification
        String text2 = driver.findElement(By.id("result")).getText();
        System.out.println(text2);
       
       //prompt dialog
        driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
        //switch the driver control
        Alert alert3 = driver.switchTo().alert();
        //print the alert msg
        System.out.println(alert3.getText());
        //pass the input to the dialog
        alert3.sendKeys("Testleaf");
        //action to perform
        alert3.dismiss();
        //verify the text
        WebElement msg = driver.findElement(By.id("confirm_result"));
        System.out.println(msg.getText());
        
        
	}

}
