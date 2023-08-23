package week3.day3;

public class LearnStatic {

	static int num = 10;

	String name = "Testleaf";
	//Staic  method
	public static void ccNum() {
	System.out.println(num);
	}
	//NonStatic method
	public void cvvNum() {
		
	}


	public static void main(String[] args) {
		LearnStatic obj = new LearnStatic();

		System.out.println(num);

		System.out.println(obj.name);
		
		ccNum();//static method
		obj.cvvNum();//NonStatic method

	}

}
