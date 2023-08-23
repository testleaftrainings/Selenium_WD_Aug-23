package week3.day3;

public class AxisBank implements RBI {
	//own method
	public void eduLoan() {
		System.out.println("Minimum balance");
	}

	public void kyc() {
		System.out.println("Submit KYC");

	}

	public void withDraw() {

		System.out.println("Windraw is accept");

	}

	public void reporter() {

		System.out.println("Above 10l need to report");

	}
	public static void main(String[] args) {
		RBI obj =new AxisBank();
		obj.kyc();
		obj.loan();
		System.out.println(amount);
		
		
		
		AxisBank bank =new AxisBank();
		bank.kyc();
		bank.withDraw();
		bank.reporter();
		bank.eduLoan();//own method from Axis not from RBI
		System.out.println(RBI.amount);
		
	}

	public void loan() {
		// TODO Auto-generated method stub
		
	}

}
