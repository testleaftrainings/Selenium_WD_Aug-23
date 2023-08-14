package week2.day1;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		int[] marks= {89,78,99,98,65};//length start from 1 
		
		int[] nums=new int[3];
		nums[0]=10;//index start from
		nums[1]=30;
		nums[2]=40;
		
		//to get the length
		 int len = marks.length;
		 System.out.println(len);
		 //print my array
		 for (int i = 0; i < marks.length; i++) {
			 System.out.println(marks[i]);
		}
		 //arrange my array
		 Arrays.sort(marks);
		 System.out.println("Order result");
		 for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}
		 //reverse order
		for (int i =marks.length-1; i >=0; i--) {
			System.out.println(marks[i]);
		}
    //99  98 45 67 87          5 // 45 67 87 98 99 4
		//first element
		System.out.println("First Element"+marks[0]);
		//last element
		System.out.println(marks[len-1]);
		//second large   
		System.out.println(marks[len-2]);//5  3
	}

}
