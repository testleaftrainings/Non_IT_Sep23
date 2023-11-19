package week6.day2;

public class LearnStatic {
	int empId;
	static String empName;
	static float balance;
	
	
	public static void empDetails() {
		System.out.println(empName);
		
	}
	public void studentDetails() {
		
	}
	

	public static void main(String[] args) {
		LearnStatic obj = new LearnStatic();
		System.out.println(obj.empId);//Non Static
		System.out.println(empName);//Static reference
		System.out.println(balance);
		empDetails();//Static
		obj.studentDetails();//non Static
	}

}
