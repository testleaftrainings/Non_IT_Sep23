package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWait {

	public static void main(String[] args) {
	ChromeDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://login.salesforce.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.id("username")).sendKeys("princilaroseline.edward@testleaf.com");
	driver.findElement(By.id("password")).sendKeys("Princy@123");
	driver.findElement(By.id("Login")).click();
    driver.findElement(By.className("slds-icon-waffle")).click();
    System.out.println(driver.getTitle());
	}

}
