package week4.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
  
	public static void main(String[] args) {
		Set<Integer> nums = new LinkedHashSet<Integer>();
		//add the element into set
		nums.add(10);
		nums.add(10);
		nums.add(2);
		nums.add(21);
		nums.add(2);
		nums.add(5);
		//nums.add(null);
		//nums.add(null);
		//print the set
		System.out.println(nums);
		System.out.println(nums.add(20));
		System.out.println(nums);
		//sort Tree set
		System.out.println(nums.size());
		//remove 
		System.out.println(nums.remove(10));
		
		//clear
		//nums.clear();
		System.out.println(nums);
		System.out.println(nums.contains(20));
		//forEach (Datatype   var :  input)
		
		for (Integer output : nums) {
			System.out.println(output);
		}
		//convert set into list
		List<Integer> lstName =new ArrayList<Integer>(nums);
		System.out.println(lstName);
	}

}
