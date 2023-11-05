package week5.day2;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class LearnTimeOut {
	@Test
	public void create() {
		System.out.println("CreateLead");
	}
	@Test(enabled = false)
	public void edit() {
		System.out.println("EditLead");
	}
	
    @Test(timeOut = 1000)
	public void duplicate() throws InterruptedException {
    	Thread.sleep(2000);
		System.out.println("DuplicateLead");
	}


}
