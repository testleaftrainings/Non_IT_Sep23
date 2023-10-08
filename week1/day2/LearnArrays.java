package week1.day2;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		//Using Array Literal 
		int[] nums = {10,2,30,4,50};
		
		//Using Instantiation
		int[] arr =new int[5];
		//Array index start from 0
		arr[0]=90;
		arr[1]=56;
		arr[2]=67;
		arr[3]=76;
		arr[4]=86;
		//arr[5]=90;
		
		//To get the length of my array
		
		//start from 1 to num
		int len = nums.length;  //assign the local var
		
		System.out.println(len);//5
		
		//Arrange the array
		Arrays.sort(nums);
	
		for (int i = 0; i <nums.length ; i++) {
			System.out.println(nums[i]);
		}
		
		//last value of array
		System.out.println(nums[nums.length-1]);
		
		//what is the second largest num

		System.out.println(nums[len-2]);
		
		System.out.println("Reverse the array");
		
		for (int i = nums.length-1; i >=0; i--) {
			
			System.out.println(nums[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
