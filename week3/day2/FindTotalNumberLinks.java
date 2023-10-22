package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindTotalNumberLinks {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		int size = links.size();
		System.out.println(size);
		
		for (int i = 0; i < size-1; i++) {
			String text = links.get(i).getText();
			System.out.println(text);
			
		}
		
		
	}

}
