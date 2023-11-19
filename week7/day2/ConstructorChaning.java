package week6.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class ConstructorChaning {
	public ChromeDriver driver;
	int empId;
	String empName;

	public ConstructorChaning() {
		this(1009);
    System.out.println("No arg");
	}

	public ConstructorChaning(int num) {
		this(1600,"Vinoth",20000);
     System.out.println("one arg");
	}
	public ConstructorChaning(int empId, String empName, float salary) {
		this(1234,"Muthu");
		System.out.println("three arg");
	}

	public ConstructorChaning(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
		System.out.println("two arg");
	}

	public static void main(String[] args) {
		ConstructorChaning lt = new ConstructorChaning(11234);
		System.out.println(lt.empId);
		System.out.println(lt.empName);

	}

}
