package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

	public static void main(String[] args) throws InterruptedException {
		// set up the driver path and launch the chromeDriver
		ChromeDriver driver =new ChromeDriver();
		//EdgeDriver driver = new EdgeDriver();
		// maximize my window
		driver.manage().window().maximize();
		// Load the url
		driver.get("http://leaftaps.com/opentaps/control/login");
        //wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// find the element and enter the username
		Thread.sleep(2000);//this has to be applied wherever need we can use
		//it will wait till the end of the time limit
		driver.findElement(By.xpath("//label[@for='username']/following-sibling::input")).sendKeys("demosalesmanager");
		
		// find the element and enter the password
		driver.findElement(By.xpath("//label[@for='password']/following-sibling::input")).sendKeys("crmsfa");
		// find the element and click on login button
		
		driver.findElement(By.xpath("//label[text()='Username']/following::input[3]")).click();

	}

}
