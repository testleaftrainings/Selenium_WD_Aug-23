package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) {
	    ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.leafground.com/dashboard.xhtml");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    
	    WebElement table = driver.findElement(By.xpath("//div[@class='ui-panel-content ui-widget-content']/table/tbody"));
	    //from table ->get the row count
	    List<WebElement> row = table.findElements(By.tagName("tr"));
	    System.out.println(row.size());
	    
	    List<WebElement> col = row.get(1).findElements(By.tagName("td"));
	    System.out.println(col.size());
	    
	    //table-->tbody-->tr-->td
	    
	    
	    //to retreive the data from 1st row 2nd col data
/*
	    WebElement singleData = driver.findElement(By.xpath("//div[@class='ui-panel-content ui-widget-content']/table/tbody/tr[1]/td[2]"));
	    System.out.println(singleData.getText());
	    
	    //how to get the one row and all col data -Method-1
	    for (WebElement oneRowallCol : col) {
			System.out.println(oneRowallCol.getText());
		}
	    
	    System.out.println("Method 2-1st row  All col values " );
	    //method-2
	    for(int i=1;i<col.size();i++) {
		    String text = driver.findElement(By.xpath("//div[@class='ui-panel-content ui-widget-content']/table/tbody/tr[1]/td["+i+"]")).getText();
            //tr[1]/td[1]
		    //tr[1]/td[2]
		    //ttr[1]/td[3]
		    System.out.println(text);
	    }
	    
	    
	    //to get the data from the 2nd col and all rows
	    System.out.println("2nd col all row Values");
	    for(int i=1;i<row.size();i++) {
		    String text = 
		   driver.findElement(By.xpath("//div[@class='ui-panel-content ui-widget-content']/table/tbody/tr["+i+"]/td[2]")).getText();
		    System.out.println(text);
	    }
	    
	    */
	    System.out.println("Retreiving all values in the table");
	    for (WebElement allValues : col) {
	    	System.out.println(allValues.getText());
			
		}
	    
	    System.out.println("Method-2 Retreiving all values in the table");
	    for(int i=1;i<row.size();i++) {
	    	for(int j=1;j<col.size();j++) {
		    String text = 
		   driver.findElement(By.xpath("//div[@class='ui-panel-content ui-widget-content']/table/tbody/tr["+i+"]/td["+j+"]")).getText();
		    System.out.print(text + " ");
	    }
	    	System.out.println();
	    }
	    
	}

}
