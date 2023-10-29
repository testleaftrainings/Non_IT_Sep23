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

public class ScrollDown {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// find the element
		WebElement scroll = driver.findElement(By.xpath("//div[text()='Connect with Us']"));
		Actions builder = new Actions(driver);
		builder.scrollToElement(scroll).perform();
		// Step1: Take a snapshot
		File source = driver.getScreenshotAs(OutputType.FILE);
		// Step2: Create folder to save the img file
		File target = new File("./snap/amazon.png");
		// Step3: Merge source and destination
		FileUtils.copyFile(source, target);

	}

}
