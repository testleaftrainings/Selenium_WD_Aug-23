package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindow {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println(driver.getTitle());
		//click open
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		//verification
		System.out.println(driver.getTitle());
		//current open window address
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);//7B868808FA281905FB9486CAB30936D7
		//3BC2180B61BD83D0E3CE9691D990B423
		
		//step 1:getWindowHandles()
		Set<String> windowHandles = driver.getWindowHandles();
		
		//step 2: create list and convert set into list
		List<String> lstWindow =new ArrayList<String>(windowHandles);
		
		//Transfer the driver control
		driver.switchTo().window(lstWindow.get(1));
		
		
		//verify
		System.out.println(driver.getTitle());
		//close the current open window
		driver.close();
		//switch back by parent window name
		//driver.switchTo().window(windowHandle);
		driver.switchTo().window(lstWindow.get(0));
		System.out.println(driver.getTitle());
		
		//close all open window
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		

	}

}
