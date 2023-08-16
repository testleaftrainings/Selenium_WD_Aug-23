package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnScreenShot {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.switchTo().frame(0);

		WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
	   //ScreenShot two ways
		//complete webpage
		//particular element
		//complete webpage
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		//set the path to store the img file		
		File destn=new File("./snap/pic.jpg");
	    //./ -->current directory
		//snap-->folder
		//pic.jpg -->imagefile
		//java library
		FileUtils.copyFile(screenshotAs, destn);
	//to see the screenshot -->refresh the project 
	
		//to get the screenshot of a particular ele -->webElement.getScrenshotAs()
		File snap = item1.getScreenshotAs(OutputType.FILE);
		//set the path to store the img file		
		File shot=new File("./snap/pic1.jpg");
	    //./ -->current directory
		//snap-->folder
		//pic.jpg -->imagefile
		//java library
		FileUtils.copyFile(snap, shot);
		
		
		
	}

}
