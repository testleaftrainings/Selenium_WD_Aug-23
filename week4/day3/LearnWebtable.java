package week4.day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebtable {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/dashboard.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//locate the table
		WebElement table = driver.findElement(By.xpath("//div[@id='j_idt154_content']/table"));

		// Row count
		List<WebElement> rowCount = table.findElements(By.tagName("tr"));
		// column count
		List<WebElement> columnCount = table.findElements(By.tagName("th"));
        //print row size
		System.out.println("Row Size :" + rowCount.size());
        //print column size
		System.out.println("column Count :" + columnCount.size());
		// print a specific data
		String text = driver.findElement(By.xpath("//div[@id='j_idt154_content']/table//tr[3]/td[3]")).getText();
		System.out.println(text);

		// dynamic value print all the values in table

		for (int i = 1; i < rowCount.size(); i++) {
			//print only row
		String text2 = driver.findElement(By.xpath("//div[@id='j_idt154_content']/table//tr[" + i + "]/td[1]")).getText();
			
			// System.out.println(text2);
           
		//print both row and column
			for (int j = 1; j < columnCount.size(); j++) {
				String text3 = driver.findElement(By.xpath("//div[@id='j_idt154_content']/table//tr[" + i + "]/td[" + j + "]")).getText();
				System.out.print(text3);

			}
		}
	}
}
