package week4.day1;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
	String name="TesTleaf";
	//output is  Testlaf
	//convert string into char
	char[] charArray = name.toCharArray();
	
	//create Characterset
	Set <Character> uniqueSet=new LinkedHashSet<Character>();
	for (int i = 0; i < charArray.length; i++) {
		uniqueSet.add(charArray[i]);
		System.out.println(uniqueSet);
	}
	
	

	}

}
