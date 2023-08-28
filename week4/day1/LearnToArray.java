package week4.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LearnToArray {

	public static void main(String[] args) {
		int[] nums = {1,2,4,2,4,5,6,7};
		//Integer[] nums={1,2,4,2,4,5,6,7};
		//List<Integer> lstName =new ArrayList<Integer>(Arrays.asList(nums));
		List<Integer> lstName =new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
        	lstName.add(nums[i]);
		}
        System.out.println(lstName);
        Object[] array = lstName.toArray();
       for (int i = 0; i < array.length; i++) {
		System.out.println(array[i]);
	}
	}

}
