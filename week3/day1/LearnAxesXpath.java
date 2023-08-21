package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAxesXpath {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//p[@class='top']/input")).sendKeys("demosalesmanager");
	    driver.findElement(By.xpath("(//form[@id='login']//input)[2]")).sendKeys("crmsfa");
	    driver.findElement(By.xpath("(//label[text()='Username']/following::input)[3]")).click();
	}
	
}
