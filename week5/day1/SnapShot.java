package week5.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapShot {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//input bag in search box
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bags",Keys.ENTER);
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
		//set
		Set<String> windowHandles = driver.getWindowHandles();
		//convert set into list
		List<String> lstWindow=new ArrayList<String>(windowHandles);
		//transfer driver control
		driver.switchTo().window(lstWindow.get(1));
		
		//take a snap
		File source = driver.getScreenshotAs(OutputType.FILE);//ctrl+2+l
		//create a folder
		File Target =new File("./snap/amazon.png");
		//Merge source and target
		FileUtils.copyFile(source, Target);
		

	}

}
