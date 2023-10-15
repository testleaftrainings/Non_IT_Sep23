package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/select.xhtml");
		// Step:1 Locate the dropdown web element
		WebElement tools = driver.findElement(By.className("ui-selectonemenu"));
		// Step:2 Instantiate Select class
		Select drop1 = new Select(tools);
		// Step:3 Call select class method to pick the option from dropdown
		//drop1.selectByIndex(2);
		drop1.selectByVisibleText("Cypress");
		//drop1.selectByValue("ui-selectonemenu-label");
		
		//Not present under <Select tag>
		driver.findElement(By.id("j_idt87:country_label")).click();
		driver.findElement(By.id("j_idt87:country_3")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
