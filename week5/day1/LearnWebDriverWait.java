package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWebDriverWait {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//click open with delay
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		//create obj for WebDriverWait
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String>lstWindow =new ArrayList<String>(windowHandles);
		driver.switchTo().window(lstWindow.get(2));
		System.out.println(driver.getTitle());

	}

}
