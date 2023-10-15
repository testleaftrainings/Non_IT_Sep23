package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDownUsingSelectClass {

	public static void main(String[] args) {
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
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");

		// find the element and enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// find the element and click on login button
		driver.findElement(By.className("decorativeSubmit")).click();
		// verification
		// to get the title of the webpage
		String title = driver.getTitle();// ctrl+2
		System.out.println(title);
		// find the element then click on crmsfa
		// driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		// to get the title of the webpage
		String leadPage = driver.getTitle();// ctrl+2
		System.out.println(leadPage);
		//click on lead button
		driver.findElement(By.linkText("Leads")).click();
		//click on createLead button
		driver.findElement(By.linkText("Create Lead")).click();
		//Enter the company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf",Keys.ENTER);
		//Enter the firstname
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Princila");
		//Enter the lastname
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Edward");
		//How to handle the drop down
		//Step:1  Locate the dropdown web element
        WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		//Step:2  Instantiate Select class
        Select drop1 =new Select(source);
		//Step:3  Call select class method to pick the option from    dropdown
        drop1.selectByValue("LEAD_CONFERENCE");
	
		//click createlead button
		driver.findElement(By.name("submitButton")).click();
		//verification
		//to retrive the text from dom page
		String firstName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		
		System.out.println(firstName);
		
		if(firstName.contains("Princila")) {
			System.out.println("The Lead is created");
		}
		else {
			System.out.println("The Lead is not created");
		}
		//return type of findElement
		//WebElement findElement = driver.findElement(By.name("submitButton"));
		
		
		// Close the open browser
		 driver.close();

	}

}
