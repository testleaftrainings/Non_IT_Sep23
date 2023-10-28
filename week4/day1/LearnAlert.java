package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {
	
	public static void main(String[] args) {
                ChromeDriver driver =new ChromeDriver();
                driver.manage().window().maximize();
                driver.get("https://www.leafground.com/alert.xhtml");
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                //simple alert
                driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
                //Transfer you driver focus
                Alert alert = driver.switchTo().alert();//ctrl+2+l
                //getText from the alert box
                String msg = alert.getText();
                System.out.println(msg);
                //To accept the alert
               alert.accept();
                //verification
                String text = driver.findElement(By.id("simple_result")).getText();
                System.out.println(text);
                //confirm alert
                driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
                //switch the driver
                Alert alert2 = driver.switchTo().alert();
                System.out.println(alert2.getText());
                //dismiss
                alert2.dismiss();
            
                //Prompt Dialog
        		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
        		//switch the control to the alert
        		Alert prompt = driver.switchTo().alert();
        		//Pass the input data to the input box
        		prompt.sendKeys("Testleaf");
        		//get the text from the pop up
        		System.out.println(prompt.getText());
        		//To accept the alert
        		prompt.accept();
        		//verify the alert
        		String text3 = driver.findElement(By.id("confirm_result")).getText();
        		System.out.println(text3);
                
                
                
                
                
                
                
                
                
                
                
                
	}
}
