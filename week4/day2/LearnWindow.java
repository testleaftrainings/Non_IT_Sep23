package week4.day2;

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
        //click open
        driver.findElement(By.xpath("//span[text()='Open']")).click();
        //get the title
        System.out.println(driver.getTitle());
        String windowId = driver.getWindowHandle();
        System.out.println(windowId);//EFDBEC3BE243C8F632672E8FE08284B8
                                     //5F144FE28DEA1186356CBE738455D583
        //step1:    Get the window Handles
        Set<String> windowHandles = driver.getWindowHandles();   
        //step2:   Convert the set to list
        List<String>lstWindow =new ArrayList<String>(windowHandles);
        //step3: SwitchTo method 
        driver.switchTo().window(lstWindow.get(1));//child
       
        System.out.println(driver.getTitle());
        for (String string : lstWindow) {
        	driver.switchTo().window(string);
        	driver.close();
		}
        //close the current open window
       // driver.close();
        //switch back to the window
        //driver.switchTo().window(lstWindow.get(0));//parent
       
       // System.out.println(driver.getTitle());
       
        //need all the open window
        //driver.quit();
        
        
        
        
        
        
        
        
        
        
	}

}
