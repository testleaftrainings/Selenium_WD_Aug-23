package week1.day2;

public class LearnOperators {
	
	public static void main(String[] args) {
		int a=5,b=5;
		//Arithmetic operator
		System.out.println(a+b);
		System.out.println(5-5);
		System.out.println(5*5);
		System.out.println(5/5);
		System.out.println(5%5);
		
	   //Assignment operators:
		int num1=1;
		int num2=10;
		System.out.println(num1=num2);
		num1+=10;
		num1=num1+10;
		//Comparison operators
		
		int x=10;
		int y=20;
		System.out.println(x>y);
		System.out.println(x<y);
		System.out.println(x>=y);
		System.out.println(x<=y);
		System.out.println(x!=y);
		System.out.println(x==y);
		
		//Logical operators:
		//AND
		System.out.println( (x!=y) && (x<=y));
		//OR
		System.out.println( (x!=y) || (x==y));
		//NOT
		System.out.println(!(x!=y));
		
		
		//Increment operator
		
		System.out.println(x);
		//post increment
		System.out.println(x++);
		System.out.println(x);
		//pre increment
		System.out.println(++x);
		
		
		//Decrement
		System.out.println(x--);
		System.out.println(x);
		System.out.println(--x);
		
		
		
	}

}
