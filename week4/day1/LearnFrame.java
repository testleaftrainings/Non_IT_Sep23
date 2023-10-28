package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) {
		 ChromeDriver driver =new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.leafground.com/frame.xhtml");
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         //switch the driver 
         driver.switchTo().frame(0);
         driver.findElement(By.xpath("(//button[text()='Click Me'])[1]")).click();
         //verification
         String text = driver.findElement(By.id("Click")).getText();
         System.out.println(text);
         //switch back to main window
         driver.switchTo().defaultContent();
         //nested frame
         driver.switchTo().frame(2);//parent 
         //driver.switchTo().frame("frame2");
         //webelement
         WebElement frame = driver.findElement(By.xpath("//iframe[@id='frame2']"));
         driver.switchTo().frame(frame);//child
         
         driver.findElement(By.xpath("//button[text()='Click Me']")).click();
         //switch back to immediate parent
         driver.switchTo().parentFrame();

	}

}
