package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnMouseHover {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// find element
		WebElement men = driver.findElement(By.xpath("(//a[text()='Men'])[1]"));
		
		// Create object for Actions class
		Actions builder = new Actions(driver);
		
		builder.moveToElement(men).perform();
		Thread.sleep(2000);
		// Step1: Take a snapshot
		File source = driver.getScreenshotAs(OutputType.FILE);
		// Step2: Create folder to save the img file
		File target =new File("./snap/myntra.png");
		//Step3: Merge source and destination
		FileUtils.copyFile(source, target);

	}

}
