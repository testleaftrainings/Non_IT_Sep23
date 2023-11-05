package week5.day2;

import org.testng.annotations.Test;

public class LearnPriority {//ascii order c d e
	
	@Test
	public void create() {
		
		System.out.println("CreateLead");
	}
	@Test(priority = -1)
	public void edit() {
		System.out.println("EditLead");
	}
	@Test(priority = -1)
	public void duplicate() {
		System.out.println("DuplicateLead");
	}

}
