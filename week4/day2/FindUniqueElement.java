package week4.day2;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindUniqueElement {

	public static void main(String[] args) {
		Integer[] nums = { 1, 2, 3, 2, 4, 5, 1, 6, 8, 9, 4 };
		
		Set<Integer> setName = new LinkedHashSet<Integer>(Arrays.asList(nums));
		
		System.out.println(setName);

	}

}
