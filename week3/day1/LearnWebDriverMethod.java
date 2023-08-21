package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebDriverMethod {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/input.xhtml");
		//getTitle
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.contains("Input")) {
			System.out.println("The page is loaded");
		}
		else {
			System.out.println("The page is not loaded");
		}
		//getCurrentUrl
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//getPageSource
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		//getAttribute
		String value = driver.findElement(By.id("j_idt88:j_idt97")).getAttribute("value");
		
		System.out.println(value);
		
		
		

	}

}
