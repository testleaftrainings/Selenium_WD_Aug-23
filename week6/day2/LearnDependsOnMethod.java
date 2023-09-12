package week6.day2;

import org.testng.annotations.Test;

public class LearnDependsOnMethod {//c d e
	
	@Test
	public void createLead() {
		System.out.println("CreateLead");
		throw new RuntimeException();
	}
	//@Test(dependsOnMethods ="week6.day1.CreateLead.runCreateLead")
	@Test(dependsOnMethods ="createLead",alwaysRun = true )
	public void editLead() {
		System.out.println("EditLead");
	}
	@Test
	public void duplicateLead() {
		System.out.println("DuplicateLead");
	}

}
