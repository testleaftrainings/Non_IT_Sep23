package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Draggable
		//find the source
		WebElement drag = driver.findElement(By.id("form:conpnl_header"));
		Point location = drag.getLocation();
		System.out.println(location.getX());
		Actions builder =new Actions(driver);
		builder.dragAndDropBy(drag, 100, 50).perform();
		//verify
		System.out.println(drag.getLocation().getX());
		
		//Droppable
       //Find source
		WebElement source = driver.findElement(By.xpath("//div[@id='form:drag_content']"));
		//find destin
		WebElement des = driver.findElement(By.xpath("//div[@id='form:drop_header']"));
		//create  object for Actions class
		
		builder.dragAndDrop(source, des).perform();
		 //verify
		System.out.println(des.getCssValue("background-color"));
		
		
		
		
		
		
		
		

	}

}
