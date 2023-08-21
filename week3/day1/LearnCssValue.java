package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnCssValue {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zoomcar.com/in/chennai");
		String cssValue =driver.findElement(By.xpath("//section[contains(text(),'GET CAR')]")).getCssValue("background-color");
        System.out.println(cssValue);
	}

}
