package week1.day2;

import java.util.Arrays;

public class PrintDuplicate {

	public static void main(String[] args) {
		int[] num={2, 5, 7, 7, 5, 9, 2, 3};//2 5 7
		//2 2 3 5 5 7 7 9
		Arrays.sort(num);
        
		for (int i = 0; i < num.length-1; i++) {//nums[0]
        	
        	if(num[i]==num[i+1]) {// 2 3
        		
        		System.out.println(num[i]);
        	}
        	
			
		}
	}

}
