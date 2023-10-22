package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {

		List<String> mentors=new ArrayList<String>();
		
		//index value-'0'
		//add()
		mentors.add("Aathi");
		mentors.add("Vinoth");
		mentors.add("Mukesh");
		mentors.add("Gokul");
		mentors.add("Muthu");
		mentors.add("Ranjini");
		
		System.out.println(mentors);
		
		//add my name 'dilip' in add index 4
		
		mentors.add(4, "Dilip");
		System.out.println(mentors);
		
		//size()
		
		int size = mentors.size();
		System.out.println("size of the list :"+size);
		
		System.out.println("*********************************");
		//get()
		for (int i = 0; i < size; i++) {
			System.out.println(mentors.get(i));
			
		}
		System.out.println("********************************");
		
		//contains
		
		boolean contains = mentors.contains("Vinoth");
		System.out.println("check data is present in th list :"+contains);
		
		//remove()
		mentors.remove(4);
		
		System.out.println(mentors);
		
		//sort
		Collections.sort(mentors);
		for (int i = 0; i < size-1; i++) {
			System.out.println("its sort order : "+mentors.get(i));
			
		}
		
		
		//clear
		mentors.clear();
		System.out.println(mentors);
		
		
		
	}

}
