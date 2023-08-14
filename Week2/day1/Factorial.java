package week2.day1;

public class Factorial {

	public static void main(String[] args) {
		//
		int input =5;//5*4*3*2*1
		int fact = 1;
		for (int i = 1; i <=input; i++) {
			fact=i*fact;//1*1 =1   2*1=2   3*2=6   4*6=24 5*24=120
			System.out.println(fact);
		}

	}

}

//145 
//1! 
//1+24+120=145