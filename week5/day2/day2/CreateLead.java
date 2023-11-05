package week5.day2;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class CreateLead extends ProjectSpecificMethod {
 @Test(dataProvider ="fetchData" , timeOut = 2000)
	public  void runCreateLead(String cname,String fname,String lname,String pnum) {
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(pnum);
		driver.findElement(By.name("submitButton")).click();
		
}
 @DataProvider(name="fetchData")
 public String[][] getData() {
	 String[][] data =new String[2][4];
	 
	 //1st set of data
	 data[0][0]="Qeagle";
	 data[0][1]="princila";
	 data[0][2]="Edward";
	 data[0][3]="9845090338";
	 
		/*
		 * //2nd set of data data[1][0]="TCS"; data[1][1]="Divya";
		 * data[1][2]="dhanasekaran"; data[1][3]="9845674356"; return data;
		 */
	 return data;
 }
 
}






