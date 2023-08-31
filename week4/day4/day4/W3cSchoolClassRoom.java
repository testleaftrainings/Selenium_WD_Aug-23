package week4.day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3cSchoolClassRoom {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//handle the frame
		driver.switchTo().frame("iframeResult");
		//click Try it
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		//handle the alert
		Alert alert = driver.switchTo().alert();
		alert.accept();
		//print the output text
		String text = driver.findElement(By.id("demo")).getText();
		System.out.println(text);
		
		
		

	}

}
