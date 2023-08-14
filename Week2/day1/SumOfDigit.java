package week2.day1;

public class SumOfDigit {

	public static void main(String[] args) {
		int input=123;
		int sum = 0;
		int temp=input;
		int num=0;
		while(input>0) {
			
			//find the last digit 3 2 1
			num=input%10;
			
			//remove last number from the input
			input=input/10;

			//add the digit
			sum=sum+num;			
						
		}
		System.out.println(sum);

	}

}
