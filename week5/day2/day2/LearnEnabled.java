package week5.day2;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class LearnEnabled {
	@Test
	public void create() {
		System.out.println("CreateLead");
	}
	@Test(enabled = false)
	public void edit() {
		System.out.println("EditLead");
	}
	@Ignore
    @Test
	public void duplicate() {
		System.out.println("DuplicateLead");
	}


}
