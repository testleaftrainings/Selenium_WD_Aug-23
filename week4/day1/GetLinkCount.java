package week4.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLinkCount {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.leafground.com/link.xhtml");
		driver.manage().window().maximize();
		//get the links count
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		//print <a> text
		List<WebElement> textOfaTag = driver.findElements(By.xpath("//div[@class='col-12']/a"));
        for (int i = 0; i <textOfaTag.size() ; i++) {
        	System.out.println(textOfaTag.get(i).getText());
		} 
		
	}

}
