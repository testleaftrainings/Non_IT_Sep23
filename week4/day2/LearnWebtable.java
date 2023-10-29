package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebtable {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/dashboard.xhtml");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Step:1 Identify the table in the dom using <table>
        WebElement table = driver.findElement(By.xpath("//div[@id='j_idt154_content']/table"));
        //row count <tr>
        List<WebElement> rowCount = table.findElements(By.tagName("tr"));
        System.out.println("Row Count"+rowCount.size());
        //column count
        List<WebElement> columnCount = table.findElements(By.tagName("th"));
        System.out.println("ColumnCount"+columnCount.size());
        System.out.println(rowCount.get(1).getText());
        
        //print  the particular data
        String text = driver.findElement(By.xpath("//div[@id='j_idt154_content']/table//tr[3]/td[3]")).getText();
        System.out.println(text);
        
        for (int i = 1; i <rowCount.size() ; i++) {
        	 for (int j = 1; j <columnCount.size() ; j++) {
			String country = driver.findElement(By.xpath("//div[@id='j_idt154_content']/table//tr["+i+"]/td["+j+"]")).getText();
		     System.out.println(country);
        }
        
        
        
        
        
        }    
        
        
        
	}

}
