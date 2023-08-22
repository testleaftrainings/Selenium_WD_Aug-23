package week3.day2;

public class LearnMethodOverLoading {

	public void add(int x,int y) {
       System.out.println(x+y);
	}

	public void add(int x,float y) {
		 System.out.println(x+y);
	}

	public void add(int x,int y,int z) {
		 System.out.println(x+y+z);
	}

	public static void main(String[] args) {
		LearnMethodOverLoading cal =new LearnMethodOverLoading();
		cal.add(10, 20);
		cal.add(10, 0.2f);
		cal.add(10, 20, 30);
	}

}
