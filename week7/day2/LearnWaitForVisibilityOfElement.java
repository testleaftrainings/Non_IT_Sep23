package week6.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWaitForVisibilityOfElement {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.leafground.com/waits.xhtml");
		//find the element to click
		WebElement visible = driver.findElement(By.xpath("(//span[text()='Click'])[1]"));
		visible.click();
		//wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement ele = driver.findElement(By.xpath("//span[text()='I am here']"));
		wait.until(ExpectedConditions.visibilityOf(ele));
		//verify
		String text = driver.findElement(By.xpath("//span[text()='I am here']")).getText();
		System.out.println(text);

	}

}
