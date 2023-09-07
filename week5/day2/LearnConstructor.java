package week5.day2;

public class LearnConstructor {
	int x;
	String name;
	boolean flag;
	
	public LearnConstructor() {
		System.out.println("default Constructor");
	}
	
	public LearnConstructor(int x) {
		System.out.println("One parameterized constructor");
	}
	public LearnConstructor(int x,String name) {
		System.out.println("Two parameterized constructor");
	}
	
	public void name() {
		
	}
	
	
	

	public static void main(String[] args) {
		LearnConstructor obj =new LearnConstructor(10,"Testleaf");
		System.out.println(obj.flag);
		System.out.println(obj.name);
		System.out.println(obj.x);

	}

}
