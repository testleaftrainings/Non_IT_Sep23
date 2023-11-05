package week5.day2;

import javax.management.RuntimeErrorException;

import org.testng.annotations.Test;

public class LearnDependsOnMethod {//ascii order c d e
	@Test
	public void create() {
		System.out.println("CreateLead");
		throw new RuntimeException();
	}
	@Test(dependsOnMethods = {"create","duplicate"},alwaysRun = true)
	public void edit() {
		System.out.println("EditLead");
	}
	@Test(dependsOnMethods = "week5.day1.CreateLead.runCreateLead")
	public void duplicate() {
		System.out.println("DuplicateLead");
	}

}
