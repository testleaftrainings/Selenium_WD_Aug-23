package week2.day1;

public class LearnMethod {

	
	public void soundHorn() {
		System.out.println("Sound Horn");
		
	}
	protected String brandName(String name,int model) {
		
		System.out.println(name+model);
		return name;
		
	}
	private void applyBreak() {

		System.out.println("apply break");


	}
	boolean isPuncture(boolean var) {
		System.out.println(var);
		return var;
	}
	
	public static void main(String[] args) {
		
		LearnMethod obj =new LearnMethod();
		obj.applyBreak();
		obj.brandName("Honda", 1234);
		obj.isPuncture(true);
		obj.soundHorn();
	}

}
