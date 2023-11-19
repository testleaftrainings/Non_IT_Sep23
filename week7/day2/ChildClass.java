package week6.day2;

import week6.day1.ReadExcel;

public class ChildClass extends LearnStatic {
	static {
		System.out.println("Hello Testleaf");
	}
	public void run() {
		
	}
public void studentDetails() {
		
	}
	
	public static void main(String[] args) {
		LearnStatic obj =new LearnStatic();
		//static 
		System.out.println(LearnStatic.balance);
		LearnStatic.empDetails();
		
	}

}
