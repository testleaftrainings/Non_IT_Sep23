package week5.day2;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class LearnInvocationCount {
	@Test
	public void create() {
		System.out.println("CreateLead");
	}
	@Test(invocationCount =5,invocationTimeOut =1000,threadPoolSize =3)
	public void edit() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("EditLead");
	}
	
    @Test
	public void duplicate() {
		System.out.println("DuplicateLead");
	}


}
