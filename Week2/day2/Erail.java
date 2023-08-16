package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail {

	public static void main(String[] args) {
			
		
		 ChromeDriver driver=new ChromeDriver();
		    driver.get("https://erail.in/");
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    
		    WebElement from = driver.findElement(By.id("txtStationFrom"));
		    from.clear();
		    from.sendKeys("MAS" ,Keys.ENTER);
		    WebElement to = driver.findElement(By.id("txtStationTo"));
		    to.clear();
		    to.sendKeys("CBE",Keys.ENTER);
		    
		    
			driver.findElement(By.id("chkSelectDateOnly")).click();

			driver.findElement(By.id("buttonFromTo")).click();

			WebElement table = driver
					.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']"));

			List<WebElement> row = table.findElements(By.tagName("tr"));
			System.out.println(row.size());

			
			 System.out.println("TrainNames");
			//one single col data
				List<WebElement> SecondColallData = driver.findElements(
						By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//td[2]"));
				for (WebElement ColValues : SecondColallData) {
					System.out.println(ColValues.getText());
				}
			
			
	
	}

}
