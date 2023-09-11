package week6.day1;

import org.testng.annotations.Test;

public class LearnPriority {//ascii order cde
	@Test(priority = 1)//0 0 1
	public void createLead() {
		System.out.println("CreateLead");
	}
	@Test(priority = -1)
	public void editLead() {
		System.out.println("EditLead");
	}
	@Test
	public void duplicateLead() {
		System.out.println("DuplicateLead");
	}

}
