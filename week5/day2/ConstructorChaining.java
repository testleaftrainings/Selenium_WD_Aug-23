package week5.day2;

public class ConstructorChaining {
	

	public ConstructorChaining() {
		System.out.println("Default Constructor");
	}

	public ConstructorChaining(int id) {
		this(10,"Ann","Testleaf");
		System.out.println("one parameter Constructor");
	}

	public ConstructorChaining(int id, String name) {
		this(1212);
		System.out.println("two parameter Constructor");
	}

	public ConstructorChaining(int id, String name, String cname) {
		this();
		System.out.println("three parameter Constructor");
	}

	public static void main(String[] args) {
		ConstructorChaining obj =new ConstructorChaining(10,"Dan");
	}

}
