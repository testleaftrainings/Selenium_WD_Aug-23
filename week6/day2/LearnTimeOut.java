package week6.day2;

import org.testng.annotations.Test;

public class LearnTimeOut {

	@Test(timeOut =1000 )
	public void createLead() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("CreateLead");
		
	}
	@Test
	public void editLead() {
		System.out.println("EditLead");
	}
	@Test
	public void duplicateLead() {
		System.out.println("DuplicateLead");
	}
}
