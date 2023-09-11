package week6.day1;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class LearnInvocationCount {
	
	@Test(invocationCount = 5,threadPoolSize = 3)
	public void createLead() {
		System.out.println("CreateLead");
	}
	@Test(enabled = false)
	public void editLead() {
		System.out.println("EditLead");
	}
	@Test
	public void duplicateLead() {
		System.out.println("DuplicateLead");
	}

}
