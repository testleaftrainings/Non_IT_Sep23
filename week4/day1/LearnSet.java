package week4.day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		Set<Integer> nums =new LinkedHashSet<Integer>();
		nums.add(12);
		nums.add(11);
		nums.add(12);
		nums.add(11);
		nums.add(14);
		nums.add(16);
		nums.add(8);
		//set 
		System.out.println(nums);
		//count
		System.out.println(nums.size());
		System.out.println(nums.remove(11));
		System.out.println(nums);
		System.out.println(nums.contains(11));
		//nums.clear();
		System.out.println(nums);
		System.out.println(nums.isEmpty());
		
		//for each
		for (Integer output : nums) {
			System.out.println(output);
		}
		
		List<Integer> lst =new ArrayList<Integer>(nums);
		System.out.println(lst);
		for (int i =lst.size()-1; i>=0; i--) {
			System.out.println(lst.get(i));
		}
		
		
	}

}
