package week6.day2;

public class BMW extends Vehicle {
	String brakeSystem = "ABS";

	public BMW() {
		super("suv");
		System.out.println("BMW Constructor");
	}
	
	
	
	
	public void ApplyBrake() {
		super.ApplyBrake();
		System.out.println(super.brakeSystem);
		System.out.println(brakeSystem);
	}

	public static void main(String[] args) {
		BMW obj = new BMW();
		obj.ApplyBrake();

	}
}
